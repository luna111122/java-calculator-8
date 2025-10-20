package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();  // 사용자 입력 받기

        Parser parser = new Parser();
        Calculating calc = new Calculating();

        try {
            ArrayList<Integer> nums = parser.makeNums(input);
            int result = calc.sum(nums);
            System.out.println("결과 : " + result);
        } catch (IllegalArgumentException e) {

            System.out.println("에러: " + e.getMessage());
            System.exit(1);
        }




    }
}
