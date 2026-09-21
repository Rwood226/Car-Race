class Car {
    String model;
    String color;
    int year;

    //constructor if user defines attributes
    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
     }

     //default constructor if no attributes deffined
     Car() {
        this.model = "N/A";
        this.color = "N/A";
        this.year = 0;
     }

     void drive() {
        System.out.println("Vroom");
     }
}