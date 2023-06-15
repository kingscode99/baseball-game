package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static nextstep.utils.Console.readLine;

public class InputNum {
    public static List<String> inputNum() {
        boolean pass = true;
        List<String> inputNumList = new ArrayList<>();
        while (pass) {
            String inputNum = readLine();
            inputNumList = Arrays.asList(inputNum.split(""));
            if (inputNumList.contains(String.valueOf(0))) {
                System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요");
                continue;
            }
            if (inputNumList.size() != 3) {
                System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요");
                continue;
            }
            boolean duplication = false;
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    if (i != k) {
                        if (Objects.equals(inputNumList.get(i), inputNumList.get(k))) {
                            duplication = true;
                        }
                    }
                }
            }
            if (duplication) {
                System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요");
                continue;
            }
            pass = false;
        }
        return inputNumList;
    }
}
