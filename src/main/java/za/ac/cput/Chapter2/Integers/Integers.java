package za.ac.cput.Chapter2.Integers;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class Integers {

    private int value;

    public Integers() {
    }

    public Integers(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Integers integers = (Integers) o;

        if (value != integers.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Integers{" +
                "value=" + value +
                '}';
    }
}
