package com.example.mysqldemo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class PersonPK implements Serializable {

    public PersonPK() {

    }

    public PersonPK(String personId, String addressId) {
        this.personId = personId;
        this.addressId = addressId;
    }

    @NotNull
    @Column(name = "id_pessoa")
    private String personId;

    @NotNull
    @Column(name = "id_endereco")
    private String addressId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
