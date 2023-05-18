package opgave;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // Create and start the pop thread
        ThreadPop popThread = new ThreadPop(stack);
        popThread.start();

        // Create and start the push thread
        ThreadPush pushThread = new ThreadPush(stack, 1, 2);
        pushThread.start();

        // Sleep for a while to allow the threads to run
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the threads to stop the execution
        popThread.interrupt();
        pushThread.interrupt();
    }
}




