package com.demo.project.generateschemafromjavafile;

public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

}




//note some importent urls
//https://github.com/mojohaus

  //      you can find more plugin here

    //    and you can find cordinate in  maven repository

      //  https://mvnrepository.com/artifact/org.codehaus.mojo/jaxb2-maven-plugin/3.1.0