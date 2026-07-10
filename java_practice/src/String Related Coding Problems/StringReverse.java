
// Write a code to reverse a String without using a String Method??

public class StringReverse {
    public static void main(String[] args) {
       
       // the below code and the code in the comments has the same time completxity that is O(n²) so the better approach is StringBuilder
          String name = "saikumar";
        String RS = "";
        
        for (int i=name.length()-1;i>=0;i--){
            
            System.out.println(name.charAt(i));
            RS = RS + name.charAt(i);
        }
        
        System.out.println(RS);

           /*  
                             String name = "saikumar";
                        String RS = "";
                
                        for (int i = name.length() - 1; i >= 0; i--) {
                            System.out.println(name.charAt(i));
                            RS = RS + name.charAt(i);
                        }
                
                        System.out.println(RS);
           
           
           */
      
    }
}
