package org.usfirst.frc1073.robot16.navClasses;

public class TestExec {

	public static void main(String[] args) {
		Map test = new Map(50,50,20,20);
		int [][] localInt = test.getMapArray();
		for(int y = 0; y < 50; y++){
			for(int x = 0; x < 50; x++){
				System.out.print(localInt[x][y]);
			}
			System.out.println();
		}
		/*
		test.updateRobotPosition(5, 10);
		localInt = test.getMapArray();
		for(int y = 0; y < 50; y++){
			for(int x = 0; x < 50; x++){
				System.out.print(localInt[x][y]);
			}
			System.out.println();
		}
		*/

	}

}
