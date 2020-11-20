public class Turtle {
    private int rowPosition = 0;
    private int colPosition = 0;
    PenPosition penPosition = PenPosition.UP;
    CardinalPosition cardinalPosition = CardinalPosition.NORTH;

    public void changePenPosition(PenPosition position) {
        penPosition = position;
    }

    public PenPosition getPenPosition() {
        return penPosition;
    }

    public void moveForward(int[][] sketchpad,int spaces) {
        if (cardinalPosition == CardinalPosition.NORTH) {
            for(int i = 0; i < spaces; i++) {
                sketchpad[rowPosition][i] = 1;
            }
            colPosition = spaces - 1;
        }
        else if (cardinalPosition == CardinalPosition.EAST) {
            for (int i = 0; i < spaces; i++) {
                sketchpad[i][colPosition] = 1;
            }
            rowPosition = spaces - 1;
        }
        else if (cardinalPosition == CardinalPosition.SOUTH) {
            for (int i = spaces - 1; i >= 0; i--) {
                sketchpad[rowPosition][i] = 1;
            }
            colPosition = colPosition - --spaces;
        }
        else if (cardinalPosition == CardinalPosition.WEST) {
            for (int i = spaces - 1; i >= 0; i--) {
                sketchpad[i][colPosition] = 1;
            }
            rowPosition = rowPosition - --spaces;
        }

    }

    public void turnRight() {
        if (cardinalPosition == CardinalPosition.NORTH)
            cardinalPosition = CardinalPosition.EAST;
        else if (cardinalPosition == CardinalPosition.EAST)
            cardinalPosition = CardinalPosition.SOUTH;
        else if (cardinalPosition == CardinalPosition.SOUTH)
            cardinalPosition = CardinalPosition.WEST;
        else if (cardinalPosition == CardinalPosition.WEST)
            cardinalPosition = CardinalPosition.NORTH;
    }

    public CardinalPosition getCardinalPosition() {
        return cardinalPosition;
    }
}
