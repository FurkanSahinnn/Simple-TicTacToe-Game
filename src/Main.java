import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class GameDisplayer extends Frame implements ActionListener {
    // Implement components
    Button[] buttons = new Button[9];
    Button restartGame;
    int[] statements = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int k = 0;
    int x = 240;
    int y = 120;
    int switch_users = 0;
    private final Image bgImage;
    public GameDisplayer() {
        bgImage = Toolkit.getDefaultToolkit().createImage("bg_image.jpg"); // Add bg_image source path.
        setLayout(null);
        setVisible(true);
        setSize(800, 600);
        setLocation(400, 100);

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                buttons[k] = new Button();
                buttons[k].setSize(120, 120);
                buttons[k].setLocation(x, y);
                buttons[k].setFont(new Font("", Font.BOLD, 40));
                // Don't forget add() method.
                add(buttons[k]);
                // If Button is triggered, what will do?
                // We can add trigger feature to button using addActionListener(this)
                buttons[k].addActionListener(this);
                buttons[k].setBackground(Color.MAGENTA);
                k++;
                x += 120;
            }
            x = 240;
            y += 120;
        }
        restartGame = new Button("New Game");
        restartGame.setSize(160, 40);
        restartGame.setLocation(340, 500);
        restartGame.setForeground(Color.black);
        restartGame.setBackground(Color.WHITE);
        restartGame.setFont(new Font("",Font.BOLD,20));

        add(restartGame);
        restartGame.addActionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
    }

    // ActionListener interface is notified whenever you click on the button or menu item.
    // It is notified against ActionEvent.
    @Override
    public void actionPerformed(ActionEvent e) {
        // If restart button is triggered.
        if (e.getSource().equals(restartGame)) {
            for (int i = 0 ; i < 9; i++) {
                buttons[i].setLabel("");
            }
            statements = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}; // Return starting statements.
        }

        // If game buttons are triggered.
        for (int i = 0; i < 9; i++) {
            // 0 -> O
            // 1 -> X
            if (e.getSource().equals(buttons[i]) && statements[i] == 0) {
                if (switch_users == 0) {
                    buttons[i].setLabel("O");
                    switch_users++;
                } else {
                    buttons[i].setLabel("X");
                    switch_users--;
                }
                statements[i]++;
            }
        }

        // Winning Conditions
        Font font = new Font("",Font.BOLD,20);
        Label p1;
        int l = 60;
        if (Objects.equals(buttons[0].getLabel(), buttons[1].getLabel()) && Objects.equals(buttons[0].getLabel(), buttons[2].getLabel())) {

            if (Objects.equals(buttons[0].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;

            }

            if (Objects.equals(buttons[0].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);

            }
        }
        else if (Objects.equals(buttons[3].getLabel(), buttons[4].getLabel()) && Objects.equals(buttons[4].getLabel(), buttons[5].getLabel())) {

            if (Objects.equals(buttons[3].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;

            }

            if (Objects.equals(buttons[3].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[6].getLabel(), buttons[7].getLabel()) && Objects.equals(buttons[6].getLabel(), buttons[8].getLabel())) {

            if (Objects.equals(buttons[6].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[6].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[0].getLabel(), buttons[3].getLabel()) && Objects.equals(buttons[0].getLabel(), buttons[6].getLabel())) {

            if (Objects.equals(buttons[0].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[0].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[1].getLabel(), buttons[4].getLabel()) && Objects.equals(buttons[1].getLabel(), buttons[7].getLabel())) {

            if (Objects.equals(buttons[1].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[1].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[2].getLabel(), buttons[5].getLabel()) && Objects.equals(buttons[5].getLabel(), buttons[8].getLabel())) {

            if (Objects.equals(buttons[2].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[2].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[0].getLabel(), buttons[4].getLabel()) && Objects.equals(buttons[0].getLabel(), buttons[8].getLabel())) {

            if (Objects.equals(buttons[0].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[0].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
        else if (Objects.equals(buttons[2].getLabel(), buttons[4].getLabel()) && Objects.equals(buttons[2].getLabel(), buttons[6].getLabel())) {

            if (Objects.equals(buttons[2].getLabel(), "O")) {

                p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
                l+=50;
            }

            if (Objects.equals(buttons[2].getLabel(), "X")) {

                p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(340,l);
                p1.setFont(font);
                add(p1);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GameDisplayer gameDisplayer = new GameDisplayer();
    }
}
