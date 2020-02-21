package com.example.demo;

import lombok.Data;

//setter getter 안만들어도 되게 하는 plug in
@Data
public class Member {
    private String name;
    private String ssn;
    private String birthDate;


}
