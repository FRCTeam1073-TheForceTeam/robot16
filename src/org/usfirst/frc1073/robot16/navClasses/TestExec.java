package org.usfirst.frc1073.robot16.navClasses;

public class TestExec {

	public static void main(String[] args) {
		Map test = new Map(0.0,0.0,5.0,5.0);
		int[][] localInt = test.getMapArray();
		for(int y = 0; y < 50; y++){
			for(int x = 0; x < 50; x++){
				System.out.print(localInt[x][y]);
			}
			System.out.println();
		}
	}

}
