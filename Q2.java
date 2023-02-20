public class Q2 {
    public static void main(String[] args) {
        Student stu1 = new Student("Ali Marjani",21,2021101169);
        Student stu2 = new Student("Lionel Messi",21,2021101100);
        Student stu3 = new Student("Son Goku",21,2021101177);
        StudentArray arr = new StudentArray();
        arr.addStudent(stu1);
        arr.addStudent(stu2);
        arr.addStudent(stu3);
        System.out.println(arr.toString());
    }
}
