package br.com.dfdx.dp.strategy.scoresystem.model;

import br.com.dfdx.dp.strategy.scoresystem.controller.ScoreAlgorithmBase;

public class Baloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
