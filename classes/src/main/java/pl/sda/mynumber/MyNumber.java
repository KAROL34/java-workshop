package pl.sda.mynumber;

import java.util.Objects;

/**
 * Utwórz klasę o nazwie `MyNumber`, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody:
 * <p>
 * `boolean isOdd()` – `true` jeśli paramentr jest nieparzysty
 * `boolean isEven()` – `true` jeśli paramentr jest parzysty
 * `MyNumber sqrt()` – pierwiastek z paramentru,
 * `MyNumber pow(MyNumber x)` – parametr podniesiony do potęgi `x` (potrzebnej metody poszukaj w javadoc w klasie Math) opakowany `MyNumber`,
 * `MyNumber add(MyNumber x)` – zwraca sumę atrybutu i `x` opakowaną w klasę `MyNumber`,
 * `MyNumber subtract(MyNumber x)` – zwraca różnicę atrybutu i `x` opakowaną w klasę `MyNumber`.
 * <p>
 * Powyższe metody nie powinny modyfikować oryginalnego obiektu, czyli klasa `MyNumber` musi być niemutowalna.
 */

public class MyNumber {

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isEven() {
        return !isOdd();
    }

    public MyNumber sqrt() {
        return new MyNumber((int) Math.sqrt(value));
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber((int) Math.pow(value, x.value));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(value + x.value);
    }

    public MyNumber subtract(MyNumber x) {
        return new MyNumber(value - x.value);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNumber myNumber = (MyNumber) o;
        return value == myNumber.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
