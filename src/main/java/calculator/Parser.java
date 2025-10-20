package calculator;

import java.util.ArrayList;

public class Parser {

    public ArrayList makeNums(String str) {
        ArrayList arr = new ArrayList<>();


        if (str == null || str.isEmpty()) {
            return arr;
        }


        String delimiter = "[,:]";
        String numbers = str;


        if (str.startsWith("//")) {
            int newlineIndex = str.indexOf("\n");
            if (newlineIndex == -1) {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }

            String customDelimiter = str.substring(2, newlineIndex);
            delimiter = customDelimiter;
            numbers = str.substring(newlineIndex + 1);
        }


        String[] tokens = numbers.split(delimiter);

        for (String token : tokens) {
            if (token.isEmpty()) {
                throw new IllegalArgumentException("빈 숫자 항목이 포함되어 있습니다.");
            }
            try {
                int num = Integer.parseInt(token);
                if (num < 0) {
                    throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
                }
                arr.add(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + token);
            }
        }


        return arr;
    }
}
