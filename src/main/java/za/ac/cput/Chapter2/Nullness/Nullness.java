package za.ac.cput.Chapter2.Nullness;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class Nullness {

    private String value;

    public Nullness() {
    }

    public Nullness(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nullness nullness = (Nullness) o;

        if (value != null ? !value.equals(nullness.value) : nullness.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Nullness{" +
                "value='" + value + '\'' +
                '}';
    }
}
