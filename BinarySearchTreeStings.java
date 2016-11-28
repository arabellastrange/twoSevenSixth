package trees;

public class BinarySearchTreeStings {
	 private BTSStringNode root; 
	 
     public BinarySearchTreeStings() { 
           root = null; 
     } 

     public boolean search(String value) { 
    	 if (root == null) 
             return false; 
    	 else 
             return root.search(value); 
     }

     public boolean add(String value) { 
    	 if (root == null) { 
             root = new BTSStringNode(value); 
             return true; 
       } 
       else 
             return root.add(value);
     } 

     public boolean remove(String value) { 
       if (root == null) 
          return false; 
       else { 
          if (root.getValue().equals(value)) { 
              BTSStringNode auxRoot = new BTSStringNode(" "); 
              auxRoot.setLeftChild(root); 
              boolean result = root.remove(value, auxRoot); 
              root = auxRoot.getLeftChild(); 
              return result; 
          } 
          
          else { 
              return root.remove(value, null); 
          } 
        } 
     }
     
     	 
	 public void print(){
		 printExpression(root);
	 }
	 
	 public void printExpression(BTSStringNode n){
		 if(n != null){
			 printExpression(n.getLeftChild());
			 System.out.println(" " + n.getValue());
			 printExpression(n.getRightChild());
		 }
		 else{
			 return;
		 }
	 }
}
