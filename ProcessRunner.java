class ProcessRunner{

public static void main(String[] pr){


Process process = (data)->{
  if (data == null || data.isEmpty()) return false;
        System.out.println("Executing command: " + data);
        
        return true;

};
process.processInput("updating");

}
}