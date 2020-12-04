package pac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_frog=new JLabel();
    JLabel label_frog2=new JLabel();
    JLabel label_frog3=new JLabel();
    JLabel label_score=new JLabel();
    JLabel label_txt=new JLabel();
    JLabel label_score1=new JLabel();
    JLabel label_score2=new JLabel();
    JLabel label_score3=new JLabel();
    JTextArea textArea_UserInput=new JTextArea();
    JFrame frame = new JFrame("小跳蛙");
    int  score=0;
    String score1,score2,score3;
    String array2d_ganmeMap[][]= {
            {"hello","world","hi"},
            {"morning","afternoon","night"},
            {"tomy","jery","uncle"},
            {"abc","def","ghi"},
            {"345","678","123"}
    };
    int level=1;
    Random random = new Random();
    int colunm=0;

    //构造方法
    public App() {
        colunm=random.nextInt(5);
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_UserInput.append(String.valueOf(e.getKeyChar()));
                if (level==1){
                    if (textArea_UserInput.getText().equals("hello") && label_frog.getX()==0 && label_frog.getY()==430){
                        score++;
                        label_frog.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("world") && label_frog.getX()==306 && label_frog.getY()==256){
                        score++;
                        label_frog.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("hi") && label_frog.getX()==256 && label_frog.getY()==106){
                        score++;
                        label_frog.setBounds(606,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals("hello") && label_frog2.getX()==50 && label_frog2.getY()==430){
                        score++;
                        label_frog2.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("world") && label_frog2.getX()==306 && label_frog2.getY()==256){
                        score++;
                        label_frog2.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("hi") && label_frog2.getX()==256 && label_frog2.getY()==106){
                        score++;
                        label_frog2.setBounds(706,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals("hello") && label_frog3.getX()==100 && label_frog3.getY()==430){
                        score++;
                        label_frog3.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("world") && label_frog3.getX()==306 && label_frog3.getY()==256){
                        score++;
                        label_frog3.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals("hi") && label_frog3.getX()==256 && label_frog3.getY()==106){
                        score++;
                        label_frog3.setBounds(806,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (score==9){
                       int game =  JOptionPane.showConfirmDialog(null, "恭喜通关！！！", "提示", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
                        if (game == JOptionPane.NO_OPTION){
                            JOptionPane.showMessageDialog(null, "游戏结束", "提示", JOptionPane.ERROR_MESSAGE);
                            frame.setVisible(false);
                        }
                        label_txt.setText("第2关/共2关");
                        java.net.URL imgURL = App.class.getResource("img/background2.png");
                        label_background.setIcon(new ImageIcon(imgURL));
                        label_background.setBounds(0,0,1024,600);
                        label_frog.setBounds(0,430,128,128);
                        label_frog2.setBounds(50,430,128,128);
                        label_frog3.setBounds(100,430,128,128);
                        score=0;
                        level++;
                        label_score1.setText(array2d_ganmeMap[colunm][0]);
                        label_score2.setText(array2d_ganmeMap[colunm][1]);
                        label_score3.setText(array2d_ganmeMap[colunm][2]);
                        label_score.setText("得分:"+score);
                    }
                }
                if (level==2){
                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][0]) && label_frog.getX()==0 && label_frog.getY()==430){
                        score++;
                        label_frog.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][1]) && label_frog.getX()==306 && label_frog.getY()==256){
                        score++;
                        label_frog.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][2]) && label_frog.getX()==256 && label_frog.getY()==106){
                        score++;
                        label_frog.setBounds(606,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][0]) && label_frog2.getX()==50 && label_frog2.getY()==430){
                        score++;
                        label_frog2.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][1]) && label_frog2.getX()==306 && label_frog2.getY()==256){
                        score++;
                        label_frog2.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][2]) && label_frog2.getX()==256 && label_frog2.getY()==106){
                        score++;
                        label_frog2.setBounds(706,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][0]) && label_frog3.getX()==100 && label_frog3.getY()==430){
                        score++;
                        label_frog3.setBounds(306,256,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][1]) && label_frog3.getX()==306 && label_frog3.getY()==256){
                        score++;
                        label_frog3.setBounds(256,106,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }

                    if (textArea_UserInput.getText().equals(array2d_ganmeMap[colunm][2]) && label_frog3.getX()==256 && label_frog3.getY()==106){
                        score++;
                        label_frog3.setBounds(806,20,128,128);
                        textArea_UserInput.setText("");
                        label_score.setText("得分："+score);
                    }
                    if (score==9){
                        JOptionPane.showMessageDialog(null, "恭喜通关！！！", "通关啦", JOptionPane.INFORMATION_MESSAGE);
                        frame.setVisible(false);
                    }
                }




            }
        });
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
                    textArea_UserInput.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){


        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(200,500,150,50);
        myPanel.add(textArea_UserInput);
        textArea_UserInput.setVisible(false);

        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);

        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        label_frog.setIcon(new ImageIcon(imgURL2));
        label_frog.setBounds(0,430,128,128);
        java.net.URL imgURL3 = App.class.getResource("img/frog.png");
        label_frog2.setIcon(new ImageIcon(imgURL3));
        label_frog2.setBounds(50,430,128,128);
        java.net.URL imgURL4 = App.class.getResource("img/frog.png");
        label_frog3.setIcon(new ImageIcon(imgURL4));
        label_frog3.setBounds(100,430,128,128);


        label_txt.setText("第1关/共2关");
        label_txt.setFont(new Font("微软雅黑",1,24));
        label_txt.setBounds(450,0,200,50);
        label_score.setText("得分：0");
        label_score.setFont(new Font("微软雅黑",1,24));
        label_score.setBounds(450,50,200,50);

        label_score1.setFont(new Font("微软雅黑",1,30));
        label_score1.setBounds(426,326,200,50);
        label_score2.setFont(new Font("微软雅黑",1,30));
        label_score2.setBounds(276,176,200,50);
        label_score3.setFont(new Font("微软雅黑",1,30));
        label_score3.setBounds(626,80,200,50);

        myPanel.add(label_score1);
        myPanel.add(label_score2);
        myPanel.add(label_score3);
        myPanel.add(label_score);
        myPanel.add(label_frog);
        myPanel.add(label_frog2);
        myPanel.add(label_frog3);
        myPanel.add(label_txt);
        myPanel.add(label_background);


        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
