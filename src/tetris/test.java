package tetris;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class test {
	public static void main(String[] args) {
		int i = (int)(Math.random()*4);
		if(i=='1') {
			System.out.print(i);
		}
		else
			System.out.print(i);
			System.out.print("error");
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int k = e.getKeyCode();
			
		}			
	}
}
