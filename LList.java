
package Lab4;


public class LList {
     Node top;
    int size=0;
    
    public void Queue(int v){
        Node n = new Node(v);
  
        n.link = top;
        top = n;
        size++;
    }
    
    public Object DeQueue(){
         
         Object object = null;
        try {
            if (top == null) {
                object = null;
            } else if (top.link == null) {
                object = top.val;
                top = null;
            } else {
                Node tempPtr = top;
                while (tempPtr.link.link != null) {
                    tempPtr = tempPtr.link;
                }
                object = tempPtr.link.val;
                tempPtr.link = null;
            }
        } catch (NullPointerException e) {
            System.out.println("Queue is empty \n" + e.getMessage());
        }

        return object;
    }

    
    public int size(){
        
        int s = 0;
        Node tempPtr = top;
        
        while(tempPtr !=null){
            s++;
            tempPtr = tempPtr.link;
        }
        
        return s;
    }
    
    public String toString(){
        
        String output = "Stack Element: ";
        Node tempPtr = top;
        
        while(tempPtr !=null){
            output += tempPtr.val + ", ";
            tempPtr = tempPtr.link;
        }
        
        
        return output;
    }
    
    
}