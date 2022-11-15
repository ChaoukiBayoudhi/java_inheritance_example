import java.time.LocalDate;

//SeniorStudent inherits from Student
//Student is called superclass of SeniorStudent or mother class of Student
// the child class has access to public and protected methods and attributes of the mother class
//but not private members of the parent class
//there is no multiple inheritance in java
// we have an inheritance hierarchy
//the root of this hierarchy is Object class
public class SeniorStudent extends Student {
    private double pfeScore;

    //no args constructor
//    public SeniorStudent() {
//      // this.id=1L;//direct access =>error because "id" is private member
//       setId(1L); //ok => setId() is a public method
//        this.name="";//direct access =>ok because "name" is protected member
//    }
    //no args constructor
    public SeniorStudent() {
        super();//called parent no args constructor
        this.pfeScore=0.0;
    }
    public SeniorStudent(Long id, String name, String familyName,LocalDate bithDate,int group,double pfeScore)
    {
        super(id,name,familyName,bithDate,group);
        this.pfeScore=pfeScore;
    }
    //redifintion
    public void print() {
        super.print();
    }
}
