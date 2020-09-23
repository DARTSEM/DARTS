package src.julia.dart.views;

import src.julia.dart.Utilities;

public class DartPasswordView {

    public void render() {
        System.out.println("Type in the password:");
    }

    public void renderSuccess() {
        System.out.println("Successfuly logged in.");
    }

   public void renderFailure() {
        System.out.println("Invalid Password");
   }

   public String read() {
       String passwordInput = Utilities.stringInput();

       return passwordInput;
   }
}
