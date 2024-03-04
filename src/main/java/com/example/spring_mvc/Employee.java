package com.example.spring_mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 2, message = "name must be minimum two symbols")
    private String name;
    @NotBlank(message = "Surname is required")
    private String surname;
    @Min(value=500, message="must be greater then 499")
    @Max(value = 1000, message = "must be less then 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> listLanguages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use patten xxx-xx-xx")
    private String phoneNumbers;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMV", "BMV");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes", "Mercedes");

        listLanguages = new HashMap<>();
        listLanguages.put("English", "EN");
        listLanguages.put("Deught", "DE");
        listLanguages.put("French", "FR");
    }
}
