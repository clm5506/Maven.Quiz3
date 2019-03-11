package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
//        str = str.toLowerCase();
//        ArrayList<String> ar = new ArrayList<>();
//        StringBuilder c = new StringBuilder(str);
//
//       StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i < str.length(); i++){
//            sb.append(str.substring(i).toUpperCase());
//        }
//        return sb.toString().split("");
        String[] stringarray = str.split("");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < stringarray.length; i++){
            for(int k = 0; k < stringarray[i].length(); k++){

                String string = stringarray[k];
               Character.toUpperCase(string.charAt(k));
                sb.append(stringarray[k]);
            }
        }
        return sb.toString().split("");

    }

//    public String capitalizeOneLetter(String str, int index ){
//       str = str.substring(index).toUpperCase();
//        return str;
//    }


}
