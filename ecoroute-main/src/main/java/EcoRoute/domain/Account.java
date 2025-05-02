package EcoRoute.domain;

public class Account {
    private String name;
    private String Surname;
    private String street;
    private String postal_code;

    public Account(String name, String surname, String street, String postal_code) {
        this.name = name;
        Surname = surname;
        this.street = street;
        this.postal_code = postal_code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getStreet() {
        return street;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
}
