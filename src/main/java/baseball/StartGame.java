package baseball;

import nextstep.utils.Console;

import java.util.List;

public class StartGame {
    public static void startGame(){
        List<Integer> computerNumList = ComputerNum.makeComputerNum();
        System.out.println(computerNumList);
        boolean win = true;
        while(win){
            List<String> inputNumList = InputNum.inputNum();
            System.out.println(inputNumList);
            Judge.judge(computerNumList, inputNumList);
            win = win(computerNumList, inputNumList);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요\n");
        String input = Console.readLine();
        Restart.restart(input);
    }

    private static Boolean win(List<Integer> computerNumList, List<String> inputNumList){
        String StringCPNumList = String.valueOf(computerNumList);
        String StringInputNumList = String.valueOf(inputNumList);
        if(StringCPNumList.equals(StringInputNumList)){
            return false;
        }
        return true;
    }
}
