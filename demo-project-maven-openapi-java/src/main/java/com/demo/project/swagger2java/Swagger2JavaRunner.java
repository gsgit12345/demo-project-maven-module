package com.demo.project.swagger2java;

import com.demo.project.swagger2java.model.Pet;

import java.util.Collections;
import java.util.List;

import static com.demo.project.swagger2java.model.Pet.StatusEnum.AVAILABLE;

import static java.util.Collections.singletonList;

public class Swagger2JavaRunner {

    public  static void main(String str[])
    {
        final PetApi api=new PetApi();
        final List<Pet> availablepet=api.findPetsByStatus(singletonList(AVAILABLE.getValue()));
        availablepet.forEach(System.out::println);
     System.out.println(api.getPetById(9223372036854752795L));
    }
}
