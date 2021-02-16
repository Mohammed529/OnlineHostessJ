package com.example.onlinehostessj;

public class SignInHelperClass {

    String FirstName , LastName , Email , PhoneNumber , Password , REPassword ;



    public SignInHelperClass(String firstName, String lastName, String email, String phoneNumber, String password, String REPassword) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        PhoneNumber = phoneNumber;
        Password = password;
        this.REPassword = REPassword;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getREPassword() {
        return REPassword;
    }

    public void setREPassword(String REPassword) {
        this.REPassword = REPassword;
    }
}
