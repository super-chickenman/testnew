package admin_jar.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import admin_jar.font.AdminLoginController;
import admin_jar.font.MainController;

import java.io.IOException;
import java.util.Optional;

public class Admin extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        initlogin();
    }

    public void initlogin(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/admin_jar/fxml/login_manager.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);

            Stage primaryStage = new Stage();
            primaryStage.setTitle("管理员登录界面");
            primaryStage.setScene(scene);

            AdminLoginController controller = loader.getController();
            controller.setStage(primaryStage);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void MainApp() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/admin_jar/fxml/main_manager.fxml"));
        AnchorPane root = loader.load();
        Scene scene = new Scene(root);

        Stage regStage = new Stage();

        regStage.setTitle("管理员主界面");
        regStage.setScene(scene);

        MainController controller = loader.getController();
        controller.setStage(regStage);

        regStage.show();
    }

    public boolean showMessage(String title, String text, Alert.AlertType type, int I){
        boolean boo=false;
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(text);
        if(I==1) {
            Optional<ButtonType> result=alert.showAndWait();
            alert.setContentText("确认这样选择吗？");
            boo=(result.get() == ButtonType.OK);
        }
        else
            alert.showAndWait();
        return boo;
    }
}
