package com.julia.dart;

import com.julia.dart.model.*;
import com.julia.dart.views.*;

import java.time.LocalDate;
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
    DartAddMusicView mAddMusicView; //added something here!
    DartAddCustomerView mAddCustomerView;
    DartRemoveEmployeeView mRemoveEmployeeView;
    DartRemoveProductView mRemoveProductView;
    //DartRemoveSongView mRemoveSongView;
    DartRemoveCustomerView mRemoveCustomerView;
    DartRentProductView mRentProductView;
    DartReturnProductView mReturnProductView;
    //DartRentSongView
    //DartReturnProductView
    DartShowEmployeeMenuView mShowEmployeeMenuView;
    DartShowGamesView mShowGamesView;
    DartShowSongsView mShowSongsView;
    DartTotalRentProfitView mTotalRentProfitView;
    // DartSearchEmployeeView mSearchEmployeeView;

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
        mAddMusicView = new DartAddMusicView();
        mRemoveEmployeeView = new DartRemoveEmployeeView();
        mRemoveProductView = new DartRemoveProductView();
        mRemoveCustomerView = new DartRemoveCustomerView();
        mRentProductView = new DartRentProductView();
        mReturnProductView = new DartReturnProductView();
        mShowEmployeeMenuView = new DartShowEmployeeMenuView();
        mShowGamesView = new DartShowGamesView();
        mTotalRentProfitView = new DartTotalRentProfitView();
        //  mSearchEmployeeView = new DartSearchEmployeeView();
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

        switch (input) {
            case 1 -> { //Add employee
                DartEmployee employee = mAddEmployeeView.getEmployeeData(); // get the employee data from the user via the view object

                mModel.addEmployee(employee); // store the data in the storage
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
                mModel.addProduct(product);
                mAddProductView.renderSuccess();
                doEmployeeMenu();
            }
            case 2 -> { //Remove a game
                mRemoveProductView.render();
                UUID retVal = mRemoveProductView.read();
                if (retVal == null) {
                    mRemoveProductView.renderError();
                    doEmployeeMenu();
                } else {
                    mModel.removeProduct(retVal);
                    mRemoveEmployeeView.renderSuccess();
                    doEmployeeMenu();
                }

            }
            case 3 -> { //Add a song
                DartMusic music = mAddMusicView.getMusicData();
                mModel.addSong( music );
                mAddMusicView.renderSuccess();
                doEmployeeMenu();
            }
            case 4 -> { //Remove a song

            }
            case 5 -> { //Register a customer
                DartCustomer customer = mAddCustomerView.getCustomerData();
                mModel.addCustomer(customer);
                mAddCustomerView.renderSuccess();
                doEmployeeMenu();
            }
            case 6 -> { //Remove a customer
                mRemoveCustomerView.render();
                UUID retVal = mRemoveCustomerView.read();
                while (retVal == null) {
                    mRemoveCustomerView.renderError();
                    mRemoveCustomerView.render();
                    retVal = mRemoveCustomerView.read();
                }
                mRemoveCustomerView.renderSuccess();
            }
            case 7 -> { //Show total rent profit

            }
            case 8 -> { //View all games
                doShowGamesView();
                doEmployeeMenu();
            }
            case 9 -> { //View all songs
                DartMusic.showAllSongs(mModel.getMusicList());
                doEmployeeMenu();

            }
            case 10 -> { //Return to main menu
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
        UUID id = null;
        Integer input = mCustomerView.read();
        switch (input) {
            case 1 -> { //Rent a game
                mRentProductView.render(mModel.getProductList());
                id = mCustomerView.readUUID();
                if (id == null) {
                    mRentProductView.renderError();
                    doCustomerMenu();
                }
                mRentProductView.renderSuccess();
                DartProduct.rentProduct();
                doCustomerMenu();
            }
            case 2 -> { //Return a game
                mReturnProductView.render(mModel.getProductList());
                id = mCustomerView.readUUID();
                if (id == null) {
                    mReturnProductView.renderError();
                    doCustomerMenu();
                }
                mReturnProductView.renderSuccess();
                DartProduct.returnProduct();
                doCustomerMenu();
            }
            case 3 -> { //Rent Song

            }
            case 4 -> { //Return Song

            }
            case 5 -> { //Return to main menu
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
        mShowEmployeeMenuView.render(mModel.getEmployeeList());
        UUID id = null;

        Integer input = mShowEmployeeMenuView.read();

        switch (input) {
            case 1 -> { //Remove employee
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
            case 2 -> {
                mShowEmployeeMenuView.renderExit();
            }
            default -> {
                mShowEmployeeMenuView.renderError();
                doShowEmployeeMenuView();
            }
        }
    }

    void doShowGamesView() {
        mShowGamesView.render(mModel.getProductList());
        UUID id = null;

        Integer input = mShowGamesView.read();

        switch (input) {
            case 1 -> { //Remove product
                mRemoveProductView.render();
                id = mRemoveProductView.read();
                if (id == null) {
                    mRemoveProductView.renderError();
                    doShowEmployeeMenuView();
                } else {
                    mModel.removeProduct(id);
                    mRemoveProductView.renderSuccess();
                    doShowEmployeeMenuView();
                }
            }
            case 2 -> {
                mShowGamesView.renderExit();
            }
            default -> {
                mShowGamesView.renderError();
                doShowGamesView();
            }
        }
    }
    void doShowSongsView() { //FIX THIS
        mShowSongsView.render(mModel.getMusicList());
        UUID id = null;


        }
    }
