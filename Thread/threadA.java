public class threadA {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1 - " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 15; i >= 10; i--) {
                    System.out.println("Thread 2 - " + i);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}