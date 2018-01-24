package keeganStuff;

public class Keegan_RPG {

	static Items Basic_Sword = new Items (5, 20, 10, 3);
	static Monster Noob = new Monster (1, 1, 5, 1, 1);
	static Items Old_Bow = new Items (5, 10, 6, 30);
	static Monster Slattern_Kaiju = new Monster (150, 60, 300, 0, 300);
	static Items Scythe = new Items (15, 40, 8, 4);
	static Monster Godzilla = new Monster (80, 40, 200, 0, 180);
	static Items Gypsy_Danger_Jaeger = new Items (40, 120, 600, 200);
	static Monster Huge_Spider = new Monster (20, 20, 30, 10, 45);
	static Items Mace = new Items (20, 40, 12, 8);
	static Monster Alien = new Monster (10, 20, 7, 20, 60);
	static Items Horizon_Brave_Jaeger = new Items (30, 80, 8000, 110);
	static Monster Otachi_Kaiju = new Monster (100, 50, 200, 0, 200);
	static Items Gateway_Key = new Items (10000000, 1, 0, 50);
	static Monster Gateway_Blocker = new Monster (10000000, 0, 10000000, 0, 10000000);
	static Items Cross_Bow = new Items (15, 30, 4, 60);
	static Monster Precursor = new Monster (13, 20, 6, 10, 20);
	static Items Elegant_Bow = new Items (15, 80, 4, 120);
	static Monster Leatherback_Kaiju = new Monster (100, 50, 190, 0, 190);
	
	public static void main (String[]args) {
		
		
		
	}
	public static boolean fight (int playerPower, int playerStamina, int enemyPower, int enemyStamina) {
		
		if (playerPower > enemyPower) {
			
			if (playerStamina >= enemyStamina) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} else {
			
			if (enemyStamina >= playerStamina) {
				
				return false;
				
			} else {
				
				return true;
				
			}
			
		}
			
	}
}