package model;

import view.InputView;
import view.ResultView;

public class LadderGame {

    private final InputView inputView;
    private final ResultView ResultView;
    private Players players;
    private Ladder ladder;

    public LadderGame(InputView inputView, ResultView ResultView) {
        this.inputView = inputView;
        this.ResultView = ResultView;
    }

    public void start() {
        players = inputView.readPlayers();
        Integer ladderHeight = inputView.readLadderHeight();
        ladder = new Ladder(players.getPlayerCount(), ladderHeight);
        ResultView.printLadderGameResult(this);
    }

    public Ladder getLadder() {
        return ladder;
    }

    public Players getPlayers() {
        return players;
    }

}