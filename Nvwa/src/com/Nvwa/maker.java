package com.Nvwa;

import java.util.Scanner;

public class maker {
	public static void main(String[] args) throws UnsupportedPersonException {	
			Scanner reader = new Scanner(System.in);
			Person a;
			String sex = reader.nextLine();
			a = Nvwa.makePerson(sex);
			a.MakePerson();
			reader.close();
	}

	}

