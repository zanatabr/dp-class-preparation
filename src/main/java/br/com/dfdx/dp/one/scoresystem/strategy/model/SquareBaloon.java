package br.com.dfdx.dp.one.scoresystem.strategy.model;

import br.com.dfdx.dp.one.scoresystem.strategy.controller.ScoreAlgorithmBase;

public class SquareBaloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
