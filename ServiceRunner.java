class ServiceRunner{

public static void main(String[] args){

Service service = (userId,amount)->{
if (userId != 0 && amount > 0.0) {
            System.out.println("Processing payment of " + amount + " for user with id " + userId);
            return true;
        }
        return false;


};

service.processRequest(2,600.0);
}
}