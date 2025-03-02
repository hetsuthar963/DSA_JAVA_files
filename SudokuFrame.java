import javax.swing.*;

public class SudokuFrame extends JFrame {

    private SudokuPanel boardPanel;
    private JButton newGameButton;
    private JButton checkButton;
    private JButton exitButton;

    public SudokuFrame() {
        super("Sudoku Game");

        boardPanel = new SudokuPanel();
        newGameButton = new JButton("New Game");
        checkButton = new JButton("Check");
        exitButton = new JButton("Exit");

        add(boardPanel, BorderLayout.CENTER);
        add(newGameButton, BorderLayout.SOUTH);
        add(checkButton, BorderLayout.SOUTH);
        add(exitButton, BorderLayout.SOUTH);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SudokuFrame();
    }
}