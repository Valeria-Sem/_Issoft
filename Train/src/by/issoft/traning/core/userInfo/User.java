package by.issoft.traning.core.userInfo;

import by.issoft.traning.core.validation.Validation;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private final LocalDate dateOfBirth;
    private final String passportNo;
    private String nationality;
    private Sex sex;

    public User(String name, String surname, LocalDate dateOfBirth, String passportNo, String nationality, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passportNo = passportNo;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Validation.validateLetters(name)){
            this.name = name;
        } else throw new RuntimeException("В имени могут быть только буквы");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(Validation.validateLetters(surname)){
            this.surname = surname;
        } else throw new RuntimeException("В имени могут быть только буквы");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if(Validation.validateLetters(nationality)){
            this.nationality = nationality;
        } else throw new RuntimeException("В имени могут быть только буквы");
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", passportNo='" + passportNo + '\'' +
                ", nationality='" + nationality + '\'' +
                ", sex=" + sex +
                '}';
    }
}
