interface DocumentRunner{

public static void main(String[] doc){
Document document = ()->{

System.out.println("Document is valid");

return false;
};

document.isValid();
}
}