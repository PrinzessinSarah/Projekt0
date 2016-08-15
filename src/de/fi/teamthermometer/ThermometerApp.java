package de.fi.teamthermometer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThermometerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] rechteck = {{" ","___",""},{"|", "   ", "|"},{"|", "   ", "|"},{"|", "   ", "|"},
				{"|", "   ", "|"},{"|", "___", "|"}};
		
		String ausgabe = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib deinen Namen ein: ");
		String eingabeText = sc.nextLine();
		
		System.out.println("Gib deine Zufriedenheit mit einem Wert zwischen 0 (unzufrieden) und 5 (sehr zufrieden) ein.");
		int eingabeWert =sc.nextInt();
		
		switch (eingabeWert){
		case 1: rechteck[5][1] = "xxx";
			break;
		case 2: rechteck[5][1] = "xxx";
				rechteck[4][1] = "xxx";
			break;
		case 3: rechteck[5][1] = "xxx";
				rechteck[4][1] = "xxx";
				rechteck[3][1] = "xxx";
			break;
		case 4: rechteck[5][1] = "xxx";
				rechteck[4][1] = "xxx";
				rechteck[3][1] = "xxx";
				rechteck[2][1] = "xxx";
			break;
		case 5: rechteck[5][1] = "xxx";
				rechteck[4][1] = "xxx";
				rechteck[3][1] = "xxx";
				rechteck[2][1] = "xxx";
				rechteck[1][1] = "xxx";
			break;
		}
		ausgabe = eingabeText+"s Zufriedenheitsskala:\r\n";
		
		System.out.println(ausgabe);
		for (int i = 0; i < rechteck.length; i++) {
			for (int j = 0; j < rechteck[i].length; j++) {
				System.out.print(rechteck[i][j]);
				ausgabe = ausgabe + rechteck[i][j];
			}
			System.out.println();
			ausgabe += "\r\n";
		}
		ausgabe += "\r\n";
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("thermometer.txt", true));
			out.write(ausgabe);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Datei nicht erstellt");
		} finally {
			if(out != null) {
				try { out.close(); } catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		

	}

}
