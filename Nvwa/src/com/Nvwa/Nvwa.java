package com.Nvwa;

public class Nvwa {
	public static Person makePerson(String sex) throws UnsupportedPersonException{
		if(sex.equalsIgnoreCase("M")){
			return new Man();
			}
		else if(sex.equalsIgnoreCase("W")){
			return new Woman();
			}
		else{
			throw new UnsupportedPersonException("Î´ÖªµÄ×ÖÄ¸");
		}
		}
	}
	