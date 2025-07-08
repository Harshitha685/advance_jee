class AppRunner{

public static void main(String[] ap){

App apps = (userName,password)->{

if (userName != null && !userName.isEmpty()) {
    return true;
} else {
    return false;
}
};

boolean app = apps.authenticate("Harshitha","har12");
System.out.println("The username and paasword available: " +app);
}
}