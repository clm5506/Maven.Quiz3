package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String nameOfLab;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.nameOfLab = labName;
    }

    public String getName() {
        return this.nameOfLab;
    }
}
