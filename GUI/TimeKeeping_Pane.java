package GUI;

import java.awt.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.*;

public class TimeKeeping_Pane extends JPanel {

	JPanel secondSegBody;
	JPanel firstSegBody;

	JLabel secondSegs[]; // Second Segment. 10 components
	JLabel firstSegs[]; // First Segment. 8 components

	JLabel clockLabel; //clock icon

	JLabel meridiemLabel; //AM PM
	JLabel dowLabel; // day of week

	public TimeKeeping_Pane() {

		setVisible(true);
		setSize(400,240);
		setLocation(45, 30);
		setBackground(Color.white);
		setLayout(null);
		
        secondSegBody = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D)g;
                RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHints(qualityHints);
                g2.setStroke(new BasicStroke(3));

                g2.drawRoundRect(2, 2, this.getWidth()-4, this.getHeight()-4, 20, 20);

            }
        };
        firstSegBody = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D)g;
                RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHints(qualityHints);
                g2.setStroke(new BasicStroke(3));

                g2.drawRoundRect(2, 2, this.getWidth()-4, this.getHeight()-4, 20, 20);

            }
        };

		//Images
		ImageIcon seg14DeadBigImg = new ImageIcon(ImageDir.SegDead14Big_dir);
		ImageIcon seg14DeadImg = new ImageIcon(ImageDir.SegDead14_dir);
		ImageIcon colonImg = new ImageIcon(ImageDir.colon_dir);
		ImageIcon colonBigImg = new ImageIcon(ImageDir.colonBig_dir);
		ImageIcon clockImg = new ImageIcon(ImageDir.clock_dir);
		ImageIcon clockDeadImg = new ImageIcon(ImageDir.clockDead_dir);
		ImageIcon num0BigImg = new ImageIcon(ImageDir.num0big_dir);
		ImageIcon num0Img = new ImageIcon(ImageDir.num0_dir);
		
		//second Seg
		secondSegs = new JLabel[10];
		for(int i=0; i<10; i++){
			if(!(i == 4 || i == 7)) secondSegs[i] = new JLabel(num0Img);
			else secondSegs[i] = new JLabel(colonImg);
		}
	
		//first Seg
		firstSegs = new JLabel[8];
		for(int i=0; i<8; i++){
			if(!(i==2 || i==5)) firstSegs[i] = new JLabel(num0BigImg);
			else firstSegs[i] = new JLabel(colonBigImg);
		}
		
		//Clock Icon
		clockLabel = new JLabel(clockDeadImg);
		
		meridiemLabel = new JLabel("AM");
		dowLabel = new JLabel("MON");

		//second seg panel Info
		secondSegBody.setSize(205, 55);
		secondSegBody.setLocation(25,35);
		secondSegBody.setBackground(Color.white);
		secondSegBody.setLayout(new GridLayout(1, 10, 0, 0));
		secondSegBody.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); // Internal margin

		//first seg panel info
		firstSegBody.setSize(360, 95);
		firstSegBody.setLocation(20, 120);
		firstSegBody.setBackground(Color.white);
		firstSegBody.setLayout(new GridLayout(1, 8, 0, 0));
		firstSegBody.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); // Internal margin

		//clock image component info
		clockLabel.setSize(50, 50);
		clockLabel.setLocation(this.getWidth() - 80, secondSegBody.getLocation().y - 2);
		
		//AM/PM & dayofweek component info
		meridiemLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
		meridiemLabel.setHorizontalAlignment(SwingConstants.LEFT);
		meridiemLabel.setBounds((secondSegBody.getLocation().x+secondSegBody.getWidth()) + 5, secondSegBody.getLocation().y + 5, 41, 21);
		dowLabel.setFont(new Font("Open Sans", Font.BOLD, 13));
		dowLabel.setHorizontalAlignment(SwingConstants.LEFT);
		dowLabel.setBounds((secondSegBody.getLocation().x+secondSegBody.getWidth()) + 5, secondSegBody.getLocation().y + 25, 41, 21);

		//Component adding
		add(firstSegBody);
		add(secondSegBody);
		add(clockLabel);
		add(meridiemLabel);
		add(dowLabel);


		for(int i=0; i<10; i++){
			secondSegBody.add(secondSegs[i]);
		}

		for(int i=0; i<8; i++){
			firstSegBody.add(firstSegs[i]);
		}

		this.repaint();
		this.revalidate();
	}
	
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHints(qualityHints);
        g2.setStroke(new BasicStroke(3));

        g2.drawRoundRect(2, 2, this.getWidth()-5, this.getHeight()-5, 40, 40);

    }
}
