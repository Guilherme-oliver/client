package com.oliveira.client.dto;

import com.oliveira.client.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;

public class ClientDTO {
    private Long id;

    @Size(min = 3, max = 80, message = "min 3 and max 80")
    @NotBlank(message = "Required field")
    private String name;

    @Size(min = 11, max = 11, message = "Must have 11 characters")
    @NotBlank(message = "Required field")
    private String cpf;

    @Positive(message = "The price must be positive")
    private Double income;

    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(){}

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}