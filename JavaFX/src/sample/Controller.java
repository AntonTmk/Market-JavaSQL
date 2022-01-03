package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Controller {
    @FXML
    private Button add;
    @FXML
    private Button Search;
    @FXML
    private TextField NAME;
    @FXML
    private TextField miss;
    @FXML
    private Label label1;
    @FXML
    private Button back;

  @FXML
    void initialize(){
      add.setOnAction(event -> {
          DatabaseHandler a = new DatabaseHandler();
          String name=NAME.getText();
          int MISS = Integer.parseInt(miss.getText());
          try {
              a.signUP(name, MISS);
          } catch (SQLException e) {
              e.printStackTrace();
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }
      });
      back.setOnAction(event -> {

          FXMLLoader loader= new FXMLLoader();
          loader.setLocation(getClass().getResource("/Start/sample.fxml"));
          back.getScene().getWindow().hide();
          Parent root = loader.getRoot();
          Stage stage = new Stage();
          stage.setScene(new Scene(root));
          stage.showAndWait();
      });
  }
}

