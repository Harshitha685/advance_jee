class DivisionRunner{

public static void main(String[] di){

Division division = (a,b)->{
return(a/b);
};

int total = division.div(10,2);
System.out.println(total);
}
}