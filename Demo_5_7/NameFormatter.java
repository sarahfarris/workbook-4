package Demo_5_7;

import Static_Classes_Name_Formatter.StaticClasses;

public class NameFormatter {
    StaticClasses staticClasses;


    // this is the constructor
    private NameFormatter(String firstName) {
//        this.staticClasses.firstName = firstName;
    }
    public static String format(String firstName, String lastName) {
        return "blah";

    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return "blah1";
    }

    public static String format(String fullName){
//        String fullName = lastName + ", " + firstName + " " + middleName + " " +  lastName " "
        return "blah2";

    }


}
