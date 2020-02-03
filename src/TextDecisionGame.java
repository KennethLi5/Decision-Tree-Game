/* 
 * Instructor/Programmer: Clinton Rogers
 * Date: 4/2/2019
 * Any documents, source code, or work you create/modify as a result of this project is the 
 * property of the University of Massachusetts Dartmouth.  This document and any and all source 
 * code cannot be shared with anyone except: University of Massachusetts Dartmouth faculty 
 * (including TA’s), and in a private digital portfolio (public access online is prohibited) 
 * with the intention of applying to jobs and internships. These exceptions are non-transferable. 
 * Failure to comply is, at the very least, an academic infraction that could result in dismissal 
 * from the university. 
 * 
 * Student Name:
 * Date:
 */


import java.util.Scanner;


public class TextDecisionGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecisionTree dt = new DecisionTree();
		char choice;
		
		do{
			System.out.println("What file your you like to load?");
			String filename = input.nextLine();
			
			//Load up a game from the text file
			dt.loadTreeFromFile(filename);
			
			//Beginning playing.
			dt.play();
			
			
			do{
				System.out.println("Would you like to play again? Y/N");
				choice = input.nextLine().charAt(0);
			}while((choice != 'n')&&(choice != 'N')&&(choice != 'Y')&&(choice != 'y'));

		}while(choice == 'Y' || choice == 'y');

	}

}
