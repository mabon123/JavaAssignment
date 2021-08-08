package JavaAssignment;

public class ReferanceExcute {
    public static void main(String[] args) {


        DeclearClademo Student1 = new DeclearClademo();//Declear object 1
        DeclearClademo Student2 = new DeclearClademo();//Declear object 2


        // Declear Value to Student1
        Student1.StuID = 7;
        Student1.FirstName = "ON";
        Student1.Lastname = "Mabb";
        Student1.Sex = "Male";
        System.out.println("StudentID:" + Student1.StuID + "\nStudent ID:" + Student1.FirstName + " " + Student1.Lastname + "\nSex:" + Student1.Sex);
        // Declear Value to Student2
        Student2.StuID = 8;
        Student2.FirstName = "Pheak ";
        Student2.Lastname = "Tra";
        Student2.Sex = "Male";
        System.out.println("StudentID:" + Student2.StuID + "\nStudent ID:" + Student2.FirstName + " " + Student2.Lastname + "\nSex:" + Student2.Sex);
        DeclearClademo Student3 =Student1;//Declear object 3 Referance
        System.out.println("StudentID:"+ Student3.StuID+"\nStudent ID:"+ Student3.FirstName+" "+ Student3.Lastname+"\nSex:"+ Student3.Sex);
    }
}
