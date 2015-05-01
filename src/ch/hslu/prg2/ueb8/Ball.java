package ch.hslu.prg2.ueb8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball {
    private final Random random = new Random();
    private final Random random1 = new Random();
    private final Random random2 = new Random();
    
    private final int _x;
    private int _y;
    private int _opacity = 255;
    private int _speed ;
    
    private final int _radius;
    private Color _color;
    
    public Ball(int x, int y){
        _speed = random.nextInt(5)+1;
        _radius = random.nextInt(30) + 20;
        _x = x - _radius /2;
        _y = y - _radius /2;        
        _color = new Color(random.nextInt(255), random1.nextInt(255), random2.nextInt(255),_opacity);
    }
    
    public void draw(Graphics g){
        g.fillOval(_x,_y,_radius, _radius);
        g.setColor(_color);
    }
    
    public void move(){
        if((_y + 2*_radius) < 400) {
            _y += _speed;
        } else{
            if(_opacity > 0){
                if(_opacity < _speed){
                    _opacity = 0;
                }else {
                    _opacity -= _speed;
                }               
                
                _color = new Color(_color.getRed(), _color.getGreen(), _color.getBlue(),_opacity);
            }
        }
    }
}
