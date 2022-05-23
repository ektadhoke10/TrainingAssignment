package array_example;

public class ArrayExamples {
 public void oneDimensionalArrayExample() {
	 int intArrayOfNum []=new int[5];
	 intArrayOfNum[0]=12;
	 intArrayOfNum[1]=21;
	 intArrayOfNum[2]=32;
	 intArrayOfNum[3]=25;
	 intArrayOfNum[4]=16;
	 
	 for(int intNum=0; intNum <intArrayOfNum.length; intNum++)
     {
        System.out.print(intArrayOfNum[intNum] + "  ");
     }  
	
 }
 
 public void twoDimensionalArrayExample() {
	 int intTwoDimensionalArray [][]=new int[3][3];
	 intTwoDimensionalArray[0][0]=12;
	 intTwoDimensionalArray[0][1]=21;
	 intTwoDimensionalArray[0][2]=32;
	 intTwoDimensionalArray[1][0]=25;
	 intTwoDimensionalArray[1][1]=16;
	 intTwoDimensionalArray[1][2]=21;
	 intTwoDimensionalArray[2][0]=15;
	 intTwoDimensionalArray[2][1]=19;
	 intTwoDimensionalArray[2][2]=24;
 
 
 for (int intRow = 0; intRow < intTwoDimensionalArray.length; ++intRow) {
     for(int intCol = 0; intCol < intTwoDimensionalArray[intRow].length; intCol++) {
         System.out.print(intTwoDimensionalArray[intRow][intCol] + " ");
     	}
     System.out.println();
 	}
 }
}