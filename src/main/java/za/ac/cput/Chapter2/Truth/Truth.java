package za.ac.cput.Chapter2.Truth;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class Truth {

    private boolean value;

    public Truth() {
    }

    public Truth(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truth truth = (Truth) o;

        if (value != truth.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Truth{" +
                "value=" + value +
                '}';
    }
}
