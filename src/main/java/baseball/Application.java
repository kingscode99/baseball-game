package baseball;

import nextstep.utils.Randoms;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현

        //콘솔에서 input값 받아오기
//        System.out.print("숫자를 입력해주세요: ");
//        int intInput = Integer.parseInt(Console.readLine());
//        System.out.println(intInput);
//        if(intInput>1000 || intInput<100){
//            System.out.println("3자리의 수를 입력 하세요");
//        }
        for (int i = 0; i <= 100; i++) {
            int randomValue = Randoms.pickNumberInRange(100, 999);
            String stirngValue = String.valueOf(randomValue);
            String[] arrayStringValue;
            arrayStringValue = stirngValue.split("");
            for(int a = 0; a<3; a++){
                for(int b = 0; b<3; b++){
                    if(a!=b){
                        if(arrayStringValue[a] == arrayStringValue[b]){
                            System.out.println("서로 다른 숫자를 입력하세요");
                        }
                    }
                }
            }
        }
    }
}
