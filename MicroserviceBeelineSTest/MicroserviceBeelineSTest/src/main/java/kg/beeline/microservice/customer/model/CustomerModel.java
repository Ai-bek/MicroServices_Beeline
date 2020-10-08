package kg.beeline.microservice.customer.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class CustomerModel {

    private Long id;
    private String name;
    private String surname;
    private PhoneNumberModel phoneNumberModel;

    public CustomerModel() {

    }


    public CustomerModel(Long id, String name, String surname, PhoneNumberModel phoneNumberModel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumberModel = phoneNumberModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PhoneNumberModel getPhoneNumberModel() {
        return phoneNumberModel;
    }

    public void setPhoneNumberModel(PhoneNumberModel phoneNumberModel) {
        this.phoneNumberModel = phoneNumberModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerModel)) return false;
        CustomerModel that = (CustomerModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(phoneNumberModel, that.phoneNumberModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumberModel);
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumberModel=" + phoneNumberModel +
                '}';
    }
}
