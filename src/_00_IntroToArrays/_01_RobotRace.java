package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			
		
		//2. create an array of 5 robots.
			Robot[] robot = new Robot[5];
		//3. use a for loop to initialize the robots.
			for (int i = 0; i < robot.length; i++) {
				robot[i] = new Robot();
				
			}
			robot[0].moveTo(100, 550);
			robot[1].moveTo(200,550);
			robot[2].moveTo(300, 550);
			robot[3].moveTo(400, 550);
			robot[4].moveTo(500, 550);
			//4. make each robot start at the bottom of the screen, side by side, facing up
			
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
			for (int i = 0; i < robot.length; i++) {
				while (robot[i].getY() >= 0) {
					Random rand = new Random();
					int distance = rand.nextInt(50);
					robot[1].move(distance); 
				
					Random rand0 = new Random();
					int distance0 = rand0.nextInt(50);
					robot[0].move(distance0); 
		
					Random rand2 = new Random();
					int distance2 = rand2.nextInt(50);
					robot[2].move(distance2); 
			
					Random rand3 = new Random();
					int distance3 = rand3.nextInt(50);
					robot[3].move(distance3); 
		
					Random rand4 = new Random();
					int distance4 = rand4.nextInt(50);
					robot[4].move(distance4); 
				}
				if (robot[i].getY() >= 0) {
					System.out.println("Robot "+ robot[i] + " Wins" );
				}
			}
			
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

		}
}
