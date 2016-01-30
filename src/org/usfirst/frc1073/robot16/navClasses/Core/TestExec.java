package org.usfirst.frc1073.robot16.navClasses.Core;

import org.usfirst.frc1073.robot16.navClasses.gameObjects.Map;
import org.usfirst.frc1073.robot16.navClasses.gameObjects.RobotNav;

public class TestExec {

	public static void main(String[] args) {
		Map test = new Map(0.0,0.0,5.0,5.0);
		RobotNav testRobot = new RobotNav(2.0,2.0,1.0,1.0,test);
		
		int[][] localInt = testRobot.getMapRobotArray();
		
		for(int y = 0; y < 50; y++){
			for(int x = 0; x < 50; x++){
				System.out.print(localInt[x][y]);
			}
			System.out.println();
		}
	}

}
