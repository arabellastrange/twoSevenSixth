package trees;

import java.util.Scanner;

public class run {
	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTreeStings tree2 = new BinarySearchTreeStings();
		
		String type;
		System.out.println("Please select the type of Binary Tree you wish to use \n"
							+ "Enter 'int' to use an integer tree \n"
							+ "Enter 'String' to use a string tree \n"
							+ "Your command:  ");
		
		Scanner s = new Scanner(System.in);
		type = s.next().trim().toLowerCase();
		String option;
		
		if(type.equals("int")){
			System.out.println("Hello! Please choose from the following options \n"
					+ " - Press A to add a value to your tree \n"
					+ " - Press R to remove a value form your tree \n"
					+ " - Press S to search your tree for a value \n"
					+ " - Press D to display all values in your tree \n"
					+ " - Press Q to Quit \n");
			do{
				System.out.println("Your command: ");
		   		option = s.next().trim().toUpperCase(); 
		   		switch(option){
		   		case "A": System.out.println("Please enter a value to add:  ");
		   				  int newVal = s.nextInt();
		   				  tree.add(newVal);
		   				  break;
		   		case "R": System.out.println("Please enter a value to remove: ");
		   				  newVal = s.nextInt();
		   				  tree.remove(newVal);
		   				  break;
		   		case "S": System.out.println("Please enter a value to search for: ");
		   				  newVal = s.nextInt();
		   				  if( tree.search(newVal)){
		   					  System.out.println("Found!");
		   				  }
		   				  else{
		   					  System.out.println("Not found, try again");
		   				  }
		   				  break;
		   		case "D": tree.print();
		   				  break;
		   		case "Q": System.out.println("Goodbye!");
		   				  break;
		   		default:  System.out.println("Please enter a vaild command");
		   			      break;
		   		}
			}
			while(!option.equals("Q"));
			
		}
		
		else if(type.equals("string")){				
			System.out.println("Hello! Please choose from the following options \n"
					+ " - Press A to add a string to your tree \n"
					+ " - Press R to remove a string form your tree \n"
					+ " - Press S to search your tree for a string \n"
					+ " - Press D to display all string in your tree \n"
					+ " - Press Q to Quit \n");
			do{
				System.out.println("Your command: ");
		   		option = s.next().trim().toUpperCase(); 
		   		switch(option){
		   		case "A": System.out.println("Please enter a value to add:  ");
 				  		  String newVal = s.next();
 				  		  tree2.add(newVal);
 				  		  break;
		   		case "R": System.out.println("Please enter a value to remove: ");
 				  		  newVal = s.next();
 				          tree2.remove(newVal);
 				          break;
		   		case "S": System.out.println("Please enter a value to search for: ");
 				  		  newVal = s.next();
 				  		  if(tree2.search(newVal)){
 				  			 System.out.println("Found!");
 				  			}
 				  		  else{
 				  				System.out.println("Not found, try again");
 				  		  }
 				  		  break;
		   		case "D": tree2.print();
		   			break;
		   		case "Q": System.out.println("Goodbye!");
		   			break;
		   		default: System.out.println("Please enter a vaild command");
		   			break;
		   		
		   		}	
			}
			while(!option.equals("Q"));
		}
	}
}
