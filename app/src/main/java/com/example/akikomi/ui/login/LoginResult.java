package com.example.akikomi.ui.login;

import androidx.annotation.Nullable;

/**
 * Authentication result : success (user details) or error message.
 */
public class LoginResult {
    @Nullable
    private com.example.akikomi.ui.login.LoggedInUserView success;
    @Nullable
    private Integer error;

    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    LoginResult(@Nullable com.example.akikomi.ui.login.LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    public com.example.akikomi.ui.login.LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    public Integer getError() {
        return error;
    }
}
