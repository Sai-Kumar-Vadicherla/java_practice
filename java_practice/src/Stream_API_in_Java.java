
import java.util.*;
import java.util.stream.*;
class Stream_API_in_Java {
    public static void main(String[] args) {
    
        
        List<Integer> data = Arrays.asList(4,5,9,1,3,2,6);
        
        /*Stream<Integer> stream =  //we w=even dont need this*/ data.stream().map(n->n*2).sorted().forEach(n->System.out.println(n));   // video time 13:47
        
        /* We dont need all these because we can do all these in  line*///Stream<Integer> mappedStream = stream.map(n->n*2) ;  // map returns a new stream
        
       // mappedStream.forEach(n->System.out.println(n));
         
     //    Stream<Integer> sort = stream.sorted(); //this returns a stream
     /*    long count = stream.count(); */
        /*  System.out.println(count);  */  //   here stream is already consume so when try to exute stream in next line it will throw an error
        
       // stream.forEach(n -> System.out.println(n)); // this will get a error because it is already used that is streams so i write the below code
       
      // sort.forEach(n->System.out.println(n));
  /*     for(int n : data){
           System.out.println(n*2);   this is without map and streams
       }*/
       
       
       
         // stream.forEach(n -> System.out.println(n));   once you consume the stream you can't reuse it
         
         /* When you work on the data that is when you have huge amount of you work on it and close it so you not get data leakage so you dont have some unused resources open  */
        
    }
}
