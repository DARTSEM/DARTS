package com.julia.dart;

import com.julia.dart.model.DartCustomer;
import com.julia.dart.model.DartEmployee;
import com.julia.dart.model.DartModel;
import com.julia.dart.model.DartProduct;
import com.julia.dart.views.*;

import java.util.UUID;

public class DartController {
    DartModel mModel;
    DartMainMenuView mMainMenuView;
    DartPasswordView mPasswordView;
    DartManagerMenuView mManagerMenuView;
    DartEmployeeMenuView mEmployeeMenuView;
    DartCustomerView mCustomerView;
    DartAddEmployeeView mAddEmployeeView;
    DartAddProductView mAddProductView;
    DartAddCustomerView mAddCustomerView;
    DartRemoveEmployeeView mRemoveEmployeeView;
    DartRemoveProductView mRemoveProductView;
    DartRemoveCustomerView mRemoveCustomerView;
    DartShowEmployeeMenuView mShowEmployeeMenuView;
    DartSearchEmployeeView mSearchEmployeeView;

    public DartController() {
        mModel = new DartModel();
        mMainMenuView = new DartMainMenuView();
        mPasswordView = new DartPasswordView();
        mManagerMenuView = new DartManagerMenuView();
        mEmployeeMenuView = new DartEmployeeMenuView();
        mCustomerView = new DartCustomerView();
        mAddEmployeeView = new DartAddEmployeeView();
        mAddProductView = new DartAddProductView();
        mAddCustomerView = new DartAddCustomerView();
        mRemoveEmployeeView = new DartRemoveEmployeeView();
        mRemoveProductView = new DartRemoveProductView();
        mRemoveCustomerView = new DartRemoveCustomerView();
        mShowEmployeeMenuView = new DartShowEmployeeMenuView();
        mSearchEmployeeView = new DartSearchEmployeeView();
    }

    public void main() {
        // start the system

        System.out.println("Initiliazing DART . . .\n");

        /* EXPLANATIONS AND MORE:
         * every time the user can type in an integer or character to select their next step is called a menu.
         * default for switch cases should always return the user to the same page.
         * the class called "Utilities" has various methods we can use, such as 'stringInput' to replace
           the usual input.nextLine
         */

        // Starts the main menu.

        doMainMenu();
    }

    void doMainMenu() {

        String password;

        mMainMenuView.render();

        String mainMenuSelect = mMainMenuView.read();
        mainMenuSelect = mainMenuSelect.toUpperCase(); // converts all letters in the string to uppercase

        switch (mainMenuSelect) {
            case "M" -> { //Manager menu
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
            case "E" -> { //Employee menu
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
            case "C" -> { //Customer menu
                doCustomerMenu();
            }
            case "X" -> { //Exit system
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
            case 1 -> { //Add employee
                DartEmployee employee = mAddEmployeeView.getEmployeeData(); // get the employee data from the user via the view object

                mModel.addEmployee( employee ); // store the data in the storage
                mAddEmployeeView.renderSuccess();
                doManagerMenu();
            }
            case 2 -> {
                doShowEmployeeMenuView();
                doManagerMenu();
            }
            case 3 -> { //Return to main menu
                mManagerMenuView.renderExit();
                doMainMenu();
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
            case 1 -> { //Register game
                DartProduct product = mAddProductView.getProductData();
                mModel.addProduct( product );
                mAddProductView.renderSuccess();
                doEmployeeMenu();
            }
            case 2 -> { //Remove a game
                mRemoveProductView.render();
                UUID retVal = mRemoveProductView.read();
                while (retVal == null) {
                    mRemoveProductView.renderError();
                    mRemoveProductView.render();
                    retVal = mRemoveProductView.read();
                }
                mRemoveEmployeeView.renderSuccess();
            }
            case 3 -> { //Register a customer
                DartCustomer customer = mAddCustomerView.getCustomerData();
                mModel.addCustomer( customer );
                mAddCustomerView.renderSuccess();
                doEmployeeMenu();
            }
            case 4 -> { //Remove a customer
                mRemoveCustomerView.render();
                UUID retVal = mRemoveCustomerView.read();
                while (retVal == null) {
                    mRemoveCustomerView.renderError();
                    mRemoveCustomerView.render();
                    retVal = mRemoveCustomerView.read();
                }
                mRemoveCustomerView.renderSuccess();
            }
            case 5 -> { //Show total rent profit

            }
            case 6 -> { //View all games

            }
            case 7 -> { //Return to main menu
                mEmployeeMenuView.renderExit();
                doMainMenu();

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
            case 1 -> { //Rent a game

            }
            case 2 -> { //Return a game

            }
            case 3 -> { //Return to main menu
                mCustomerView.renderExit();
                doMainMenu();
            }
            default -> {
                mCustomerView.renderError();
                doCustomerMenu();
            }
        }
    }

    void doShowEmployeeMenuView() {
        mShowEmployeeMenuView.render();
        UUID id = null;

        Integer input = mShowEmployeeMenuView.read();

        switch(input) {
            case 1 -> { //Search for specific employee
                mSearchEmployeeView.render();
                id = mSearchEmployeeView.read();

                DartEmployee employee = mModel.getEmployeeById(id);
                while (employee == null) {
                    mSearchEmployeeView.renderError();
                    mSearchEmployeeView.render();
                    id = mSearchEmployeeView.read();
                    employee = mModel.getEmployeeById(id);
                }
                mSearchEmployeeView.renderSuccess(employee);
                doShowEmployeeMenuView();
            }
            case 2 -> { //Remove employee
                mRemoveEmployeeView.render();
                id = mRemoveEmployeeView.read();
                if (id == null) {
                    mRemoveEmployeeView.renderError();
                    doShowEmployeeMenuView();
                } else {
                    mModel.removeEmployee(id);
                    mRemoveEmployeeView.renderSuccess();
                    doShowEmployeeMenuView();
                }
            }
            case 3 -> {
                mShowEmployeeMenuView.renderExit();
            }
            default -> {
                mShowEmployeeMenuView.renderError();
                doShowEmployeeMenuView();
            }
        }
    }


}
