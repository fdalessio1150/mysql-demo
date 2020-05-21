package com.example.mysqldemo.model;

import com.example.mysqldemo.entity.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class PersonDTO {

    public PersonDTO() { }

    public PersonDTO(Person entity) {
        this.personId = entity.getPk().getPersonId();
        this.name = entity.getName();
        this.addressId = entity.getPk().getAddressId();
        this.addressName = entity.getAddressName();
        this.state = entity.getState();
    }

    @NotNull
    @JsonProperty("id_pessoa")
    private String personId;

    @NotNull
    @JsonProperty("nome")
    private String name;

    @NotNull
    @JsonProperty("id_endereço")
    private String addressId;

    @NotNull
    @JsonProperty("endereço_completo")
    private String addressName;

    @NotNull
    @JsonProperty("estado")
    private String state;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
