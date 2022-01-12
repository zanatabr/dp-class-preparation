package br.com.dfdx.dp.one.strategy.model;

import br.com.dfdx.dp.one.strategy.controller.ScoreAlgorithmBase;

public class Baloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
