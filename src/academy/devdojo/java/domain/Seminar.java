package academy.devdojo.java.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Location location;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location = location;
    }

    public Seminar(String title, Student[] students, Location location) {
        this.title = title;
        this.students = students;
        this.location = location;
    }

    public void print() {
        System.out.println("Seminar " + this.title);
        System.out.println("Where? " + this.location.getAddress());
        if(this.students == null || this.students.length == 0) return;
        System.out.println("Registered studentes");
        for (Student s : this.students) {
            System.out.println(s.getName() + ", " + s.getAge() + " years old.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
