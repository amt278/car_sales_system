package maincarsales;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

	private Signup signup_o = new Signup();
	private login login_o = new login();
	private Usermenu menuuser_o = new Usermenu();
	private Search search_o = new Search();
	private View view_o = new View();
	private Setting setting_o = new Setting();

	public Main() throws FileNotFoundException {
		ApplicationRegistery.getApplicationRegistery().setLoginScene(login_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setSignupScene(signup_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setUserScene(menuuser_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setSearchScene(search_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setViewScene(view_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setSettingScene(setting_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setAdminScene(Admin.returnScene());
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Car Sales System OT4A");
		primaryStage.setScene(login_o.return_scene());
		ApplicationRegistery.getApplicationRegistery().setPrimaryStage(primaryStage);
		primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/maincarsales/logo.png")));
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}

}
