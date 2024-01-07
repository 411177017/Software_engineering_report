import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choice_interface {

    public static void main(String[] args) {
        // 創建主窗口
        JFrame frame = new JFrame("遊戲選擇");
        frame.setSize(300, 150);
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

        // 選擇標籤
        JLabel label = new JLabel("請選擇您想要進行的活動:");
        label.setBounds(10, 20, 250, 25);
        panel.add(label);

        // 觀看直播按鈕
        JButton watchStreamButton = new JButton("觀看直播");
        watchStreamButton.setBounds(10, 50, 120, 25);
        panel.add(watchStreamButton);

        // 遊玩遊戲按鈕
        JButton playGameButton = new JButton("遊玩遊戲");
        playGameButton.setBounds(140, 50, 120, 25);
        panel.add(playGameButton);

        // 觀看直播按鈕的事件處理
        watchStreamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "進入觀看直播模式");
            }
        });

        // 遊玩遊戲按鈕的事件處理
        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "進入遊玩遊戲模式");
            }
        });
    }
}
