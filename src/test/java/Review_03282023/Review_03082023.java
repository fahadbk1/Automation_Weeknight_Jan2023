package Review_03282023;

import java.util.ArrayList;

public class Review_03082023 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");

        if (countries.get(0).equals("USA") && countries.get(1).equals("Canada"))
        { System.out.println("Option 1");}

        else if (countries.get(0).equals("USA") || countries.get(1).equals("Canada"))
        { System.out.println("Option 2");}

    }//end of main
}//end of class
