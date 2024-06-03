package com.chess.engine.classic.randomizing;

public class Elo {
    private final double average;
    private final double whiteElo;
    public double blackElo;
    public double difference;
    public double eloSplit;
    public Elo(double whiteElo, double blackElo) {
        this.whiteElo = whiteElo;
        this.blackElo = blackElo;
        this.difference = whiteElo - blackElo;
        this.average = (whiteElo + blackElo) / 2;
    }
    


}
