
/**
 * Name: Mike Liang
 * Date: Feb 16 2022
 * Description:
 * This is a turtle program that draws a house and colors it
 */

/*
 * What are the attributes for:
 * 
 * - the position of the turtle
 * 
 * this.__location
 * 
 * - the direction of the turtle
 * 
 * this.__direction
 * 
 * - the colour of the pen
 * 
 * this.__penColor
 * 
 * - if you can see it or not
 * 
 * this.__isVisible
 * 
 * - it the pen is down or not
 * 
 * this._isPenDown
 * 
 * What are the instructions to:
 * - move forward
 * 
 * this.forward()
 * 
 * - turn right/left
 * 
 * this.left()
 * this.right()
 * 
 * - place a dot
 * 
 * this.dot()
 * 
 * - place a stamp of the turtle
 * 
 * this.stamp()
 * 
 * 
 * - change the colour of the turtle
 * 
 * this.fillColor()
 * 
 * - change the colour of the turtle's pen
 * 
 * this.penColor()
 * 
 * - lift the pen off the canvas
 * 
 * this.up()
 * 
 * - put the pen onto the canvas
 * 
 * this.down()
 * 
 */

public class TurtleMain {
  public static void main(String[] a) {
    Turtle bob = new Turtle();
    bob.penColor("black");
    bob.width(10);
    bob.speed(1);

    final int WALL_LENGTH = 250;
    final int WALL_BASE_LENGTH = 300;
    final int WALL_TO_DOOR = 170;
    final int DOOR_WIDTH = 80;
    final int DOOR_HEIGHT = 150;
    final int BASE_TO_WINDOW = 70;
    final int WINDOW_SIDE = 80;
    final int WINDOW_GRID = 30;
    final int WALL_TO_WINDOW = 60;
    final int OUTCROP = 30;
    final int ROOF_SLANT = 255;
    final int CHIMNEY_HEIGHT = 100;
    final int CHIMNEY_WIDTH = 60;

    bob.forward(WALL_BASE_LENGTH);
    bob.left(90);
    bob.forward(WALL_LENGTH);
    bob.left(90);
    bob.forward(WALL_BASE_LENGTH);
    bob.left(90);
    bob.forward(WALL_LENGTH);

    // Reset bob
    bob.right(180);

    // fill house
    bob.right(90);
    bob.forward(10);
    bob.left(90);
    bob.forward(9);
    bob.penColor("red");
    bob.forward(WALL_LENGTH - 19);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 19);
    bob.right(90);
    bob.forward(WALL_LENGTH - 19);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 29);
    bob.right(90);
    bob.forward(WALL_LENGTH - 29);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 39);
    bob.right(90);
    bob.forward(WALL_LENGTH - 39);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 49);
    bob.right(90);
    bob.forward(WALL_LENGTH - 49);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 59);
    bob.right(90);
    bob.forward(WALL_LENGTH - 59);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 69);
    bob.right(90);
    bob.forward(WALL_LENGTH - 69);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 79);
    bob.right(90);
    bob.forward(WALL_LENGTH - 79);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 89);
    bob.right(90);
    bob.forward(WALL_LENGTH - 89);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 99);
    bob.right(90);
    bob.forward(WALL_LENGTH - 99);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 109);
    bob.right(90);
    bob.forward(WALL_LENGTH - 109);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 119);
    bob.right(90);
    bob.forward(WALL_LENGTH - 119);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 129);
    bob.right(90);
    bob.forward(WALL_LENGTH - 129);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 139);
    bob.right(90);
    bob.forward(WALL_LENGTH - 139);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 149);
    bob.right(90);
    bob.forward(WALL_LENGTH - 149);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 159);
    bob.right(90);
    bob.forward(WALL_LENGTH - 159);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 169);
    bob.right(90);
    bob.forward(WALL_LENGTH - 169);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 179);
    bob.right(90);
    bob.forward(WALL_LENGTH - 179);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 189);
    bob.right(90);
    bob.forward(WALL_LENGTH - 189);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 199);
    bob.right(90);
    bob.forward(WALL_LENGTH - 199);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 209);
    bob.right(90);
    bob.forward(WALL_LENGTH - 209);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 219);
    bob.right(90);
    bob.forward(WALL_LENGTH - 219);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 229);
    bob.right(90);
    bob.forward(WALL_LENGTH - 229);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 239);
    bob.right(90);
    bob.forward(WALL_LENGTH - 239);
    bob.right(90);
    bob.forward(WALL_BASE_LENGTH - 249);

    // Reposition bob
    bob.up();
    bob.setPosition(0, 0);
    bob.right(90);

    // Draw door
    bob.right(90);
    bob.forward(WALL_TO_DOOR);
    bob.left(90);
    bob.penColor("black");
    bob.down();
    bob.forward(DOOR_HEIGHT);
    bob.right(90);
    bob.forward(DOOR_WIDTH);
    bob.right(90);
    bob.forward(DOOR_HEIGHT);
    bob.right(180);

    // Set up bob
    bob.up();
    bob.left(90);
    bob.forward(10);
    bob.right(90);
    bob.forward(10);
    bob.penColor("darkgray");
    bob.down();

    // Fill door
    bob.forward(DOOR_HEIGHT - 19);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 19);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 19);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 29);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 29);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 39);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 39);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 49);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 49);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 59);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 59);
    bob.left(90);
    bob.forward(DOOR_WIDTH - 69);
    bob.left(90);
    bob.forward(DOOR_HEIGHT - 69);

    // Reset Bob
    bob.up();
    bob.setPosition(0, 0);

    // Position bob for window
    bob.right(90);
    bob.forward(WALL_TO_WINDOW);
    bob.left(90);
    bob.forward(BASE_TO_WINDOW);

    // Fill window
    bob.penColor("white");
    bob.down();
    bob.forward(WINDOW_SIDE);
    bob.right(90);
    bob.forward(WINDOW_SIDE);
    bob.right(90);
    bob.forward(WINDOW_SIDE);
    bob.right(90);
    bob.forward(WINDOW_SIDE);
    bob.right(90);
    bob.up();
    bob.forward(10);
    bob.right(90);
    bob.forward(10);
    bob.down();
    bob.forward(WINDOW_SIDE - 19);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 19);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 19);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 29);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 29);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 39);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 39);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 49);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 49);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 59);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 59);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 69);
    bob.left(90);
    bob.forward(WINDOW_SIDE - 69);

    // Reset Bob
    bob.up();
    bob.setPosition(0, 0);

    // Reposition bob
    bob.forward(WALL_TO_WINDOW);
    bob.left(90);
    bob.forward(BASE_TO_WINDOW);

    // Draw window frame
    bob.penColor("black");
    bob.down();
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + WINDOW_GRID + 20);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(180);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.right(90);
    bob.forward(WINDOW_GRID + 10);
    bob.left(90);
    bob.forward(WINDOW_GRID + 10);
    bob.left(90);
    bob.forward(WINDOW_GRID + 10);
    bob.left(90);
    bob.forward(WINDOW_GRID + 10);

    // Reset bob
    bob.up();
    bob.setPosition(0, 0);

    // Draw roof
    bob.forward(WALL_LENGTH);
    bob.left(90);
    bob.down();
    bob.forward(OUTCROP);
    bob.right(135);
    bob.forward(ROOF_SLANT);
    bob.right(90);
    bob.forward(ROOF_SLANT);
    bob.right(135);
    bob.forward(OUTCROP);

    // Reset bob
    bob.up();
    bob.setPosition(0, 0);
    bob.right(90);

    // Draw chimney
    bob.forward(WALL_LENGTH);
    bob.right(90);
    bob.forward(50);
    bob.left(90);
    bob.forward(80);
    bob.down();
    bob.forward(CHIMNEY_HEIGHT);
    bob.right(90);
    bob.forward(CHIMNEY_WIDTH);
    bob.right(90);
    bob.forward(30);
    bob.penColor("brown");
    bob.right(45);
    bob.up();
    bob.forward(10);
    bob.down();
    bob.forward(65);
    bob.right(135);
    bob.forward(CHIMNEY_HEIGHT - 25);
    bob.right(90);
    bob.forward(CHIMNEY_WIDTH - 9);
    bob.right(90);
    bob.forward(11);
    bob.right(45);
    bob.forward(65);
    bob.right(135);
    bob.forward(48);
    bob.right(90);
    bob.forward(CHIMNEY_WIDTH - 25);
    bob.right(135);
    bob.forward(CHIMNEY_WIDTH - 15);
    bob.right(135);
    bob.forward(25);
    bob.right(90);
    bob.forward(15);
    bob.up();

    // Reposition bob
    bob.setPosition(0, 0);
    bob.left(90);

    // Color roof
    bob.forward(WALL_LENGTH);
    bob.left(90);
    bob.forward(OUTCROP - 10);
    bob.right(135);
    bob.forward(10);
    bob.penColor("black");
    bob.down();
    bob.forward(ROOF_SLANT - 26);
    bob.right(90);
    bob.forward(ROOF_SLANT - 26);
    bob.right(135);
    bob.forward(WALL_BASE_LENGTH + 15);
    bob.right(135);
    bob.forward(ROOF_SLANT - 40);
    bob.right(90);
    bob.forward(ROOF_SLANT - 55);
    bob.right(135);
    bob.forward(WALL_BASE_LENGTH);
    bob.right(135);
    bob.forward(ROOF_SLANT - 55);
    bob.right(90);
    bob.forward(ROOF_SLANT - 65);
    bob.right(135);
    bob.forward(WALL_BASE_LENGTH - 15);
    bob.right(135);
    bob.forward(ROOF_SLANT - 40);
    bob.right(90);
    bob.forward(ROOF_SLANT - 55);
    bob.right(135);

    // Pretend code is written to finish coloring rest of roof

  }
}