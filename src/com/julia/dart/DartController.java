package com.julia.dart;

import com.julia.dart.model.DartEmployee;
import com.julia.dart.model.DartModel;
import com.julia.dart.views.*;

public class DartController {

    DartModel mModel;

    DartMainMenuView mMainMenuView;
    DartPasswordView mPasswordView;

    DartManagerMenuView mManagerMenuView;
    DartEmployeeMenuView mEmployeeMenuView;
    DartCustomerView mCustomerView;

    DartAddEmployeeView mAddEmployeeView;

    public DartController() {
        mModel = new DartModel();
        mMainMenuView = new DartMainMenuView();
        mPasswordView = new DartPasswordView();
        mManagerMenuView = new DartManagerMenuView();
        mEmployeeMenuView = new DartEmployeeMenuView();
        mCustomerView = new DartCustomerView();
        mAddEmployeeView = new DartAddEmployeeView();
    }

    public void main() {
        // start the system


        System.out.println("Initiliazing DART . . .\n");

        /* EXPLANATIONS AND MORE:
         * every time the user can type in an integer or character to select their next step is called a menu.
         They are named like "xMenu"; e.g. "mainMenu" and "customerMenu".
         * default for switch cases should always return the user to the same page.
         * the class called "extra" has various methods we can use, such as 'stringInput' to replace
           the usual input.nextLine
         */

        // Starts the main menu.

        doMainMenu();

    }

    void doMainMenu() {

        String password;


        mMainMenuView.render();

        String mainMenuSelect = mMainMenuView.read();

        switch (mainMenuSelect) {
            case "M" -> {
                mPasswordView.render();

                password = mPasswordView.read();

                if (password.equals("admin1234")) {
                    mPasswordView.renderSuccess();
                    doManagerMenu();
                } else {
                    mPasswordView.renderFailure();
                    doMainMenu();
                }
            }
            case "E" -> {
                mPasswordView.render();

                password = mPasswordView.read();

                if (password.equals("password123")) {
                    mPasswordView.renderSuccess();
                    doEmployeeMenu();
                } else {
                    mPasswordView.renderFailure();
                    doMainMenu();
                }
            }
            case "C" -> {
                doCustomerMenu();
            }
            case "X" -> {
                mMainMenuView.renderExit();
                Utilities.closeScanner();
            }
            default -> {
                mMainMenuView.renderError();
                doMainMenu();
            }
        }
    }


    void doManagerMenu() {
        mManagerMenuView.render();

        Integer input = mManagerMenuView.read();

        switch( input ) {
            case 1 -> {
                // get the employee data from the user via the view object
                DartEmployee employee = mAddEmployeeView.getEmployeeData();
                // store the data in the storage
                mModel.addEmployee( employee );

                mAddEmployeeView.renderSuccess();
                doManagerMenu();
            }
            case 2 -> {
                // View all employees
                // feat2.option2
            }
            case 3 -> {
                mManagerMenuView.renderExit();
                doMainMenu();
                // Return to main menu
            }
            default -> {
                mManagerMenuView.renderError();
                doManagerMenu();
            }
        }
    }

    void doEmployeeMenu() {
        mEmployeeMenuView.render();

        Integer input = mEmployeeMenuView.read();
        switch (input) {
            case 1 -> {
            }
            case 2 -> {
                // Remove a game
                // feat3.option2();
            }
            case 3 -> {

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {
                mEmployeeMenuView.renderExit();
                doMainMenu();
                // Return to main menu
            }
            default -> {
                mEmployeeMenuView.renderError();
                doEmployeeMenu();
            }

        }
    }

    void doCustomerMenu() {
        mCustomerView.render();

        Integer input = mCustomerView.read();

        switch (input) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {
                mCustomerView.renderExit();
                doMainMenu();
                // Return to main menu ?? twice main menu
            }
            default -> {
                mCustomerView.renderError();
                doCustomerMenu();
            }
        }
    }

}
