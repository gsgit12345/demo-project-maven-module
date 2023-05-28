package com.demo.project.jaxbrunner;

import com.demo.project.xsdtojava.Department;
import com.demo.project.xsdtojava.Employee;
import com.demo.project.xsdtojava.ObjectFactory;

public class JaxbRunner {

    public static void main(String str[])
    {
        final ObjectFactory factory=new ObjectFactory();
        final Department dept=factory.createDepartment();
        final Employee emp=factory.createEmployee();
        dept.setName("HR");
        emp.setId(1);
        emp.setName("ram");
        emp.setDepartment(dept);
System.out.println("dept is:::"+dept);
        System.out.println("emp is:::"+emp);

    }
}
//https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.4.0-b180725.0427
//https://github.com/mojohaus/jaxb2-maven-plugin
//https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v3.1.0/plugin-info.html
//https://mvnrepository.com/artifact/org.codehaus.mojo/jaxb2-maven-plugin/2.5.0