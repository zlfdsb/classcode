package feijidazhan;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class feiji extends Frame {

    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);//窗口默认不可见，让其可见
        this.setSize(500,500);
        this.setLocation(300,300);

//      增加窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Color old = g.getColor();
        g.setColor(Color.blue);
        //g就是画笔
        g.drawLine(100,50,400,400);
        g.drawRect(100,50,400,400);
        g.drawOval(100,50,400,400);
        g.drawString("zlf",100,100);

        g.setColor(old);
    }

    public static void main(String[] args) {
        feiji f=new feiji();
        f.launchFrame();
    }
}
