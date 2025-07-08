class AccountRunner{

public static void main(String[] acc){

Account account = ()->{

System.out.println("Money is withdrawn from account");
};
account.withDraw();
}
}