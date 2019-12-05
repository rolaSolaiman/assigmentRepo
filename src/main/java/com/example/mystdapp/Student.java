package com.example.mystdapp;

public class Student {
    String name;
    String id;
    String phone;
    String type;
    String address;
    String email;
    String birthdate;



    public Student(String name,String id,String phone,String type,String address,String email,String birthdate){
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.type=type;
        this.address=address;
        this.email=email;
        this.birthdate=birthdate;
    }



    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
