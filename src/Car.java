import java.time.LocalDate;

public class Car {
    private String model;
    private String colour;
    private int year;

    public Car(){
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "model: " + model +
                "\ncolour: " + colour +
                "\nyear: " + year;
    }
}
