package com.sh.loginapi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sh.loginapi.api.ApiService;
import com.sh.loginapi.api.RetrofitClient;
import com.sh.loginapi.model.LoginRequest;
import com.sh.loginapi.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        EditText edtUsername = this.findViewById(R.id.edtUsername);
        EditText edtPassword = this.findViewById(R.id.edtPassword);
        TextView tvResponse = this.findViewById(R.id.tvResponse);
        Button btnLogin = this.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String username = edtUsername.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please fill out to all field", Toast.LENGTH_SHORT).show();
            } else {
                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setUserNameOrEmailAddress(username);
                loginRequest.setPassword(password);

                Call<LoginResponse> callLogin = apiService.login(loginRequest);
                callLogin.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.isSuccessful() && response.body() != null && response.code() == 200) {
                            LoginResponse loginResponse = response.body();
                            int userId = loginResponse.getResult().getUserId();
                            tvResponse.setText("Thành công\nUsername = " + username + "    UserId = " + userId);
                        } else {
                            tvResponse.setText("Không thành công\nThông tin: Đăng nhập thất bại! Sai tên truy cập hoặc mật khẩu");
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        tvResponse.setText("Không thành công\nThông tin: Đăng nhập thất bại! Sai tên truy cập hoặc mật khẩu");
                    }
                });
            }
        });

    }

}
