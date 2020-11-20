public class Sketchpad {
    private int[][] sketchpad = new int[20][20];

    public int[][] getSketchpad() {
        return sketchpad;
    }

    public void displaySketchpad() {
        for (int row[] : sketchpad)
            for (int col : row)
                System.out.print(col);
            System.out.println();
    }
}

