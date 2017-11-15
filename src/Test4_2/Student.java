package Test4_2;

/**
 * Created by Emil Käck on 2017-11-15.
 */
public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Test4_2.Student{" +
                "Test4_2.Person{" +
                "name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "} program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
