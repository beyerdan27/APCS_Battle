//main tester :fire:
//tjonmg
public class Tester{
	public static void main(String[] args){
		Board temp = new Board();
		//temp.setShipsBoard(3, 4, 1);
		System.out.println(temp.checkShip(3, 4));
		temp.printShipsBoard();
		//printing all five ships
		temp.placeEntireShip(2, 3, true, 2);
		temp.placeEntireShip(5, 6, false, 3);
		temp.placeEntireShip(9, 4, true, 3);
		temp.placeEntireShip(2, 9, false, 5);
		int output = temp.placeEntireShip(6, 0, false, 4);
		System.out.println(output);
		temp.printShipsBoard();
	}
}

                    
