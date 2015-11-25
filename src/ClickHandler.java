import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created indirectly by the universe.
 */
public class ClickHandler implements MouseListener {

    private final List<Box> panels;
    private boolean xTurn = true;

    public ClickHandler() {
        this.panels = new ArrayList<>();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (hasWinner()) {
            System.out.println("winner");
        }

        for(Box box: panels) {
            if (e.getSource() == box) {
                box.click(xTurn);
                xTurn = !xTurn;
                System.out.println(xTurn);
                System.out.println(box.getPoint().toString());
                box.repaint();
                box.removeMouseListener(this);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void addBox(Box box){
        panels.add(box);
    }

    private boolean hasWinner() {

        List<Box> boxesToCheck = new ArrayList<>();
        int counter = 0;
        
        boolean hasWinner = false;

        /* CHECK FIRST ROW */
        for (Box panel : panels) {
            if (counter ==3)
            {
                hasWinner = true;
                break;
            }
            if (panel.getPoint().getY() == 0) {
                boxesToCheck.add(panel);
                if(panel.isX())
                {
                    counter ++;
                }
            }
            if (panel.getPoint().getY() ==1)
        }



        return hasWinner;
    }
}
