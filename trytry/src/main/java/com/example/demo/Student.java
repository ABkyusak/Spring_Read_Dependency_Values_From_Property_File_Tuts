package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    String name;
    String subject;
    String hobby;

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public  void display(){
        System.out.println("23" + name +"---->"+subject+"=====>" + hobby);
    }


}
