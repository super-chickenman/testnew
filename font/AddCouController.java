package admin_jar.font;

import admin_jar.Main.Admin;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCouController {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Stage stage;

    @FXML
    private TextField CouId;

    @FXML
    private TextField CouName;

    @FXML
    private TextField CouTea;

    @FXML
    private TextField CouType;

    @FXML
    private TextArea CouInfo;

    @FXML
    private TextField CouTimeAndLocation;

    @FXML
    private TextField CouSchool;

    @FXML
    private TextField CouPeriod;

    @FXML
    private TextField CouCapacity;

    @FXML
    private Button btn_set;

    @FXML
    private Button btn_cancel;

    @FXML
    void GoToTeaEvent() {
        //待定
    }

    @FXML
    void SetEvent(){
        //把所有输入信息上传到数据库
        //我不知道后端数据格式，暂时没做防恶意输入，麻烦后端人员告知
        //TODO

        new Admin().showMessage("提示","课程创建成功！", Alert.AlertType.INFORMATION,0);
        stage.close();
    }

    @FXML
    void CancelEvent(){
        stage.close();
    }
}
