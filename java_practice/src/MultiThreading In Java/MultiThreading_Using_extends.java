/*
MultiThreading_Using_extends.java

PART 1:

1. What is Thread?
A thread is a lightweight sub-process and the smallest unit of execution in a program.
It represents a separate path of execution inside a program.
Example: In a browser, one thread downloads a file while another plays video.

2. What is Multithreading?
Multithreading is a process in which multiple threads run simultaneously within a single program.
It allows concurrent execution of tasks.
Example: A music player can play song, show animation, and download lyrics at the same time.

3. Why do we need Multithreading?
We use multithreading because:
- To improve CPU utilization
- To perform multiple tasks at the same time
- To make programs faster and efficient
- To improve responsiveness of applications
- To reduce idle time of CPU

Without multithreading, programs run one task at a time (sequential execution), which wastes system resources.

4. Creating a thread using extends Thread
In Java, one way to create a thread is by extending the Thread class.

Steps:
- Create a class that extends Thread
- Override the run() method
- Call start() method to execute the thread

Important:
start() creates a new thread and calls run()
run() contains the code executed by the thread
*/

public class MultiThreading_Using_extends {

    public static void main(String[] args) {

        System.out.println("===== MAIN THREAD STARTED =====");

        MyThread t1 = new MyThread();

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread -> " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("===== MAIN THREAD FINISHED =====");
    }
}

class MyThread extends Thread {

    public void run() {

        System.out.println("Child Thread Started");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread -> " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Child Thread Finished");
    }
}
