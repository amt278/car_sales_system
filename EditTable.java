package maincarsales;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.LinkedList;

public class EditTable {

    private static TextField editField;
    private static Button editButton;
    private static ComboBox comboBox;
    private static Stage stage;

    private static void editTable(Car car) {
        if (comboBox.getSelectionModel().isEmpty()) {
            PopUp.alert("Choose the cell you want to edit first.");
        }else {
            for (Car c : ApplicationList.applicationList.getCarList()) {
                if (c.equals(car)){
                    if (comboBox.getValue() == "Name") {
                        c.setName(editField.getText());
                    } else if (comboBox.getValue() == "Model") {
                        c.setModel(editField.getText());
                    } else if (comboBox.getValue() == "Year") {
                        c.setYear(Integer.parseInt(editField.getText()));
                    } else if (comboBox.getValue() == "Color") {
                        c.setColor(editField.getText());
                    } else if (comboBox.getValue() == "Counter") {
                        c.setCounter(Integer.parseInt(editField.getText()));
                    } else if (comboBox.getValue() == "Cost") {
                        c.setCost(Integer.parseInt(editField.getText()));
                    }
                }
            }
            stage.close();
        }
    }

        public static void showEditedTable(TableView<Car> carTableView) {
        if (carTableView.getSelectionModel().isEmpty()){
            PopUp.alert("Please select cell you want to edit.");
        }else {
            stage = new Stage();
            stage.setTitle("Edit");
            stage.initModality(Modality.APPLICATION_MODAL);

            editField = new TextField();

            comboBox = new ComboBox();
            comboBox.setPromptText("Choose the cell you want to edit.");
            comboBox.getItems().addAll("Name", "Model", "Year", "Color", "Counter", "Cost");

            editButton = new Button("Edit Cell");
            editButton.setOnAction(e -> {
                editTable(carTableView.getSelectionModel().getSelectedItem());
            });

            VBox vBox = new VBox(10);
            vBox.setAlignment(Pos.CENTER);
            vBox.getChildren().addAll(editField, comboBox, editButton);

            Scene scene = new Scene(vBox, 450, 200);

            stage.setScene(scene);
            stage.showAndWait();
        }
    }
}
