package org.usfirst.frc1073.robot16.navClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestExec {

	public static void main(String[] args) {
		Map test = new Map();
		int [][] localInt = test.getMapArray();
		for(int y = 0; y < localInt[0].length; y++){
			for(int x = 0; x < localInt.length; x++){
				System.out.print(localInt[x][y]);
			}
			System.out.println();
		}
		
		try{
            File file = new File("C:\\FRCWorkspace\\robot16\\src\\org\\usfirst\\frc1073\\robot16\\navClasses\\test.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < localInt[0].length; i++) {
            	for(int j = 0; j < localInt.length; j++){
            		if(localInt[j][i] == 0){
            			bufferedWriter.write(" ");
            		}
            		else{
            			bufferedWriter.write("" + localInt[j][i]);
            		}
            	}
            	bufferedWriter.write("\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
