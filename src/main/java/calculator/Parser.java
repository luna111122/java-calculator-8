package calculator;

import java.util.ArrayList;

public class Parser {

    public ArrayList makeNums(String str) {
        ArrayList arr = new ArrayList<>();


        if (str == null || str.isEmpty()) {
            return arr;
        }

        String[] tokens = str.split("[,:]");

        for (String token : tokens) {


            try {
                int num = Integer.parseInt(token);
                arr.add(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + token);
            }
        }

        return arr;
    }
}
