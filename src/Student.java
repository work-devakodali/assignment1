import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private List<Integer> mobileNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Integer> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<Integer> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }


    public Student(String name, int age, String address, List<Integer> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }


}
