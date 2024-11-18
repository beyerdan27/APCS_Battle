//main tester :fire:
//tjonmg
public class Tester{
	public static void main(String[] args){
		Board temp = new Board();
		//temp.setShipsBoard(3, 4, 1);
		System.out.println(temp.checkShip(3, 4));
		temp.printShipsBoard();
		//printing all five ships
		temp.placeShip(2, 2, 3, false);
		temp.placeShip(3, 5, 6, true);
		temp.placeShip(3, 9, 4, false);
		temp.placeShip(5, 2, 9, true);
		temp.placeShip(4, 6, 0, true);
		//int output = temp.placeEntireShip(6, 0, false, 4);
		//System.out.println(output);
		temp.printShipsBoard();
	}
}

                    
