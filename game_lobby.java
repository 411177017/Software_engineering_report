import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game_lobby extends JFrame {

    public game_lobby() {
        setTitle("Game Lobby");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Game List
        String[] games = {"傳說對決", "跑跑卡丁車", "當個創世神", "巔峰極速", "NBA 2K23", "原神", "英雄聯盟"};
        JList<String> gameList = new JList<>(games);
        JScrollPane gameListScrollPane = new JScrollPane(gameList);
        mainPanel.add(gameListScrollPane, BorderLayout.CENTER);

        // Options Panel
        JPanel optionsPanel = new JPanel(new GridLayout(2, 1));
        JButton playButton = new JButton("遊玩遊戲");
        JButton watchButton = new JButton("觀看直播");
        optionsPanel.add(playButton);
        optionsPanel.add(watchButton);
        mainPanel.add(optionsPanel, BorderLayout.EAST);

        // Bottom Panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton logoutButton = new JButton("登出");
        JButton customerServiceButton = new JButton("客服中心");
        JButton rechargeButton = new JButton("儲值中心");
        bottomPanel.add(logoutButton);
        bottomPanel.add(customerServiceButton);
        bottomPanel.add(rechargeButton);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Action Listeners
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGame = gameList.getSelectedValue();
                if (selectedGame != null) {
                    JOptionPane.showMessageDialog(game_lobby.this, "開始遊玩 " + selectedGame);
                } else {
                    JOptionPane.showMessageDialog(game_lobby.this, "請選擇一個遊戲");
                }
            }
        });

        watchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGame = gameList.getSelectedValue();
                if (selectedGame != null) {
                    JOptionPane.showMessageDialog(game_lobby.this, "觀看 " + selectedGame + " 的直播");
                } else {
                    JOptionPane.showMessageDialog(game_lobby.this, "請選擇一個遊戲");
                }
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(game_lobby.this, "登出");
                // Add your logout logic here
            }
        });

        customerServiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(game_lobby.this, "進入客服中心");
                // Add your customer service logic here
            }
        });

        rechargeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(game_lobby.this, "進入儲值中心");
                // Add your recharge logic here
            }
        });

        add(mainPanel);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new game_lobby();
            }
        });
    }
}