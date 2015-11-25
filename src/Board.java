import javax.swing.*;
import java.awt.*;

/**
 * Created indirectly by the universe.
 */
public final class Board extends JFrame {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public boolean xTurn;
    private ClickHandler clickHandler;


    public Board() {
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Luffarschack");
        setLayout(new GridLayout(0, 3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.xTurn = true;
        this.clickHandler = new ClickHandler();
        setup9Boxes();
    }

    private void setup9Boxes() {

        for (int i = 0; i < 9; i++) {
            Point p;
            switch(i) {
                case 0:
                    p = new Point(0, 0);
                    break;
                case 1:
                    p = new Point(1, 0);
                    break;
                case 2:
                    p = new Point(2, 0);
                    break;
                case 3:
                    p = new Point(0, 1);
                    break;
                case 4:
                    p = new Point(1, 1);
                    break;
                case 5:
                    p = new Point(2, 1);
                    break;
                case 6:
                    p = new Point(0, 2);
                    break;
                case 7:
                    p = new Point(1, 2);
                    break;
                case 8:
                    p = new Point(2, 2);
                    break;
                default:
                    p = null;
                    break;
            }

            Box box = new Box(WIDTH / 3, HEIGHT / 3, p);

            if (i % 2 == 0) {
                box.setBackground(Color.MAGENTA);
            } else {
                box.setBackground(Color.black);
            }

            box.addMouseListener(clickHandler);

            this.add(box);
            clickHandler.addBox(box);
        }
    }


}
