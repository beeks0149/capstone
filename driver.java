
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class driver extends JApplet implements ActionListener, WindowListener{

	public static void main(String[] args) {
		
		MovieList movies = new MovieList(2);
		movies.addMovie("it",90);
		movies.addMovie("jaws", 89);
		movies.addMovie("cool runnings", 70);
		TheaterList theaters = new TheaterList(1);
		theaters.addTheater("bville", "amc", 8);
		theaters.addTheater("edina", "southdale", 7);
		theaters.addTheater("ep", "AMC", 10);
		for(int i = 0;i<movies.getNumberOfMovies();i++){
			System.out.println(theaters.gettheater(i).getCity());
		}
		
		//button.addActionListener(this);
		
	    //new driver();
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*if(e.getSource()==btn1){
			new mygui();
		}
		if(e.getSource()==btn2){
			new mygui2();
		}
		if(e.getSource()==btn3){
			new mygui3();
		}*/
		
	}

}
