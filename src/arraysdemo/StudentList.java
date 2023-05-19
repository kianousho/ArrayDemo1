
package arraysdemo;


public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student("s1", "kianoush");
        Student[] studentList = new Student[3];
        
        studentList[0]= s1;
        studentList[1]= new Student("s2" , "abc");
        studentList[2]= new Student("s3" , "def");
        
        for(int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getsNmae());
            
        }
        
    }//end of main method
}//end of class
