
class ReversingString_Problem_1 {
    public static void main(String[] args) {
 
        
        String s= "123456789";
        int j=0;
        
        
        char[] c = new char[s.length()];
        
      for(int i= s.length()-1; i>=0; i--){
            c[j] = s.charAt(i);
            System.out.println(c[j]);
            j++;
        }
        

        
        System.out.println(c);
    }
}
