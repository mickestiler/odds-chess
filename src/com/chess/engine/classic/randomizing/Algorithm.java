package com.chess.engine.classic.randomizing;

import com.chess.engine.classic.Alliance;
import com.chess.engine.classic.board.Board;
import com.chess.engine.classic.board.Board.Builder;
import com.chess.engine.classic.pieces.Bishop;
import com.chess.engine.classic.pieces.Knight;
import com.chess.engine.classic.pieces.Queen;
import com.chess.engine.classic.pieces.Rook;

public class Algorithm {
    private final Builder builder;
    final int elo;
    final int average;
    Alliance alliance;
    public Algorithm(Builder builder, int elo, int average, Alliance alliance) {
        this.builder = builder;
        this.elo = elo;
        this.average = average;
        this.alliance = alliance;
    }

    public void Randomize(Alliance alliance) {
        if (alliance.isBlack()) {
            for (int i = 0; i < 8; i++) {
                if (i != 4) {
                    int randomPiece = (int) (Math.random() * 5);
                    placePiece(randomPiece, i);
                }
            }
        }
        else {
            for (int i = 56; i < 64; i++) {
                if (i != 60) {
                    int randomPiece = (int) (Math.random() * 5);
                    placePiece(randomPiece, i);
                }
            }
        }
    }

    public void placePiece(int pieceGenerator, int position) {
        if (pieceGenerator == 0) builder.setPiece(new Rook(alliance, position));
        if (pieceGenerator == 1) builder.setPiece(new Knight(alliance, position));
        if (pieceGenerator == 2) builder.setPiece(new Bishop(alliance, position));
        if (pieceGenerator == 3) builder.setPiece(new Queen(alliance, position));
    }
    
}
