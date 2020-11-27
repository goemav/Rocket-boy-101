package pac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.security.MessageDigest;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_img=new JLabel();
    JLabel label_txt=new JLabel();
    JLabel label_sy=new JLabel();
    JLabel label_q=new JLabel();
    JLabel label_q1=new JLabel();
    JLabel label_q2=new JLabel();
    JFrame frame = new JFrame("怪兽找不同");

    int sum=0,num1=0,num2=0,num3=0,guan=1,synum;
    //构造方法
    public App() {
        if (guan==1){
            synum=3;
            label_sy.setText("剩余不同："+synum);
        }
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX()+" "+e.getY());
                if (guan==1){
                    if (e.getX()<180 && e.getY()<250 && e.getX()>0 && e.getY()>50){
                        num1=1;
                        sum=num1+num2+num3;
                        label_q.setText("棒");
                        label_q.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    }
                    else if (e.getX()<200 && e.getY()<600 && e.getX()>0 && e.getY()>200){
                        num2=1;
                        sum=num1+num2+num3;
                        label_q1.setText("棒");
                        label_q1.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    }
                    else if (e.getX()<500 && e.getY()<600 && e.getX()>420 && e.getY()>500){
                        num3=1;
                        sum=num1+num2+num3;
                        label_q2.setText("棒");
                        label_q2.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    } else{
                        sum--;
                        label_txt.setText("得分"+String.valueOf(sum));
                    }
                    if (sum==3){
                        URL imgURL = App.class.getResource("img/backgroud2.jpg");
                        label_img.setIcon(new ImageIcon(imgURL));
                        JOptionPane.showMessageDialog(null, "下一关！", "通关啦", JOptionPane.ERROR_MESSAGE);
                        label_q.setText("");
                        label_q1.setText("");
                        label_q2.setText("");
                        guan++;
                        num1=0;
                        num2=0;
                        num3=0;
                        sum=0;
                        synum=3;
                        label_txt.setText("得分："+sum);
                    }
                }else if (guan==2){
                    if (e.getX()<350 && e.getY()<300 && e.getX()>300 && e.getY()>250){
                        label_q.setBounds(323,243,100,100);
                        num1=1;
                        sum=num1+num2+num3;
                        label_q.setText("棒");
                        label_q.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    }
                    else if (e.getX()<330 && e.getY()<600 && e.getX()>280 && e.getY()>500){
                        label_q1.setBounds(309,489,100,100);
                        num2=1;
                        sum=num1+num2+num3;
                        label_q1.setText("棒");
                        label_q1.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    }
                    else if (e.getX()<100 && e.getY()<700 && e.getX()>20 && e.getY()>600){
                        label_q2.setBounds(55,564,100,100);
                        num3=1;
                        sum=num1+num2+num3;
                        label_q2.setText("棒");
                        label_q2.setForeground(Color.yellow);
                        label_txt.setText("得分："+String.valueOf(sum));
                        label_sy.setText("剩余不同："+(3-sum));
                    } else{
                        sum--;
                        label_txt.setText("得分"+String.valueOf(sum));
                    }
                    if (sum==3){
//                        URL imgURL = App.class.getResource("img/backgroud2.jpg");
//                        label_img.setIcon(new ImageIcon(imgURL));
                        JOptionPane.showMessageDialog(null, "恭喜通关！！！", "通关啦", JOptionPane.INFORMATION_MESSAGE);
                        label_q.setText("");
                        label_q1.setText("");
                        label_q2.setText("");
                        guan++;
                        num1=0;
                        num2=0;
                        num3=0;
                        sum=0;
                        label_txt.setText("得分："+sum);
                    }
                }
                if (sum<0){
                    JOptionPane.showMessageDialog(null, "游戏结束！", "游戏结束", JOptionPane.ERROR_MESSAGE);
                    frame.setVisible(false);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        URL imgURL = App.class.getResource("img/backgroud.jpg");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,1024,701);
        label_txt.setFont(new Font("微软雅黑",1,24));
        label_txt.setBounds(20,0,200,100);
        label_txt.setText("得分："+sum);
        label_sy.setFont(new Font("微软雅黑",1,24));
        label_sy.setBounds(20,50,200,100);
        label_q.setBounds(50,100,100,100);
        label_q1.setBounds(50,250,100,100);
        label_q2.setBounds(480,500,100,100);
        myPanel.add(label_q2);
        myPanel.add(label_q1);
        myPanel.add(label_q);
        myPanel.add(label_sy);
        myPanel.add(label_txt);
        myPanel.add(label_img);

        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,701);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
