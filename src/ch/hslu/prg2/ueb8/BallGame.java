package ch.hslu.prg2.ueb8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallGame extends JPanel {

    private ArrayList<Ball> _ballList;
    
    /**
     * Creates new form BallGame
     */
    public BallGame() {
        initComponents();
        
        _ballList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setName("gameBoardPanel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Ball ball = new Ball(evt.getX(), evt.getY(), 40, Color.GREEN);
        _ballList.add(ball);
    }//GEN-LAST:event_formMouseClicked

    @Override
    public void paint(Graphics g) {
        for(Ball ball:_ballList){
            ball.move();
            ball.draw(g);
        }
    }
    
    public static void main(String[] args) {
		JFrame frame = new JFrame("Ball Game");
		frame.add(new BallGame());
		frame.setSize(470, 400);
                frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                while(true){
                    frame.repaint();
                }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
