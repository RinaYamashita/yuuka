package com.example.akikomi.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import com.example.akikomi.data.LoginRepository;
import com.example.akikomi.data.Result;
import com.example.akikomi.data.model.LoggedInUser;
import com.example.akikomi.R;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<com.example.akikomi.ui.login.LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<com.example.akikomi.ui.login.LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public LiveData<com.example.akikomi.ui.login.LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    public LiveData<com.example.akikomi.ui.login.LoginResult> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password) {
        // can be launched in a separate asynchronous job
        Result<LoggedInUser> result = loginRepository.login(username, password);

        if (result instanceof Result.Success) {
            LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
            loginResult.setValue(new com.example.akikomi.ui.login.LoginResult(new com.example.akikomi.ui.login.LoggedInUserView(data.getDisplayName())));
        } else {
            loginResult.setValue(new com.example.akikomi.ui.login.LoginResult(R.string.login_failed));
        }
    }

    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new com.example.akikomi.ui.login.LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new com.example.akikomi.ui.login.LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new com.example.akikomi.ui.login.LoginFormState(true));
        }
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}
