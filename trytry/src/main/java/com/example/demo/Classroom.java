package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;


public class Classroom {

    @Autowired
    Student st;



    public void display(){

        System.out.println("23" + st.name +"---->"+st.subject+"=====>" + st.hobby);

    }
}
