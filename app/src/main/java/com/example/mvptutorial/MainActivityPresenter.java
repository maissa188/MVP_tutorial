package com.example.mvptutorial;

public class MainActivityPresenter  implements  MainActivityContract.Presenter{
    MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {
        //email azza@gmail.com
        //password 12345
        if (email.equals("azza@gmail.com") && password.equals("12345")){
            view.onSuccess("Successful");
        }
        else{
            view.onError("Wrong data");
        }

    }
}
