/*
Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football
_Player and Hockey_ Player from Player class.
*/

class Player{
	public String sportPlayed = ""; 
}

class Cricket_Player extends Player{}
class Football_Player extends Player{}
class Hockey_Player extends Player{}

public class BasicInheritance{

	public static void main(String args[]){

		Cricket_Player dhoni = new Cricket_Player();
		Football_Player chhetri = new Football_Player();
		Hockey_Player singh = new Hockey_Player();

		dhoni.sportPlayed = "Cricket";
		chhetri.sportPlayed = "Football";
		singh.sportPlayed = "Hockey";

		System.out.println(dhoni.sportPlayed);
		System.out.println(chhetri.sportPlayed);
		System.out.println(singh.sportPlayed);
	}
}