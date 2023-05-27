package com.demo.project;

import org.junit.Test;

public class DemoTestIT {
    @Test
    public void sayTest()
    {
        System.out.println("second test is running successfully ========================================================");
    }
}


//for skipping the test
// mvn clean install -DskipTests -DskipITs