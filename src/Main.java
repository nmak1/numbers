import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();





        for (int i = 0; i< intList.size(); i++){
            if (intList.get(i) > 0) {
                positiveNumbers.add(intList.get(i));
            }
        }

        for (int i = 0; i< positiveNumbers.size(); i++) {
            if (positiveNumbers.get(i) % 2 == 0) {
                evenNumbers.add(positiveNumbers.get(i));
            }
        }
        Collections.sort(evenNumbers);
        for (Integer e : evenNumbers){
            System.out.print(e +":");
        }


    }

}












