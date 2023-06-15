package codeRefactoring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class InputNum {
    public static List<Integer> inputNum(String inputNum) {
        deduplication(inputNum);
        return changeIntegerList(inputNum);
    }

    private static Boolean deduplication(String inputNum) {
        if (inputNum.length() != 3) {
            System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요.");
            return false;
        }
        if (inputNum.contains("0")) {
            System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요.");
            return false;
        }
        Set<Character> uniqueValue = new HashSet<>();
        for (char value : inputNum.toCharArray()) {
            if (uniqueValue.contains(value)) {
                System.out.println("0을 포함하지 않은 서로 다른 3자리 수를 입력하세요.");
                return false;
            }
            uniqueValue.add(value);
        }
        return true;
    }

    private static List<Integer> changeIntegerList(String inputNum) {
        String[] inputNumStringList = inputNum.split("");
        List<Integer> inputNumIntegerList = new ArrayList<>();
        for (String stringNum : inputNumStringList) {
            int intNum = Integer.parseInt(stringNum);
            inputNumIntegerList.add(intNum);
        }
        return inputNumIntegerList;
    }
}
