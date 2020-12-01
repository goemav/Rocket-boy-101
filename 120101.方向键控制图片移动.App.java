package pac;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_panel=new JLabel();
    JLabel label_back=new JLabel();
    int cell=64;
    int row=0,coulmn=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    coulmn--;
                    label_panel.setBounds(row*cell,coulmn*cell,cell,cell);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    coulmn++;
                    label_panel.setBounds(row*cell,coulmn*cell,cell,cell);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                     row++;
                    label_panel.setBounds(row*cell,coulmn*cell,cell,cell);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    row--;
                    label_panel.setBounds(row*cell,coulmn*cell,cell,cell);
                }
                if (label_panel.getX()>=myPanel.getWidth() && label_panel.getY()>=myPanel.getHeight()){
                    System.out.println("超了");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        URL imgURL = App.class.getResource("img/plane0.gif");
        label_panel.setIcon(new ImageIcon(imgURL));
        label_panel.setBounds(0,0,cell,cell);
        URL imgURL2 = App.class.getResource("img/background.png");
        label_back.setIcon(new ImageIcon(imgURL2));
        label_back.setBounds(0,0,512,720);
        myPanel.add(label_panel);
        myPanel.add(label_back);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

    }
    public static void main(String[] args) {
        new App().go();
    }
}
