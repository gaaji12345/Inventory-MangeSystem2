package com.example.demoinvento.dtos;/*  gaajiCode
    99
    04/01/2025
    */

import lombok.Builder;

@Builder
public class Test {
    private int id;
    private String name;

    public static void main(String[] args) {
        Test test = Test.builder()
                .id(1)
                .name("Test Name")
                .build();

        System.out.println(test);
    }
}
