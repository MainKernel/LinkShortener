package com.applink.app.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String token;
    private LoginError loginError;

    public static LoginResponse success(String token){
        return LoginResponse.builder().token(token).loginError(LoginError.success).build();
    }

    public static LoginResponse failure(){
        return LoginResponse.builder().token(null).loginError(LoginError.badCredentials).build();
    }

    public enum LoginError {
        success,
        badCredentials
    }
}
