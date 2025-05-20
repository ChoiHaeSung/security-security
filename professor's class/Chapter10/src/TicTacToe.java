import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    private static final int SIZE = 3; // 게임판 크기
    private JButton[][] buttons = new JButton[SIZE][SIZE]; // 버튼 배열
    private char currentPlayer = 'X'; // 현재 플레이어
    private char[][] board = new char[SIZE][SIZE]; // 게임판

    public TicTacToe() {
        setTitle("Tic-Tac-Toe Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(SIZE, SIZE)); // 3x3 격자 레이아웃

        // 게임판 초기화
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' '; // 빈칸으로 초기화
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setEnabled(true); // 버튼을 클릭 가능하게 설정
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    // 버튼 클릭 이벤트 처리
    private class ButtonClickListener implements ActionListener {
        int row, col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // 이미 클릭된 버튼을 다시 클릭할 수 없도록
            if (board[row][col] != ' ') {
                return;
            }

            // 현재 플레이어의 기호를 버튼에 설정
            board[row][col] = currentPlayer;
            buttons[row][col].setText(String.valueOf(currentPlayer));

            // 승리 여부 확인
            if (checkWinner()) {
                JOptionPane.showMessageDialog(TicTacToe.this, "플레이어 " + currentPlayer + "가 승리했습니다!");
                resetGame();
                return;
            }

            // 무승부 체크
            if (isBoardFull()) {
                JOptionPane.showMessageDialog(TicTacToe.this, "무승부입니다!");
                resetGame();
                return;
            }

            // 플레이어 전환
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    // 승리 판별
    private boolean checkWinner() {
        // 가로, 세로, 대각선 체크
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // 대각선 체크
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    // 게임판이 가득 찼는지 확인
    private boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // 게임 리셋
    private void resetGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
                buttons[i][j].setText(" ");
                buttons[i][j].setEnabled(true); // 다시 클릭 가능하게 설정
            }
        }
        currentPlayer = 'X'; // X부터 시작
    }

    public static void main(String[] args) {
        new TicTacToe(); // 게임 시작
    }
}
