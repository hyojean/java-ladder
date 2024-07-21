package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Players;
import model.Results;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public Players readPlayers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        List<String> playerNames = Arrays.asList(sc.nextLine().split(","));
        return new Players(playerNames);
    }

    public Integer readLadderHeight() {
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        Integer height = sc.nextInt();
        sc.nextLine();
        return height;
    }

}