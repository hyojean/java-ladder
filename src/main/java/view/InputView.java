package view;

import model.Players;
import model.Results;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public Players readPlayers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        List<String> playerNames = Arrays.asList(sc.nextLine().split(","));
        return new Players(playerNames);
    }

    public Results readResults(Integer playerCount) {
        System.out.println("\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        List<String> results = Arrays.asList(sc.nextLine().split(","));
        if (results.size() != playerCount) {
            throw new IllegalArgumentException("실행 결과의 수와 플레이어의 수는 같아야 합니다.");
        }
        return new Results(results);
    }

    public Integer readLadderHeight() {
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        Integer height = sc.nextInt();
        sc.nextLine();
        return height;
    }

    public String readResultPlayerName() {
        System.out.println("\n결과를 보고 싶은 사람은?");
        return sc.nextLine();
    }

}