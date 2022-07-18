package maincarsales;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Table {
	private static List<TableView<Car>> tables = new LinkedList<>();

	// creates a TableView UI component

	public static TableView<Car> createTable() {
		return createTable(true);
	}

	public static TableView<Car> createTable(boolean cache) {
		TableView<Car> table = new TableView<>();
		table.setEditable(true);
		table.setPrefSize(900, 500);
		table.setLayoutX(450);
		table.setLayoutY(70);

		TableColumn<Car, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		nameColumn.setMinWidth(150);

		TableColumn<Car, String> modelColumn = new TableColumn<>("Model");
		modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
		modelColumn.setMinWidth(150);

		TableColumn<Car, String> yearColumn = new TableColumn<>("Year");
		yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
		yearColumn.setMinWidth(150);

		TableColumn<Car, String> colorColumn = new TableColumn<>("Colors");
		colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
		colorColumn.setMinWidth(150);

		TableColumn<Car, String> counterColumn = new TableColumn<>("counter");
		counterColumn.setCellValueFactory(new PropertyValueFactory<>("counter"));
		counterColumn.setMinWidth(150);

		TableColumn<Car, String> costColumn = new TableColumn<>("Cost");
		costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
		costColumn.setMinWidth(150);

		// setup table
		table.getColumns().addAll(nameColumn, modelColumn, yearColumn, colorColumn, counterColumn, costColumn);
		refreshCarsData(table);
		if (cache)
			tables.add(table);
		return table;
	}

	public static void refresh() {
		refreshCarsData();
	}

	private static void refreshCarsData() {
		tables.forEach(table -> {
			refreshCarsData(table);
		});
	}

	private static void refreshCarsData(TableView<Car> table) {
		table.getItems().clear();
		table.getItems().addAll(ApplicationList.applicationList.getCarList());
	}

	static void addToTable() {

		try {
			Car car = new Car(Admin.nameField.getText(), Admin.modelField.getText(),
					Integer.parseInt(Admin.yearField.getText()), Admin.colorField.getText(),
					Integer.parseInt(Admin.counterField.getText()), Double.parseDouble(Admin.costField.getText()));

			// add to list
			ApplicationList.applicationList.addCar(car);
			// ApplicationList.applicationList.getCarList().add(new Car(car));

			refreshCarsData();

			Admin.nameField.clear();
			Admin.modelField.clear();
			Admin.yearField.clear();
			Admin.counterField.clear();
			Admin.costField.clear();
			Admin.colorField.clear();

			ApplicationList.applicationList.print();
			System.out.println(ApplicationList.applicationList.getCarList().indexOf(car));
		} catch (Exception e) {
			PopUp.alert(e.getMessage());
		}
	}

	// delete car from table and list
	static void deleteFromTable(TableView<Car> table) {

		// delete from list
		Car car = table.getSelectionModel().getSelectedItem();
		// System.out.println(ApplicationList.applicationList.getCarList().indexOf(car));
		System.out.println(ApplicationList.applicationList.getCarList().remove(car));

		refreshCarsData();

		ApplicationList.applicationList.print();
	}

	static void sellOneCar(TableView<Car> table) {
		Car selectedItem = table.getSelectionModel().getSelectedItem();
		if (selectedItem == null)
//			JOptionPane.showMessageDialog(null, "Please, Select car.");
			PopUp.alert("Please, Select car.");
		else if (selectedItem.getCounter() <= 0)
//			JOptionPane.showMessageDialog(null, "Sorry, No car avaliable.");
			PopUp.alert("Sorry, No car available.");
//		else if (JOptionPane.showConfirmDialog(null,
//				"Please, Confirm that you need to sell one car.") == JOptionPane.OK_OPTION) {
		else if (PopUp.confirmation("Buying car", "Are you sure you want to buy this car?")) {
			Car car = table.getSelectionModel().getSelectedItem();
			car.setCounter(car.getCounter() - 1);
			refreshCarsData();

			ApplicationList.applicationList.print();
		}
	}
}
