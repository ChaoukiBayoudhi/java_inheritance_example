import java.time.LocalDate;

public class Student {
    private Long id;
    protected String name;
    private String familyName;
    private LocalDate birthDate;
    private int group;

    public Student() {
    }

    public Student(Long id, String name, String familyName, LocalDate birthDate, int group) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void print(){
        System.out.println("id = " + id + " name = " + name);
    }
}
