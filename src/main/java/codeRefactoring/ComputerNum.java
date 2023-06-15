package codeRefactoring;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNum {
    public static List<Integer> computerNumList() {
        List<Integer> computerNumList = new ArrayList<>();
        while (computerNumList.size() < 3) {
            int computerNum = Randoms.pickNumberInRange(1, 9);
            if (!computerNumList.contains(computerNum)) {
                computerNumList.add(computerNum);
            }
        }
        return computerNumList;
    }
}
