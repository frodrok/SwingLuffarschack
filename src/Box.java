import javax.swing.*;
import java.awt.*;

/**
 * Created indirectly by the universe.
 */
public class Box extends JPanel {

    private final int boxHeight;
    private final int boxWidth;
    private boolean clicked;
    private boolean isX;
    private final Point point;


    public Box(int boxHeight, int boxWidth, Point point) {
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
        this.point = point;
        System.out.println(point.toString());

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(5f);
        g2d.setStroke(stroke);

        if (clicked) {
            if (isX) {
                drawX(g2d);
            } else {
                drawO(g2d);
            }
        }

    }

    private void drawO(Graphics2D g2d) {
        if (getBackground() == Color.black) {
            g2d.setColor(Color.magenta);
        } else {
            g2d.setColor(Color.black);
        }
        g2d.drawOval(10,0, boxWidth-10, boxHeight-10);
    }

    private void drawX(Graphics2D g2d) {
        if (getBackground() == Color.black) {
            g2d.setColor(Color.magenta);
        } else {
            g2d.setColor(Color.black);
        }
        g2d.drawLine(0, 0, boxWidth, boxHeight);
        g2d.drawLine(boxWidth, 0, 0, boxHeight);
    }

    public void click(boolean x) {
        this.clicked = true;
        this.isX = x;
    }

    public Point getPoint() {
        return point;
    }

    public boolean isX() {
        return isX;
    }
}
