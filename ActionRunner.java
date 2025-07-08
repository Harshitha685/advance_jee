class ActionRunner{

public static void main(String[] ac){

Action action = (input)->{

 if (input == null) return "Invalid input";
        return input.toUpperCase();

};
String perform = action.perform("acting");
System.out.println(perform);
}
}