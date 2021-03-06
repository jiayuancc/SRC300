import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
public class BackgroundPanel extends JPanel {   
    private Image image;
    public BackgroundPanel() {
        super();
        setOpaque(false);
        setLayout(null);
    }
    public void setImage(Image image) {
        this.image = image;
    }
    protected void paintComponent(Graphics g) {// 重写绘制组件外观
        if (image != null) {
            int width = getWidth();
            int height = getHeight();
            g.drawImage(image, 0, 0, width, height, this);// 绘制图片与组件大小相同
        }
        super.paintComponent(g);// 执行超类方法
    }
}
