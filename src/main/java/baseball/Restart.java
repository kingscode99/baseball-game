package baseball;

import nextstep.utils.Console;

public class Restart {
    public static void restart(String input){
        if(input.equals("2")){
            return;
        }
        if(input.equals("1")){
            StartGame.startGame();
            return;
        }
        notUseableValue();
    }
    private static void notUseableValue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요\n");
        String input = Console.readLine();
        restart(input);
    }
}
