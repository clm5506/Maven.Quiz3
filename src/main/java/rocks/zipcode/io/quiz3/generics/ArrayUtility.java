package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public T findOddOccurringValue() {

//
//                for (int i = 0; i < array.length; i++) {
//                    if (this.array % 2 != 0) {
//
//                    }
//                }

        return null;
    }

    public T findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return null;
    }

    public T[] filter(Function<T, Boolean> predicate) {
        return null;
    }
}
