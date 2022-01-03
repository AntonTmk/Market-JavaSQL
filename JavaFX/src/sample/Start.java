package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public abstract class Start {
    //private ObservableList<viewww> vi = FXCollections.observableArrayList();
   @FXML
    private TableView<viewww> view;
    @FXML
    private Button adnew;
    @FXML
    private Button exit;
    @FXML
    private TableColumn<viewww, Integer> pro;
    @FXML
    private TableColumn<viewww, String> pib;
@FXML
    void initialize(){
        /*String select = "SELECT "+Const.first+" FROM "+ Const.TABLE+" WHERE "+Const.second+"=(SELECT min("+Const.second+") FROM "+Const.TABLE+");";
viewww v= new viewww(select, 5);
pib.setCellFactory(TextFieldTableCell.forTableColumn());*/
adnew.setOnAction(event -> {

    FXMLLoader loader= new FXMLLoader();
    loader.setLocation(getClass().getResource("/sample/sample.fxml"));
    adnew.getScene().getWindow().hide();
    Parent root = loader.getRoot();
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.showAndWait();
});
exit.setOnAction(event -> {
    System.exit(0);
});
}
}
