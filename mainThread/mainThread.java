public class mainThread{
    public static void main(String[] args) {
        // Get the main thread
        Thread threadMain = Thread.currentThread();

        // Print its details
        System.out.println("Id             : " + threadMain.getId());
        System.out.println("Name           : " + threadMain.getName());
        System.out.println("Priority       : " + threadMain.getPriority());
        System.out.println("State          : " + threadMain.getState());
        System.out.println("Thread group   : " + threadMain.getThreadGroup());
    }
}