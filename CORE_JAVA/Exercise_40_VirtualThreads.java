public class Exercise_40_VirtualThreads {

    public static void main(String[] args)
            throws Exception {

        for(int i=1;i<=100000;i++) {

            Thread.startVirtualThread(
                    () -> System.out.println(
                            "Virtual Thread Running"));
        }

        Thread.sleep(3000);
    }
}