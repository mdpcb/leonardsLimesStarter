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
