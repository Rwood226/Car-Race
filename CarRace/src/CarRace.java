public class CarRace {
    public static void main(String[] args) {

        //create three Car instances, two defined, one not.
        Car carOne = new Car("Porsche 911 Turbo", "Gray", 1973);
        Car carTwo = new Car("Chevrolet Corvette", "Red", 1981);
        Car carThree = new Car();

        //prints color, year, and name of each car
        System.out.println(carOne.color + " " + carOne.year + " " + carOne.model);
        System.out.println(carTwo.color + " " + carTwo.year + " " + carTwo.model);
        System.out.println(carThree.color + " " + carThree.year + " " + carThree.model);

        //prints vroom
        carOne.drive();
        carTwo.drive();
        carThree.drive();
    }
}