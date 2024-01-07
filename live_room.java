import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class live_room {

    public static void main(String[] args) {
        // 創建主窗口
        JFrame frame = new JFrame("遊戲直播房間");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 創建面板
        JPanel panel = new JPanel();
        placeComponents(panel);

        // 將面板添加到框架中
        frame.add(panel);

        // 使框架可見
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // 房間標題
        JLabel roomTitleLabel = new JLabel("遊戲直播房間 - 範例主播");
        roomTitleLabel.setBounds(10, 10, 400, 25);
        panel.add(roomTitleLabel);

        // 送禮按鈕
        JButton sendGiftButton = new JButton("送禮");
        sendGiftButton.setBounds(10, 40, 80, 25);
        panel.add(sendGiftButton);

        // 按讚按鈕
        JButton likeButton = new JButton("按讚");
        likeButton.setBounds(100, 40, 80, 25);
        panel.add(likeButton);

        // 留言框
        JTextArea commentTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(commentTextArea);
        scrollPane.setBounds(10, 80, 300, 300);
        panel.add(scrollPane);

        // 留言按鈕
        JButton commentButton = new JButton("留言");
        commentButton.setBounds(10, 390, 80, 25);
        panel.add(commentButton);

        // 關注按鈕
        JButton followButton = new JButton("關注");
        followButton.setBounds(100, 390, 80, 25);
        panel.add(followButton);

        // 退出房間按鈕
        JButton leaveRoomButton = new JButton("退出房間");
        leaveRoomButton.setBounds(200, 390, 120, 25);
        panel.add(leaveRoomButton);

        // 查看個人檔案按鈕
        JButton viewProfileButton = new JButton("查看個人檔案");
        viewProfileButton.setBounds(330, 390, 150, 25);
        panel.add(viewProfileButton);

        // 送禮按鈕的事件處理
        sendGiftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "送禮功能尚未實現");
            }
        });

        // 按讚按鈕的事件處理
        likeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "按讚功能尚未實現");
            }
        });

        // 留言按鈕的事件處理
        commentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comment = commentTextArea.getText();
                JOptionPane.showMessageDialog(null, "留言: " + comment);
            }
        });

        // 關注按鈕的事件處理
        followButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "關注功能尚未實現");
            }
        });

        // 退出房間按鈕的事件處理
        leaveRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "退出房間功能尚未實現");
            }
        });

        // 查看個人檔案按鈕的事件處理
        viewProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "查看個人檔案功能尚未實現");
            }
        });
    }
}