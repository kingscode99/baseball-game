package codeRefactoring;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class GameStart {
    public static void gameStart() {
        List<Integer> computerNumList = ComputerNum.computerNumList();
        List<Integer> inputNumList = new ArrayList<>();
        gameDetail(computerNumList, inputNumList);
        restart();
    }
    private static void gameDetail(List<Integer> computerNumList, List<Integer> inputNumList){
        do {
            System.out.print("숫자를 입력해주세요: ");
            String inputNum = Console.readLine();
            inputNumList = InputNum.inputNum(inputNum);
        } while (!Judge.judge(computerNumList, inputNumList));
    }
    private static void restart(){
        boolean a = true;
        do{
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요\n");
            String input = Console.readLine();
            if(input.equals("1")){
                gameStart();
            }
            if(input.equals("2")){
                a = false;
            }
        }while(a);
    }
}
