package Test4_2;

/**
 * Created by Emil Käck on 2017-11-15.
 */
public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {

        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Test4_2.Staff{" +
                "Test4_2.Person{" +
                "name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "} school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
