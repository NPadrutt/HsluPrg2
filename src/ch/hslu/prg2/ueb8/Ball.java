package ch.hslu.prg2.ueb8;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private final int _x;
    private int _y;
    private final int _radius;
    private final Color _color;
    
    public Ball(int x, int y, int radius, Color color){
        _x = x;
        _y = y;
        _radius = radius;
        _color = color;
    }
    
    public void draw(Graphics g){
        g.fillOval(_x,_y,_radius, _radius);
        g.setColor(Color.CYAN);
    }
    private int temp = 0;
    public void move(){
        if(temp != 80){
            temp ++;
            return;
        }
        temp = 0;
        if(_y -_radius < 300) {
            _y += 1;
        }
    }
}
