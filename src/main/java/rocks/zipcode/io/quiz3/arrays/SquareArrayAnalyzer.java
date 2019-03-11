package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {


    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        ArrayList<Integer> inputToArrayList = new ArrayList<Integer>();
       ArrayList<Integer> squaredValuesArrayList = new ArrayList<Integer>(Arrays.asList(squaredValues));

        for(int i = 0; i < inputToArrayList.size()-1; i++){
            inputToArrayList.add(input[i] * input[i]);
        }

        for(int i = 0; i < inputToArrayList.size()-1; i++){
            if(!squaredValuesArrayList.contains(inputToArrayList.get(i))){
                return false;
            }
        }
        return true;
    }
}
