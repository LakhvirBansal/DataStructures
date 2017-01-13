package com.java.codeSchool;

import java.util.Scanner;

public class KnightMoves {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no_of_test_cases = sc.nextInt();
		
		for (int no = 0; no < no_of_test_cases; no++) {
			
			Scanner s = new Scanner(System.in);
			String numbers = s.nextLine();
			String[] startAndEndNum = numbers.split(" ");
			int startRowInitial = Integer.parseInt(startAndEndNum[0]);
			int startColumnInitial = Integer.parseInt(startAndEndNum[1]);
			int EndRow = Integer.parseInt(startAndEndNum[2]);
			int EndColumn = Integer.parseInt(startAndEndNum[3]);

			int count = 0;
			for (int i = 1; i <= 8; i++) {
				
				/*if(startRow > 7 || EndRow > 7){
					count = 0;
					break;
				}*/
				int startRow = startRowInitial;
				int startColumn = startColumnInitial;
				switch(i){
				case 1:
					int case1Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							count = case1Count;
						}
						case1Count++;
						startRow = startRow + 1;
						startColumn = startColumn + 2;
					}
					break;
				case 2:
					int case2Count = 0;
					while(startRow < 8 && startColumn < 8 && startRow >= 0 && startColumn>= 0 ){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case2Count < count){
								count = case2Count;
							}
						}
						case2Count++;
						startRow = startRow + 1;
						startColumn = startColumn - 2;
					}
					break;
				case 3:
					int case3Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case3Count < count){
								count = case3Count;
							}
						}
						case3Count++;
						startRow = startRow - 1;
						startColumn = startColumn + 2;
					}
					break;
				case 4:
					int case4Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case4Count < count){
								count = case4Count;
							}
						}
						case4Count++;
						startRow = startRow - 1;
						startColumn = startColumn - 2;
					}
					break;
				case 5:
					int case5Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case5Count < count){
								count = case5Count;
							}
						}
						case5Count++;
						startRow = startRow + 2;
						startColumn = startColumn + 1;
					}
					break;
				case 6:
					int case6Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case6Count < count){
								count = case6Count;
							}
						}
						case6Count++;
						startRow = startRow + 2;
						startColumn = startColumn - 1;
					}
					break;
				case 7:
					int case7Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case7Count < count){
								count = case7Count;
							}
						}
						case7Count++;
						startRow = startRow - 2;
						startColumn = startColumn + 1;
					}
					break;
				case 8:
					int case8Count = 0;
					while(startRow < 8 && startColumn < 8  && startRow >= 0 && startColumn>= 0){
						if(startRow == EndRow && startColumn == EndColumn){
							if(case8Count < count){
								
								count = case8Count;
							}
						}
						case8Count++;
						startRow = startRow - 2;
						startColumn = startColumn -1 ;
					}
					break;
				}
			}
			
			System.out.println("the least count is :"+ count);
		}
	}
}
