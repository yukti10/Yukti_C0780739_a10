package lambton.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Currencyconvertor {
    public static String currencyFormat(double amount){
        Locale cad = new Locale("EN","CA");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(cad);
        return defaultFormat.format(amount);
    }
}
