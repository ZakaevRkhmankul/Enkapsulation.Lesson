public class School {
    private int number;
    private String name;
    private int students;

    public School(){
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStudents(){
        return students;
    }
    public void setStudents(int students){
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nSchool: " +
                "\nnumber: " + number +
                "\nname: " + name +
                "\nstudents: " + students;
    }
}

