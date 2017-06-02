import java.util.Scanner;

class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[] flat;
		int[][] result =null;
		flat = new int[(nums.length*nums[0].length)];
		int k = 0;
		for (int i = 0; i < nums.length ; i++){	
			for (int j = 0; j < nums[0].length; j++){
					flat[k] = nums[i][j];
					k++;
				}
			}
		if(r == 1 && c == flat.length ){
				System.out.println("Valid");
				result = new int[r][c];
				for (int i = 0; i < c ; i++){	
					result[0][i] = flat[i];
					}
				}
		else if(c == 1 && r == flat.length ){
				System.out.println("Valid");
				result = new int[r][c];
				for (int i = 0; i < r ; i++){	
					result[i][0] = flat[i];
					}
				}
		else if(flat.length/r == c){
				result = new int[r][c];
				int k2 = 0;
				for (int i = 0 ; i < r ; i++){
					for (int j = 0; j < c; j++){
						result[i][j] = flat[k2];
						k2++;
					}
				} 
			}
		else{
			System.out.println("In Valid");
			result = new int[nums.length][nums[0].length];
			for (int i = 0; i < nums.length ; i++){	
				for (int j = 0; j < nums[0].length; j++){
					result[i][j] = nums[i][j];
					}
				}	
			}
		return result;
    }
		public void display(int[][] result){
			System.out.println("Row: " + result.length + "Column: " + result[0].length);
			for (int i = 0; i < result.length ; i++){	
				System.out.print("\n	");		
				for (int j = 0; j < result[0].length; j++){
					System.out.print(result[i][j] + " ");
				}
			}		
		}
	}


public class MatrixReshape {
	public static void main( String args[] ){
		Scanner sc = new Scanner(System.in);
		Solution so = new Solution();
		System.out.print("Enter number of row in the matrix: ");
		int row = sc.nextInt();	
		System.out.print("Enter number of column in the matrix: ");
		int column = sc.nextInt();
		int result[][];
		int[][] nums;
		nums = new int[row][column];
		for (int i = 0; i < row ; i++){		
			for (int j = 0; j < column ; j++){	
				nums[i][j] = sc.nextInt();
				}
			}
		System.out.print("Enter number of row for the reshaped matrix: ");
		int r = sc.nextInt();	
		System.out.print("Enter number of column in the reshaped matrix: ");
		int c = sc.nextInt();		
		
		result = so.matrixReshape(nums,r,c);
		so.display(result);
		}
	}