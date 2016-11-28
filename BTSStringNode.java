package trees;

public class BTSStringNode {
 	private String value; 
    private BTSStringNode left; 
    private BTSStringNode right; 

    public BTSStringNode(String value) { 
          this.value = value; 
          left = null; 
          right = null; 
    } 
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public BTSStringNode getLeftChild() {
        return left;
    }
    
    public BTSStringNode getRightChild() {
        return right;
    }
     
    public void setLeftChild(BTSStringNode node) {
        left = node;
    }
      
    public void setRightChild(BTSStringNode node) {
        right = node;
    }
      
    public boolean search(String value) { 
        if (value.equals(this.value)) 
            return true; 
      else if (value.toString().compareTo(this.value.toString()) < 0) { 
            if (left == null) 
                  return false; 
            else 
                  return left.search(value); 
      } else if (value.toString().compareTo(this.value.toString()) > 0) { 
            if (right == null) 
                  return false; 
            else 
                  return right.search(value); 
      } 
      return false; 
    }
    
    public boolean add(String value) { 
        if (value.equals(this.value)) 
            return false; 
      else if (value.toString().compareTo(this.value.toString()) < 0) { 
            if (left == null) { 
                  left = new BTSStringNode(value); 
                  return true; 
            } else 
                  return left.add(value); 
      } else if (value.toString().compareTo(this.value.toString()) > 0) { 
            if (right == null) { 
                  right = new  BTSStringNode(value); 
                  return true; 
            } else 
                  return right.add(value); 
      } 
      return false; 
    } 

    public boolean remove(String value, BTSStringNode parent) { 
         if(value.compareTo(this.value) < 0){
        	 if (left != null) 
        		 return left.remove(value, this); 
        	 else
        		 return false; 
         }
         
         else if(value.compareTo(this.value) > 0){
	         if (right != null) 
	            return right.remove(value, this); 
	         else
	            return false; 
         }
         
         else {
	         if (left != null && right != null) { 
	             this.value = right.minValue(); 
	             right.remove(this.value, this); 
	         } 
	         else if (parent.left == this) { 
	             parent.left = (left != null) ? left : right; 
	         } 
	         else if (parent.right == this) { 
	             parent.right = (left != null) ? left : right; 
	         }  
	         return true; 
         }
 } 
 
  public String minValue() { 
       if (left == null) 
           return value; 
       else 
           return left.minValue(); 
  }
}
