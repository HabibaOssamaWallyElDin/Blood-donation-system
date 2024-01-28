package javy;

import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;
import network.Client;
import views.SigninControllerFXML;

public class StartWindow extends Application {

	private Client client;		//reference hold the active client on this window
	public Stage window;		//reference hold the stage

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.window = primaryStage;
		primaryStage.setResizable(false);		//Force the user to can't resize the stage
		primaryStage.setMaximized(false);		//Force the user to can't maximize the stage

		primaryStage.show();					//and in the end show the scene
		primaryStage.setTitle("Loading");		//set the title to loading
		FileInputStream inputIcon = new FileInputStream("res\\icon.png");	//read image file
		primaryStage.getIcons().add(new Image(inputIcon));					//set the icon of the stage
        FileInputStream input = new FileInputStream("res\\LoadingScrreen.jpg");//read image file
        Image image = new Image(input);	//hold the image to reference
        ImageView imageView = new ImageView(image);	//put the image to imageview to view the image
        imageView.setFitWidth(575);					//set the imageview width
        imageView.setPreserveRatio(true);			//set auto resize the height depends on the ratio

        Pane pane = new Pane(imageView);			//create a pane and passto it the children


		Scene loading = new Scene(pane, 575, 800);	//create scene and pass to it the root and the size of the scene
		primaryStage.setScene(loading);				//set the scene to the stage
		Thread.currentThread().sleep(2999);			//make the application freeze for 3 seconds
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/FXMLSignin.fxml"));		//here we load the FXML class

		Parent root = fxmlLoader.load();				//here we load the view to holds with the parent to put it in the scene
		SigninControllerFXML controller = fxmlLoader.<SigninControllerFXML>getController();	//here we get the object of the of the controller for the FXML


		this.client = HoldClint.client;					//here we take the client in the class and put it in the client in this object
		controller.setClient(client);					//here we send the client to controller
		HoldWidnow.widnow = this.window;

		primaryStage.setOnCloseRequest(e-> HoldClint.client.getClientSender().endConection());	//here we want when the user close the window end the connection between server and this client
		Scene scene = new Scene(root, 550, 150);	//create scene and pass to it the root that hold the view
		primaryStage.setTitle("Sign in");			//set the title to Sign in
		primaryStage.setScene(scene);				//make the stage hold the scene to view it
	}

	public void showWindow() {		//this method launch the application
		launch(new String[]{});
	}

	public void passClient(Client client) {		//this method passing the client to be holed temporary from inner static class
		HoldClint.client = client;
	}
	private static class HoldClint {		//we made this class to temporary holds the client object until application launch
		static Client client;
	}
	public static class HoldWidnow {		//we made this class to temporary holds the client object until application launch
		public static Stage widnow;
	}
	public static class AlertBox {			//we make this class to create an alertBox

		//this method take the title of the stage and the massage will appear and object from the class that will open on it
		public static void display(String title, String massage, Object object) {
			Stage newWindow = new Stage();		//create stage
			newWindow.setMaximized(false);		//Force the user to can't maximize the stage
			newWindow.setResizable(false);		//Force the user to can't resize the stage

			newWindow.initModality(Modality.APPLICATION_MODAL);
			newWindow.setTitle(title);

			Label label = new Label();
			label.setText(massage);
			label.setStyle("-fx-font-size:25;-fx-font-weight: bold;");
			label.setTextAlignment(TextAlignment.CENTER);

			Button closeButton = new Button("Close");
			closeButton.setStyle("-fx-font-size:25;-fx-font-weight: bold;");
			closeButton.setOnAction(e -> newWindow.close());
			VBox vBox = new VBox(10);
			vBox.getChildren().addAll(label, closeButton);
			vBox.setAlignment(Pos.CENTER);
			vBox.setPadding(new Insets(10, 10, 10, 10));
			newWindow.setScene(new Scene(vBox));

			//on the stage creating will play a alert sound
			new AudioClip(
					object.getClass()
						.getResource("/views/AlertSound.mp3")
						.toExternalForm())
					.play();
//			AudioClip buzzer = new AudioClip(object.getClass().getResource();
			newWindow.showAndWait();	//and show the stage and wait
		}
	}
}


