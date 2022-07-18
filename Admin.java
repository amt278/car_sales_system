package maincarsales;

import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javax.swing.*;

public class Admin extends Person {

	static final String username = "admin", password = "admin";

	static TextField nameField = new TextField();
	static TextField modelField = new TextField();
	static TextField yearField = new TextField();
	static TextField colorField = new TextField();
	static TextField counterField = new TextField();
	static TextField costField = new TextField();
	private static Scene adminScene;
	private static boolean showTable = false;

	static Scene returnScene() throws FileNotFoundException {
		if (adminScene == null) {
			Group layout = new Group();

			Background buttonBackground = new Background(
					new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY));

			adminScene = new Scene(layout, 1400, 800, Color.BLUEVIOLET);

			Font arial = new Font("Arial", 37);

			// title
			Text menuTitle = new Text(110, 100, "Menu");
			menuTitle.setFont(Constants.getFont1());
			menuTitle.setFill(Color.ANTIQUEWHITE);

			Text welcomeTitle = new Text(620, 150, "Welcome in ..");
			welcomeTitle.setFont(Constants.getFont1());
			welcomeTitle.setFill(Color.ANTIQUEWHITE);
			welcomeTitle.setUnderline(true);

			// setup name text field
			nameField.setPromptText("Name");
			nameField.setLayoutX(620);
			nameField.setLayoutY(610);

			// setup model text field
			modelField.setPromptText("Model");
			modelField.setLayoutX(795);
			modelField.setLayoutY(610);

			// setup year text field
			yearField.setPromptText("Year");
			yearField.setLayoutX(970);
			yearField.setLayoutY(610);

			// setup color text field
			colorField.setPromptText("Color1, Color2");
			colorField.setLayoutX(620);
			colorField.setLayoutY(650);

			// setup counter text field
			counterField.setPromptText("Counter");
			counterField.setLayoutX(795);
			counterField.setLayoutY(650);

			// setup cost text field
			costField.setPromptText("Cost");
			costField.setLayoutX(970);
			costField.setLayoutY(650);

			// FileInputStream inputImage = new FileInputStream("icons8_Add_64px.png");
			// set images

			ImageView addPic = new ImageView(
					new Image(Admin.class.getResourceAsStream("/maincarsales/icons8_Add_64px.png"))),
					updatePic = new ImageView(
							new Image(Admin.class.getResourceAsStream("/maincarsales/icons8_Clock_25px.png"))),
					deletePic = new ImageView(
							new Image(Admin.class.getResourceAsStream("/maincarsales/icons8_Delete_64px.png"))),
					settingsPic = new ImageView(
							new Image(Admin.class.getResourceAsStream("/maincarsales/icons8_Settings_25px.png"))),
					logoutPic = new ImageView(new Image(
							Admin.class.getResourceAsStream("/maincarsales/icons8_Logout_Rounded_Up_25px.png"))),
					logoPic = new ImageView(new Image(Admin.class.getResourceAsStream("/maincarsales/logo.png")));

			// set height and width
			addPic.setFitHeight(30);
			addPic.setFitWidth(30);

			updatePic.setFitHeight(30);
			updatePic.setFitWidth(30);

			deletePic.setFitHeight(30);
			deletePic.setFitWidth(30);

			settingsPic.setFitHeight(30);
			settingsPic.setFitWidth(30);

			logoutPic.setFitHeight(30);
			logoutPic.setFitWidth(30);

			logoPic.setFitHeight(500);
			logoPic.setFitWidth(400);
			logoPic.setLayoutX(600);
			logoPic.setLayoutY(200);

			// declare buttons
			Button addButton = new Button("Add", addPic), updateButton = new Button("Update", updatePic),
					deleteButton = new Button("Delete", deletePic),
					editButton = new Button("Edit Table", settingsPic),
					logoutButton = new Button("Logout", logoutPic);

			// set add button
			// addButton.setTextFill(Color.BISQUE);
			addButton.setLayoutX(620);
			addButton.setLayoutY(690);
			addButton.setFont(arial);
			addButton.setPrefSize(240, 30);
			// addButton.setBackground(buttonBackground);
			addButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				addButton.setEffect(Constants.getShadow());
			});
			addButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				addButton.setEffect(null);
			});
			addButton.setOnAction(e -> {
				Table.addToTable();
			});

			TableView<Car> table = Table.createTable();
			table.setLayoutX(450);
			table.setLayoutY(70);

			// set delete button
			// deleteButton.setTextFill(Color.BISQUE);
			deleteButton.setLayoutX(880);
			deleteButton.setLayoutY(690);
			deleteButton.setFont(arial);
			deleteButton.setPrefSize(240, 30);
			// deleteButton.setBackground(buttonBackground);
			deleteButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				deleteButton.setEffect(Constants.getShadow());
			});
			deleteButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				deleteButton.setEffect(null);
			});
			deleteButton.setOnAction(e -> {
				Table.deleteFromTable(table);
			});

			// set update button
			updateButton.setTextFill(Color.BISQUE);
			updateButton.setLayoutX(60);
			updateButton.setLayoutY(160);
			updateButton.setFont(arial);
			updateButton.setPrefSize(280, 100);
			updateButton.setBackground(buttonBackground);
			updateButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				updateButton.setEffect(Constants.getShadow());
			});
			updateButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				updateButton.setEffect(null);
			});
			updateButton.setOnAction(e -> {
				if (!showTable) {
					layout.getChildren().removeAll(welcomeTitle, logoPic);
					layout.getChildren().addAll(table, nameField, modelField, yearField, colorField, costField,
							counterField, addButton, deleteButton);
					showTable = true;
				}
			});

			// set settings button
			editButton.setTextFill(Color.BISQUE);
			editButton.setLayoutX(60);
			editButton.setLayoutY(380);
			editButton.setFont(arial);
			editButton.setPrefSize(280, 100);
			editButton.setBackground(buttonBackground);
			editButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				editButton.setEffect(Constants.getShadow());
			});
			editButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				editButton.setEffect(null);
			});
			editButton.setOnAction(e -> {
				if (showTable) {
					EditTable.showEditedTable(table);
					Table.createTable();
					table.refresh();
				}else{
					layout.getChildren().removeAll(welcomeTitle, logoPic);
					layout.getChildren().addAll(table, nameField, modelField, yearField, colorField, costField,
							counterField, addButton, deleteButton);
					showTable = true;
				}
			});

			// set logout button
			logoutButton.setTextFill(Color.BISQUE);
			logoutButton.setLayoutX(60);
			logoutButton.setLayoutY(600);
			logoutButton.setFont(arial);
			logoutButton.setPrefSize(280, 100);
			logoutButton.setBackground(buttonBackground);
			logoutButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				logoutButton.setEffect(Constants.getShadow());
			});
			logoutButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				logoutButton.setEffect(null);
			});
			logoutButton.setOnAction(e -> {
				if (showTable) {
					layout.getChildren().removeAll(table, nameField,
							modelField, yearField, colorField, costField, counterField, addButton, deleteButton);
					layout.getChildren().addAll(welcomeTitle, logoPic);
					showTable = false;
				}
				ApplicationRegistery.getApplicationRegistery().getPrimaryStage()
						.setScene(ApplicationRegistery.getApplicationRegistery().getLoginScene());
			});

			// line
			Line line = new Line();
			line.setStartX(400);
			line.setStartY(50);
			line.setEndX(400);
			line.setEndY(750);
			line.setFill(Color.ANTIQUEWHITE);

			// setup layout
			layout.getChildren().addAll(updateButton, editButton, logoutButton, line, menuTitle, logoPic,
					welcomeTitle);
		}
		return adminScene;
	}
}
