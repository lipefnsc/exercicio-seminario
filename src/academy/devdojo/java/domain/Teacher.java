package academy.devdojo.java.domain;

public class Teacher {
    private String name;
    private String expertise;
    private Seminar[] seminars;

    public Teacher(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public Teacher(String name, String expertise, Seminar[] seminars) {
        this.name = name;
        this.expertise = expertise;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("Teacher name: " + this.name);
        System.out.println("Teacher expertise: " + this.expertise);
        if (this.seminars == null) return;
        System.out.println("Seminars given by " + this.name);
        for(Seminar s : seminars) {
            System.out.println(s.getTitle());
            System.out.println((s.getLocation().getAddress()));
            if (s.getStudents() == null || s.getStudents().length == 0) continue;
            System.out.println("Students:");
            for (Student student : s.getStudents()) {
                System.out.println(student.getName() + ", " + student.getAge() + " years old.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
