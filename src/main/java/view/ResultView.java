package view;

import model.LadderGame;

public class ResultView {

    public void printLadderGameResult(LadderGame ladderGame) {
        System.out.println("\n사다리 결과\n");
        System.out.println(ladderGame.getPlayers());
        System.out.print(ladderGame.getLadder());
    }

}