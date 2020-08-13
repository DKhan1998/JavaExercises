package com.qa.day1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day1Test {

    @Test
    public void creatingObject(){
        Person person = new Person("Daood", "Khan");
        assertEquals("Daood", person.getfName());
    }

}
