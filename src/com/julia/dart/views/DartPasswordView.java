package com.julia.dart.views;

import com.julia.dart.Utilities;

public class DartPasswordView {
    //Password screen
    public void render() {
        System.out.println("Type in the password:");
    }
    //Success message printed when password provided renders successfully
    public void renderSuccess() {
        System.out.println("Successfuly logged in.");
    }
    //Error message printed when password fails
    public void renderFailure() {
        System.out.println("Invalid Password");
   }
    //Input for password
    public String read() {
       String passwordInput = Utilities.stringInput();
       return passwordInput;
   }
}
