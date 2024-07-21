import model.LadderGame;
import view.InputView;
import view.ResultView;

public class Application {

    private static final InputView inputView = new InputView();
    private static final ResultView ResultView = new ResultView();

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(inputView, ResultView);
        ladderGame.start();
    }

}