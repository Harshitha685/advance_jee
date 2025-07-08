class NotificationRunner{

public static void main(String[] no){

Notification noti = (recipient)->{
if (recipient != null && recipient.contains("@")) {
        System.out.println("Sending email to " + recipient);
    } else {
        System.out.println("Invalid recipient email address: " + recipient);
    }
};
	noti.send("12@3");
}
}