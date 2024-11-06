//main tester :fire:
//tjonmg
public class Tester{
	public static void main(String[] args){
		Board temp = new Board();
		temp.setShipsBoard(3, 4, 1);
		System.out.println(temp.checkShip(3, 4));
		temp.printShipsBoard();
	}
} 
                    
