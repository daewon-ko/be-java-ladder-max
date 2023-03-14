package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ladder {


    private List<LadderRow> ladder;
    private static final int LADDER_LNE_LENGTH = 5;


    public Ladder() {
        // 생성자 통해 ladder 배열 초기
        this.ladder = new ArrayList<>();
    }

    public List<LadderRow> makeLadder(int peopleNumber, int ladderHeight) {
        makeLadderRow(peopleNumber, ladderHeight);
        return this.ladder;
    }

    private void makeLadderRow(int peopleNumber, int ladderHeight) {
        for (int row = 0; row < ladderHeight; row++) {
            List<String> ladderRow = new ArrayList<>();
            makeLadderColumn(peopleNumber, ladderRow);
            ladder.add(ladderRow);
        }
    }

    private void makeLadderColumn(int peoleNumber, List<String> ladderRow) {
        for (int column = 0; column < 2 * peoleNumber - 1; column++) {
            makeBasicPeopleLine(ladderRow, column);
            verifyLadderLine(ladderRow, column);
        }
    }

    private void verifyLadderLine(List<String> ladderRow, int column) {
        if (!ladderRow.contains("-----")) {
            makeRandomLadderLine(ladderRow, column);
        }
    }

    private void makeBasicPeopleLine(List<String> ladderRow, int column) {
        if (column % 2 == 0) {
            ladderRow.add("|");
            return;
        }
        ladderRow.add("     ");
    }

    private void makeRandomLadderLine(List<String> ladderRow, int column) {
        Random random = new Random();
        if (column % 2 != 0 && random.nextBoolean()) {
            ladderRow.set(column, "-----");
        }
    }

    public List<LadderRow> getLadder() {
        return ladder;
    }


}