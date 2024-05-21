import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginSceneController{
    //criando uma nova tela do java effects
    public static Scene Create() throws Exception {
        URL sceneUrl = LoginSceneController.class
            .getResource("Tela.fxml");
        Parent root = FXMLLoader.load(sceneUrl);
        Scene scene = new Scene(root);
        return scene;
    }

    @FXML 
    private Button btLogin;

    @FXML 
    private PasswordField tbPassword;

    @FXML 
    private TextField tbLogin;

    @FXML 
    private CheckBox ckPassword;

    @FXML
    protected void tryLogin(ActionEvent e) throws Exception {
        if (!tbLogin.getText().equals("don")) {
            Alert alert = new Alert(
                AlertType.ERROR, "Você não é o don!",
                ButtonType.OK
            );
            alert.showAndWait();
            tbPassword.clear();
            return;      
        }
        if (!tbPassword.getText().equals("verstapi")) {
            Alert alert = new Alert(
                AlertType.ERROR,
                "Voce nao e o don!",
                ButtonType.OK
            );
            alert.showAndWait();
            tbPassword.clear();
            return;
        }

        Stage crrStage = (Stage)btLogin.getScene().getWindow();
        crrStage.close();

        try{
            Stage stage = new Stage();
            Scene scene = MainSceneController.Create();
            stage.setScene(scene);
            stage.show();

        } catch (Exception error) {
            Alert alert = new Alert(
                AlertType.ERROR,
                "Erro ao carregar a tela!",
                ButtonType.OK
            );
            alert.showAndWait();
            error.printStackTrace();
            return;
        }
    }
}
