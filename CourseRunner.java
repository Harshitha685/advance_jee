class CourseRunner{

public static void main(String[] co){

Course course = (studentName)->{
        return "Certificate of Completion " +studentName;

};
String certi = course.generateCertificate("Harshitha");
System.out.println(certi);
}
}