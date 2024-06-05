package admin_jar.font;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import manager_jar.Main.Admin;

import java.io.IOException;

public class AdminLoginController {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private Stage stage;

    @FXML
    private Button btn_reg;

    @FXML
    private Button btn_login;


    public void LoginEvent() throws IOException {
        //这里需要数据库
        //TODO
        //判断id是否为空
        if(){

        }
        new Admin().MainApp();
    }
}

