class A extends Thread {
    public void run(){
         for(int i=0; i<=100; i++){
        System.out.print("Hi");
        System.out.println(" ");
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
        System.out.print("Hello");
        System.out.println(" ");
        }
    }
}
class MultiThreading_Using_Extends_Example {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        obj2.start();
    }
}
