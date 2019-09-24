package threedimensional;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import javafx.scene.input.KeyCode;

public class threedimensional extends baseframe2 implements KeyListener, MouseMotionListener {
	double rot1 = 1;
	double rot2 = 1;

	public threedimensional() {
	}

	public point threetotwoD(double x, double y, double z, double rot1, double rot2) {
		double X = -Math.cos(rot1) * x + Math.sin(rot1) * y;
		double Y = -Math.cos(rot2) * z + Math.sin(rot2) * (Math.sin(rot1) * x + Math.cos(rot1) * y);
		return new point(X, Y);
	}

	public void update(){
		for (double x = -100; x < 100; x++) {
			for (double y = -100; y < 100; y++) {
				for (double z = -100; z < 100; z++) {
					point p = threetotwoD(x,y,z,rot1,rot2);
				double mx = mousex;
				double my = mousey;
				double realx = x * pixelwidth;
				double realy = y * pixelheight;
				palette[(int) p.x+12][(int) p.y+12] = Color.WHITE;
				}
			}
		}
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e){

	}

	public static void main(String[] args) {
		threedimensional hi = new threedimensional();
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		rot1 = (double) -(e.getX() - 19) / 150;
		rot2 = (double) -(e.getY() - 429) / 150;
		repaint();

	}

}
