package opgave;

public class ThreadPush extends Thread {
    private Stack stack;
    private int startValue;
    private int increment;

    public ThreadPush(Stack stack, int startValue, int increment) {
        this.stack = stack;
        this.startValue = startValue;
        this.increment = increment;
    }

    @Override
    public void run() {
        int value = startValue;
        while (true) {
            synchronized (stack) {
                stack.push(value);
                System.out.println("Pushed: " + value);
                stack.notify(); // Notify waiting pop thread(s)
                value += increment;
            }
        }
    }
}
