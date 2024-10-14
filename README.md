# Static Leonards Limes

**Directions**: You have been hired by Leonard, the owner of a used car dealership called “Leonard’s Limes.” Leonard wants you to design some software to track the cars he sells to his customers. Specifically, Leonard wants to be able to track how many cars he has sold and how many oil changes his dealership has done for each car. He also wants to track how many oil changes his dealership has done in total.

For this lab, you need to implement the `Car` class and associated methods described below. You also need to make design decisions about which variables and methods will be static and which will be non-static. Unless otherwise noted, remember to make all variables private (even those that are static). You may need to overload the constructor for full functionality.

In this lab, you will create a `Car` class. Each `Car` object should track the following pieces of data:

1. The name of the dealership that is selling the cars. (Assume one dealership sells all the cars). You should set this name to “Leonard’s Limes” in your code. Unlike all the other variables in the `Car` class, make this variable public so other classes have direct access. But also make it so that after it is initially set, it can never be changed. Look at the tester class on the next page for more details on how this variable is used in a print statement.
2. The make of the car.
3. The model of the car.
4. The model year of the car.
5. The number of oil changes done by Leonard’s dealership for this car. (When a car is first created/sold, assume no oil changes have yet been done by the dealership for this car).
6. The gas mileage of the car, in miles per gallon (MPG) and kilometers per liter (KPL).
7. The total number of oil changes done for all the cars.
8. The total number of cars created/sold.

You need to create the following methods for the `Car` class (some others may be needed also):

- `getDealershipOilChanges()`: This method should return the total number of oil changes done by the dealership on all the cars that have been sold.
- `getCarsSold()`: This method returns the total number of `Car` objects created. (We assume a new car object is created each time a car is sold to a customer).
- `oilChange()`: Increments the number of oil changes tracked for the current car.
- `toString()`: You will need to overload the `toString()` method as suggested by the tester class.
- `convertMPGtoKPL()`: This is a utility that allows the user to convert miles per gallon to kilometers per liter. The method should take a decimal number of miles per gallon as an argument and return a decimal number which is the equivalent kilometers per liter.

Below is an example of a client class to test the `Car` class. **NOTE**: this example class does not test all the functionality of the `Car` class and as such should be modified to ensure a working `Car` class.

```java
public class CarRunner {
    public static void main(String [] args) {
        // cars sold by Leonard
        Car c1 = new Car("Volkswagen", "Rabbit", 2007);
        Car c2 = new Car("Honda", "Odyssey", 2014);
        Car c3 = new Car("Porsche", "Carerra", 2009);
        Car c4 = new Car("Volkswagen", "Rabbit", 2008);
        Car c5 = new Car("Volkswagen", "Golf", 2007);
        Car c6 = new Car("Honda", "Civic", 2013);
        Car c7 = new Car("Lotus", "Elise", 2007);

        // oil changes performed by Leonard
        c1.oilChange();
        c2.oilChange();
        c3.oilChange();
        c2.oilChange();
        c1.oilChange();
        c7.oilChange();

        System.out.println("100 MPG = " + Car.convertMPGtoKPL(100.0) + " KPL");

        System.out.println("Dealership: " + Car.DEALERNAME + 
                            " Cars Sold: " + Car.getCarsSold() +
                            " Total Oil Changes: " + Car.getDealershipOilChanges());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}
```
The expected output from the above test class is shown below:
```java
100 MPG = 42.5 KPL
Dealership: Leonard's Limes
Cars Sold: 7
Total Oil Changes: 6

2007 Volkswagen Rabbit Oil Changes = 2
2014 Honda Odyssey Oil Changes = 2
2009 Porsche Carerra Oil Changes = 1
2008 Volkswagen Rabbit Oil Changes = 0
2007 Volkswagen Golf Oil Changes = 0
2013 Honda Civic Oil Changes = 0
2007 Lotus Elise Oil Changes = 1
```
