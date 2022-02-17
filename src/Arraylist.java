import java.util.*;
import java.util.stream.Collectors;

public class Arraylist {


    public static void main(String[] args) {

        List<Student> Students = new ArrayList<Student>();
        Students.add(new Student("Mahesh", 21, "guntur", Arrays.asList(1234)));
        Students.add(new Student("deva", 20, "1235", Arrays.asList(2233,4455)));
        Students.add(new Student("rahul", 30, "pune", Arrays.asList(3344,5566)));
        Students.add(new Student("ram", 29, "jaipur", Arrays.asList(5544,3333)));
        Students.add(new Student("rajesh", 27, "cochi", Arrays.asList(7766,6655)));
        Students.add(new Student("preetham", 26, "bptl", Arrays.asList(4433,5522)));
        Students.add(new Student("dileep", 25, "delhi", Arrays.asList(1245,2356)));
        Students.add(new Student("eshwar", 24, "tenali", Arrays.asList(1234,5689)));
        Students.add(new Student("vasu", 23, "vijayawada", Arrays.asList(8754,9865)));
        Students.add(new Student("aajay", 22, "vskp", Arrays.asList(6532,1233)));
        System.out.println("-----------------------------------------------------");

        //Get student with exact match name "Mahesh"
        List<Object> studName = Collections.singletonList(Students.stream().filter(student -> student.getName().equals("Mahesh")).findFirst());
        System.out.println("match name  \n"+ studName);
        System.out.println("-----------------------------------------------------");

        //Get student with matching address "1235"
        List<Student> studAddress = Students.stream()
                .filter(student -> student.getAddress().equals("1235"))
                .collect(Collectors.toList());
        System.out.println("matching address \n"+ studAddress);
        System.out.println("-----------------------------------------------------");


        //Get all student having mobile numbers 3333.
        List<Student> StudNum= Students.stream()
                .filter(stud -> stud.getMobileNumbers().stream().anyMatch(x -> x.equals(3333)))
                .collect(Collectors.toList());
        System.out.println("mobile number having 3333 \n"+ StudNum);
        System.out.println("-----------------------------------------------------");


        //Get all student having mobile number 1233 and 1234
        List<Student> StudNum2= Students.stream()
                .filter(stud -> stud.getMobileNumbers().stream().anyMatch(x -> (x.equals(1233))||(x.equals(1234))))
                .collect(Collectors.toList());
        System.out.println("mobile number having 1233 and 1234 \n"+ StudNum2);
        System.out.println("-----------------------------------------------------");


        //Convert List<Student> to List<String> of student name
        List<String> studString  = Students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Student to <String> \n"+ studString);
        System.out.println("-----------------------------------------------------");

        //Sort the Student list based on name first
        List<Student> sortName = Students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println("name sort \n"+ sortName);
        System.out.println("-----------------------------------------------------");

        //Sort the Student list based on age
        List<Student> sortAge = Students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());
        System.out.println("age sort \n"+ sortAge);
        System.out.println("-----------------------------------------------------");

    }
}