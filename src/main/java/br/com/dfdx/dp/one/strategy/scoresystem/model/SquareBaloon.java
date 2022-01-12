package br.com.dfdx.dp.one.strategy.scoresystem.model;

import br.com.dfdx.dp.one.strategy.scoresystem.controller.ScoreAlgorithmBase;

public class SquareBaloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
