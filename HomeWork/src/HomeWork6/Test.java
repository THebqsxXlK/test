package HomeWork6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader) throws IOException {
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));

        String srtingRateEUR = Double.toString(loader.load(SiteLoader.Currency.EUR));
        String srtingRateRUB = Double.toString(loader.load(SiteLoader.Currency.RUB));
        String srtingRateUSD = Double.toString(loader.load(SiteLoader.Currency.USD));

        String strFormatAllRates = String.format(SiteLoader.Currency.EUR + " = %s\n"
                + SiteLoader.Currency.RUB + " = %s\n"
                + SiteLoader.Currency.USD + " = %s\n", srtingRateEUR, srtingRateRUB, srtingRateUSD);

        Scanner in = new Scanner(System.in);
        System.out.println("Input a path and name of file for saving currency rates: ");
        String pathFromConsole = in.next();

        in.close();

        boolean result = pathFromConsole.matches("\\D:(\\S*)(\\.)(txt)");
        if (result) {
            try (FileWriter writer = new FileWriter(pathFromConsole)) {
                writer.write(String.valueOf(strFormatAllRates));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("The file has been written");
        } else {
            try (FileWriter writer = new FileWriter("CurrencyRate.txt")) {
                writer.write(String.valueOf(strFormatAllRates));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("It's a wrong path!\n The file has been written to current folder");
        }
    }
}