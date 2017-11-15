/**
 * Created by Emil Käck on 2017-11-15.
 */
public class Test {
    public static void main(String[] args) {
        //skapar ny person, student och arbetare
        Person test = new Person("Emil", "Brattfors");
        Student Student = new Student("Emil", "Brattfors", "Teknik", 3, 400);
        Staff Staff = new Staff("Emil", "Brattfors", "Nti", 20000);
        //tittar så att det fungerar att skriva ut
        System.out.println(test.toString());
        System.out.println(Student.toString());
        System.out.println(Staff.toString());
        //vet att alla andra fungerar så testar inte dem
    }
}
