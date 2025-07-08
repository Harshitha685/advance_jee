class PassengerRunner{

public static void main(String[] pa){

Passenger pass = (name,seat,type)->{
	return "Name: " + name + ", Seat: " + seat + ", Type: " + type;
};
String details = pass.getPassengerDetails("Harshitha","General","AC");
System.out.println("The passenger details are : " +details);
}
}