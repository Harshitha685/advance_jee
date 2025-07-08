public class OnlineRunner {
    static boolean delivered = false;

    public static void main(String[] on) {
        OnlineOrderTracker track = (status) -> {
            return "Delivered".equalsIgnoreCase(status);
        };

        boolean tr = track.checkStatus("Delivered");
        System.out.println("Final status: " + tr);
    }
}