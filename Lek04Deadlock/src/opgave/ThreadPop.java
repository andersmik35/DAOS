package opgave;

public class ThreadPop extends Thread {

    private Stack stack;

    public ThreadPop(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stack) {
                if (!stack.is_empty()) {
                    int poppedValue = stack.pop();
                    System.out.println("Popped: " + poppedValue);
                } else {
                    System.out.println("Stack is empty. Waiting for elements...");
                    try {
                        stack.wait(); // Wait for elements to be pushed
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

