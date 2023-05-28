package com.demo.project;

import org.junit.Test;

public class DemoTestIT {
    @Test
    public void sayTest()
    {
        System.out.println("second test is running successfully ========================================================");
    }
    @Test
    public void sayDemo()
    {
        System.out.println("sayDemo test is running successfully ========================================================running");
    }
}


//for skipping the test
// mvn clean install -DskipTests -DskipITs
//skip the intregation test
// mvn clean install -DskipITs
//mvn clean install -DskipTests
//mvn clean install -Dmaven.test.skip=true

//mvn clean verify -Dit.test=DemoTestIT    here it mean is the integrationtest
//[iid@iid demo-project-maven-module]$ mvn clean verify -Dit.test=DemoTestIT#sayDemo    running particular method in the DemoTestIT
