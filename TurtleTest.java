import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    Sketchpad sketchpad;

    @BeforeEach
    void setUp() {
        turtle = new Turtle();
        sketchpad = new Sketchpad();
    }

    @Test
    void testTurtle() {
        assertNotNull(turtle);
        turtle.changePenPosition(PenPosition.DOWN);
        turtle.moveForward(sketchpad.getSketchpad(), 12);
        turtle.turnRight();
        turtle.moveForward(sketchpad.getSketchpad(), 12);
        turtle.turnRight();
//        System.out.println(turtle.getCardinalPosition());
        turtle.moveForward(sketchpad.getSketchpad(), 12);
        turtle.turnRight();
//        System.out.println(turtle.getCardinalPosition());
        turtle.moveForward(sketchpad.getSketchpad(), 12);


        for (int i = 0; i < sketchpad.getSketchpad().length; i++) {
            for (int j = 0; j < sketchpad.getSketchpad().length; j++) {
                if(sketchpad.getSketchpad()[i][j] == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}