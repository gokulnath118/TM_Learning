// 3) Car Rental Records

class Car{
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getBrand() { 
        return brand; 
    }
    public String getModel() { 
        return model; 
    }
    public int getYear() { 
        return year; 
    }
    public void display(){
        System.out.println("Brand: "+ brand +" Model: "+model+" year: "+year);
    }
}

public class Task3{
    public static void main(String[] args) {
        Car car1=new Car("Honda","city",2023);
        Car car2=new Car("Skoda","Kushaq",2025);
        Car car3=new Car("RollsRoyce","Cullinan",2025);

        car1.display();
        car2.display();
        car3.display();

        car1.setModel("Civic");
        car2.setYear(2020);

        System.out.println(car1.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car3.getYear());

        car1.display();
        car2.display();
        car3.display();
    }
}