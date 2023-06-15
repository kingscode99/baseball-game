package baseball;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNum {

    public static List<Integer> makeComputerNum() {
        List<Integer> randomIntList = new ArrayList<>();
        while (randomIntList.size() < 3) {
            int randomInt = Randoms.pickNumberInRange(1, 9);
            //같은수가 중복된다면
            if (randomIntList.contains(randomInt)) {
                int newRandomInt = Randoms.pickNumberInRange(1, 9);
                while (randomIntList.contains(newRandomInt)) {
                    newRandomInt = Randoms.pickNumberInRange(1, 9);
                }
                randomInt = newRandomInt;
            }
            randomIntList.add(randomInt);
        }
        return randomIntList;
    }
}
