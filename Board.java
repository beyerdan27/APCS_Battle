//board.java
//5 ships, 1 of length 5, 1 of length 4, 2 of leangth 3, one of length 2
//
public class Board{
	
	public static int ships[][];
	public static int guess[][]; //this is so that the compiler doesnt pee itself
/*public static void main(String[] args){
		//TEST THING
		for(int i=0; i<10; i++){
			for(int h=0; h<10; h++){
				ships[i][h] = 0;
			}
		}
		printBoard();
	}
	*/
	public Board(){
		 ships = new int[10][10];
		 guess = new int[10][10];
		
	}
	public static void setShipsBoard(int row, int column, int set){
		ships[row][column] = set;
	}
	public static int[][] getShipsBoard(){
		return ships;
	}
	public boolean checkShip(int row, int column){
		return (ships[row][column]==1);
	}
	public static void printShipsBoard(){
		for(int r=0; r<10; r++){
			for(int x=0; x<10;x++){
				System.out.print("----");
			}
			System.out.print("-\n");
			for(int c=0; c<10; c++){
				System.out.print("| ");
				System.out.print(ships[r][c]);
				System.out.print(" ");
			}
	System.out.print("|\n");
	}
	for(int a=0; a<10; a++){
		System.out.print("----");
	}
		System.out.print("-\n");
	}	
}
//OUR LORD AND SAVIOUR, ARRAYLIST<>    
