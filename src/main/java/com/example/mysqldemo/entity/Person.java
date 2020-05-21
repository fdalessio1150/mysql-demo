package com.example.mysqldemo.entity;

import com.example.mysqldemo.model.PersonDTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person")
public class Person {

    public Person() {

    }

    public Person(PersonDTO dto) {
        pk = new PersonPK();

        pk.setPersonId(dto.getPersonId());
        pk.setAddressId(dto.getAddressId());

        this.pk = pk;
        this.name = dto.getName();
        this.addressName = dto.getAddressName();
        this.state = dto.getState();
    }

    @EmbeddedId
    private PersonPK pk;

    @NotNull
    @Column(name = "nome")
    private String name;

    @NotNull
    @Column(name = "endereco_completo")
    private String addressName;

    @NotNull
    @Column(name = "estado")
    private String state;

    public PersonPK getPk() {
        return pk;
    }

    public void setPk(PersonPK pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
