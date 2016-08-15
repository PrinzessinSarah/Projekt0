package de.fi.teamthermometer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThermometerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] rechteck = { { " ", "___", "" }, { "|", "   ", "|" }, { "|", "   ", "|" }, { "|", "   ", "|" },
				{ "|", "   ", "|" }, { "|", "___", "|" } };

		String ausgabe = "";
		boolean pruefer;
		String eingabeWert;

		String pfad = ("N:\\Funktionen\\Azubis-FI\\Standort Münster\\AzubisMS15\\LEBK\\Projekte\\Barometer\\Projekt Null\\thermometer.txt");

		Scanner sc = new Scanner(System.in);

		GregorianCalendar datum = new GregorianCalendar();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

		System.out.println("Gib deinen Namen ein: ");
		String eingabeText = sc.nextLine();

		do {
			System.out
					.println("Gib deine Zufriedenheit mit einem Wert zwischen 0 (unzufrieden) und 5 (sehr zufrieden) ein.");
			eingabeWert = sc.next();

			pruefer = !(Pattern.matches("\\d*", eingabeWert)) || Integer.parseInt(eingabeWert) < 0
					|| Integer.parseInt(eingabeWert) > 6;
			if (pruefer) {
				System.out.println("Ihre Eingabe ist ungültig.");
			}
		} while (pruefer);

		switch (Integer.parseInt(eingabeWert)) {
		case 1:
			rechteck[5][1] = "xxx";
			break;
		case 2:
			rechteck[5][1] = "xxx";
			rechteck[4][1] = "xxx";
			break;
		case 3:
			rechteck[5][1] = "xxx";
			rechteck[4][1] = "xxx";
			rechteck[3][1] = "xxx";
			break;
		case 4:
			rechteck[5][1] = "xxx";
			rechteck[4][1] = "xxx";
			rechteck[3][1] = "xxx";
			rechteck[2][1] = "xxx";
			break;
		case 5:
			rechteck[5][1] = "xxx";
			rechteck[4][1] = "xxx";
			rechteck[3][1] = "xxx";
			rechteck[2][1] = "xxx";
			rechteck[1][1] = "xxx";
			break;
		}
		ausgabe = eingabeText + "s Zufriedenheitsskala vom " + df.format(datum.getTime()) + " :" + "\r\n";

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
			out = new BufferedWriter(new FileWriter(pfad, true));
			out.write(ausgabe);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Datei nicht erstellt");
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
