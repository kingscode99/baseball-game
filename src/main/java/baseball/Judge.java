package baseball;

import java.util.List;

public class Judge {
    public static void judge(List<Integer> computerNumList, List<String> inputNumList) {
        int i = 0;
        int matchNum = 0;
        int matchCorrectly = 0;
        for(String inputNum : inputNumList){
            for(Integer computerNum : computerNumList){
                if(Integer.parseInt(inputNum) == computerNum){
                    matchNum++;
                }
            }
        }
        for(String inputNum : inputNumList){
            if(Integer.parseInt(inputNum) == computerNumList.get(i++)){
                matchCorrectly++;
            }
        }
        if(matchNum == 0){
            System.out.println("낫싱");
            return;
        }
        System.out.println(matchCorrectly + "스트라이크");
        System.out.println((matchNum - matchCorrectly) + ("볼"));
    }
}
