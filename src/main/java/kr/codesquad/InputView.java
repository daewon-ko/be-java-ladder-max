package kr.codesquad;

import java.util.Scanner;

public class InputView {
    public static final Scanner SCANNER = new Scanner(System.in);


    public static int inputPeopleNumber() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return SCANNER.nextInt();
    }

    public static int inputLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return SCANNER.nextInt();
    }

    public static void close(){
        SCANNER.close();
    }

}
