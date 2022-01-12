package br.com.dfdx.dp.one.strategy;

import br.com.dfdx.dp.one.strategy.controller.ScoreBoard;
import br.com.dfdx.dp.one.strategy.model.Baloon;
import br.com.dfdx.dp.one.strategy.model.Clown;
import br.com.dfdx.dp.one.strategy.model.SquareBaloon;

public class MainStrategy {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Ballon Tap Score:");
        scoreBoard.algorithmBase = new Baloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clown Tap Score:");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("Square Ballon Tap Score:");
        scoreBoard.algorithmBase = new SquareBaloon();
        scoreBoard.showScore(10, 5);

    }
}
