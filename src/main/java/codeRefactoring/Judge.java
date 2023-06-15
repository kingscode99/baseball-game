package codeRefactoring;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Judge {
    public static boolean judge(List<Integer> computerNumList, List<Integer> inputNumList) {
        int matchNum = countDuplicates(computerNumList, inputNumList);
        int matchCorrectly = countCorrect(computerNumList, inputNumList);
        return ballAndStrike(matchNum, matchCorrectly);
    }

    private static int countDuplicates(List<Integer> computerNumList, List<Integer> inputNumList) {
        Set<Integer> computerNumSet = new HashSet<>(computerNumList);
        Set<Integer> inputNumSet = new HashSet<>(inputNumList);
        computerNumSet.retainAll(inputNumSet);
        int a = computerNumSet.size();
        return a;
    }

    private static int countCorrect(List<Integer> computerNumList, List<Integer> inputNumList) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (computerNumList.get(i).equals(inputNumList.get(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean ballAndStrike(int matchNum, int matchCorrectly) {
        if (matchCorrectly == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            return true;
        }
        if (matchNum == 0) {
            System.out.println("낫싱");
        }
        System.out.println(matchCorrectly + "스트라이크");
        System.out.println((matchNum - matchCorrectly) + "볼");
        return false;
    }
}
