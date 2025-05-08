package Static_Classes_Name_Formatter;

import Demo_5_7.NameFormatter;

public class StaticClasses {

    // create only static methods
    // name formatting factory
    // a library of functions that are used to standardize the way a name should be formatted
    // LastName, Prefix FirstName MiddleName, Suffix
    String prefix;
    String firstName;
    String middleName;
    String lastName;
    String suffix;


    public static void main(String[] args){
        NameFormatter.format("Sarah Lorien Farris");
    }
    //this is the constructor
    StaticClasses(String prefix, String firstName, String middleName, String lastName, String suffix){
        this.prefix = prefix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }


}
