package org.lessons.java.snacks;


public class Student {
    //variabili di istanza
    String name;
    String surname;
    int age;

    //costruttore 
public Student (String name, String surname, int age){
    this.name = name;
    this.surname = surname;
    this.age = age;
}

//metodo che restituisce una stringa concatenata
public String studentData(){
    return this.name + " " + this.surname + ", " + this.age;
}
}
