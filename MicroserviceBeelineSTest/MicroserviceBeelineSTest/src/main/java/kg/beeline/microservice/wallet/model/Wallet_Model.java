package kg.beeline.microservice.wallet.model;

import java.util.Objects;

public class Wallet_Model {
    //Если просто представить что это обычный кошелек (физический, которым мы пользуемся)

    public String name;
    public String surname;
    public long value;

    public Wallet_Model(){

    }

    public Wallet_Model( String name, String surname, long value) {
        this.name = name;
        this.surname = surname;
        this.value = value;
    }

    public long minusValue(int howMuch){
        return value = value - howMuch;
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

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet_Model that = (Wallet_Model) o;
        return value == that.value &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, value);
    }

    @Override
    public String toString() {
        return "Wallet_Model{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", value=" + value +
                '}';
    }
}
