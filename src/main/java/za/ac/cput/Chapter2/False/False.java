package za.ac.cput.Chapter2.False;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class False {

    private boolean value;

    public False() {
    }

    public False(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        False aFalse = (False) o;

        if (value != aFalse.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }

    @Override
    public String toString() {
        return "False{" +
                "value=" + value +
                '}';
    }
}
