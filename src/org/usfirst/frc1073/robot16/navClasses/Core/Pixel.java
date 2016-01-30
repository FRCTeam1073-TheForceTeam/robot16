package org.usfirst.frc1073.robot16.navClasses.Core;

/**
 * Sets states of "pixels"
 * @author Matt
 */

public class Pixel {
	//states: 0 = empty, 1 = impassable, 2-10 = obstacle
	private int state = 0;
	private int x;
	private int y;

	public Pixel(int xCo,int yCo){
		x = xCo;
		y = yCo;
	}
	public void notOccupied(){
		state = 0;
	}
	public void robot(){
		state = 1;
	}
	public void obstacle(int obstacleCode){
		state = obstacleCode;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}


}
