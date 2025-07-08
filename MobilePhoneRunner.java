class MobilePhoneRunner{

public static void main(String[] mob){

 MobilePhone faceUnlock = () -> {
 System.out.println("Unlocking using Face ID...");
};

faceUnlock.unlock();
}
}