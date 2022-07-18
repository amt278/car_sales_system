package maincarsales;

import java.util.LinkedList;
import java.util.List;

public class ApplicationList {

	private List<Car> carList = new LinkedList<>();

	public static ApplicationList applicationList = new ApplicationList();

	private ApplicationList() {
		carList.add(new Car("honda", "civic", 2019, "red", 10, 100000F));
		carList.add(new Car("skoda", "octavia", 2019, "black", 10, 150000F));
		carList.add(new Car("Acura", "Acura", 2019, "red", 10, 100000F));
		carList.add(new Car("Alfa-Romeo", "Alfa-Romeo", 2019, "red", 10, 100000F));
		carList.add(new Car("Aston Martin", "Aston Martin", 2019, "red", 10, 100000F));
		carList.add(new Car("Audi", "Audi", 2019, "red", 10, 100000F));
		carList.add(new Car("BMW", "BMW", 2019, "red", 10, 100000F));
		carList.add(new Car("Bentley", "Bentley", 2019, "red", 10, 100000F));
		carList.add(new Car("Buick", "Buick", 2019, "red", 10, 100000F));
		carList.add(new Car("Cadilac", "Cadilac", 2019, "red", 10, 100000F));
		carList.add(new Car("Chevrolet", "Chevrolet", 2019, "red", 10, 100000F));
		carList.add(new Car("Chrysler", "Chrysler", 2019, "red", 10, 100000F));
		carList.add(new Car("Daewoo", "Daewoo", 2019, "red", 10, 100000F));
		carList.add(new Car("Daihatsu", "Daihatsu", 2019, "red", 10, 100000F));
		carList.add(new Car("Dodge", "Dodge", 2019, "red", 10, 100000F));
		carList.add(new Car("Eagle", "Eagle", 2019, "red", 10, 100000F));
		carList.add(new Car("Ferrari", "Ferrari", 2019, "red", 10, 100000F));
		carList.add(new Car("Fiat", "Fiat", 2019, "red", 10, 100000F));
		carList.add(new Car("Fisker", "Fisker", 2019, "red", 10, 100000F));
		carList.add(new Car("Ford", "Ford", 2019, "red", 10, 100000F));
		carList.add(new Car("Freighliner", "Freighliner", 2019, "red", 10, 100000F));
		carList.add(new Car("GMC - General Motors Company", "GMC - General Motors Company", 2019, "red", 10, 100000F));
		carList.add(new Car("Genesis", "Genesis", 2019, "red", 10, 100000F));
		carList.add(new Car("Geo", "Geo", 2019, "red", 10, 100000F));
		carList.add(new Car("Honda", "Honda", 2019, "red", 10, 100000F));
		carList.add(new Car("Hummer", "Hummer", 2019, "red", 10, 100000F));
		carList.add(new Car("Hyundai", "Hyundai", 2019, "red", 10, 100000F));
		carList.add(new Car("Infinity", "Infinity", 2019, "red", 10, 100000F));
		carList.add(new Car("Isuzu", "Isuzu", 2019, "red", 10, 100000F));
		carList.add(new Car("Jaguar", "Jaguar", 2019, "red", 10, 100000F));
		carList.add(new Car("Jeep", "Jeep", 2019, "red", 10, 100000F));
		carList.add(new Car("Kla", "Kla", 2019, "red", 10, 100000F));
		carList.add(new Car("Lamborghini", "Lamborghini", 2019, "red", 10, 100000F));
		carList.add(new Car("Land Rover", "Land Rover", 2019, "red", 10, 100000F));
		carList.add(new Car("Lexus", "Lexus", 2019, "red", 10, 100000F));
		carList.add(new Car("Lincoln", "Lincoln", 2019, "red", 10, 100000F));
		carList.add(new Car("Lotus", "Lotus", 2019, "red", 10, 100000F));
		carList.add(new Car("Mazda", "Mazda", 2019, "red", 10, 100000F));
		carList.add(new Car("Maserati", "Maserati", 2019, "red", 10, 100000F));
		carList.add(new Car("Maybach", "Maybach", 2019, "red", 10, 100000F));
		carList.add(new Car("McLaren", "McLaren", 2019, "red", 10, 100000F));
		carList.add(new Car("Mercedez-Benz", "Mercedez-Benz", 2019, "red", 10, 100000F));
		carList.add(new Car("Mercury", "Mercury", 2019, "red", 10, 100000F));
		carList.add(new Car("Mini", "Mini", 2019, "red", 10, 100000F));
		carList.add(new Car("Mitsubishi", "Mitsubishi", 2019, "red", 10, 100000F));
		carList.add(new Car("Nissan", "Nissan", 2019, "red", 10, 100000F));
		carList.add(new Car("Oldsmobile", "Oldsmobile", 2019, "red", 10, 100000F));
		carList.add(new Car("Panoz", "Panoz", 2019, "red", 10, 100000F));
		carList.add(new Car("Plymouth", "Plymouth", 2019, "red", 10, 100000F));
		carList.add(new Car("Pontiac", "Pontiac", 2019, "red", 10, 100000F));
		carList.add(new Car("Porsche", "Porsche", 2019, "red", 10, 100000F));
		carList.add(new Car("Ram", "Ram", 2019, "red", 10, 100000F));
		carList.add(new Car("Rolls_Royce", "Rolls_Royce", 2019, "red", 10, 100000F));
		carList.add(new Car("Saab", "Saab", 2019, "red", 10, 100000F));
		carList.add(new Car("Saturn", "Saturn", 2019, "red", 10, 100000F));
		carList.add(new Car("Smart", "Smart", 2019, "red", 10, 100000F));
		carList.add(new Car("Subaru", "Subaru", 2019, "red", 10, 100000F));
		carList.add(new Car("Susuki", "Susuki", 2019, "red", 10, 100000F));
		carList.add(new Car("Tesla", "Tesla", 2019, "red", 10, 100000F));
		carList.add(new Car("Toyota", "Toyota", 2019, "red", 10, 100000F));
		carList.add(new Car("Volkswagen", "Volkswagen", 2019, "red", 10, 100000F));
		carList.add(new Car("Volvo", "Volvo", 2019, "red", 10, 100000F));
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void addCar(Car car) {
		carList.add(car);
	}

	public void print() {
		System.out.println(carList);
	}
}
