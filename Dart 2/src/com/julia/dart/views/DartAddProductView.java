package com.julia.dart.views;
import com.julia.dart.Utilities;
import com.julia.dart.model.DartProduct;
import com.julia.dart.model.DartProductType;

public class DartAddProductView {
    public DartProduct getProductData() {
        String title, genre;
        Double dailyRentFee;

        System.out.println(Utilities.line() + "Creating a Game. Please type the game's:\n " +
                "ID:\n");
        //Randomize ID?
        System.out.println(Utilities.line() + "Title\n");
        title = Utilities.stringInput();
        System.out.println(Utilities.line() + "Genre\n");
        genre = Utilities.stringInput();
        System.out.println(Utilities.line() + "Daily rent fee\n");
        dailyRentFee = Utilities.doubleInput();

        DartProduct product = new DartProduct( title, genre, dailyRentFee, DartProductType.Game );

        return product;
    }

    public void renderSuccess() {
        System.out.println("Successfully registered a product!");
    }
}
