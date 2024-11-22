public class Bingo{
	private static int[][] board = new int[5][5];
	private static boolean foundYet;
	public static void main(String[] args){
		
		genCard();
	}
	public static void genCard(){
		int[] currentCol = new int[5];
		int temp = 0;
		for(int i=0; i<5; i++){
			for(int a=0; a<5; a++){
				while(true){
					temp = (int) (Math.random()*15)+(15*i)+1;
					foundYet = false;
					for(int c=0; c<5; c++){
						if(temp == currentCol[c]){
							foundYet = true;
						}
					}
					if(!foundYet){break;};
				}
				currentCol[a] = temp;
				board[a][i] = temp;
			}
		currentCol = new int[5];
		}
		board[2][2] = 0;
		for(int i=0; i<5; i++){
			for(int a=0; a<5; a++){
				System.out.print(board[i][a] + "\t");
			}
			System.out.println("\n");
		}
	}
}
