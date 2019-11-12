public class threadB {
    static class MyThread extends Thread{
        private int start, end;
        private String name;

        MyThread(int start, int end, String name) {
            super();

            this.start = start;
            this.end = end;
            this.name = name;
        }

        public void run() {
            if (start < end) {
                for (int i = start; i < end; i += 1) {
                    System.out.println("Thread "+ this.name + " - " + i);
                }
            }
            else {
                for (int i = start; i >= end; i--) {
                    System.out.println("Thread "+ this.name + " - " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread(0, 5, "Thread 1");
        MyThread thread2 = new MyThread(15, 10, "Thread 2");

        thread1.start();
        thread2.start();
    }
}