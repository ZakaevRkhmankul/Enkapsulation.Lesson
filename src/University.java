public class University {
    private String name;
    private String addres;
    private int filials;

    public University(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getAddres(){
        return addres;
    }
    public void setAddres(String addres){
        this.addres = addres;
    }
    public int getFolials(){
        return filials;
    }
    public void setFolials(int folials){
        this.filials=folials;
    }

    @Override
    public String toString() {
        return "\nUniversity" +
                "\nname: " + name +
                "\naddres: " + addres +
                "\nfilials: " + filials;
    }
}
