package admin_jar.font;

import admin_jar.Main.Admin;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChangePasswordController{

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Stage stage;

    @FXML
    private TextField a_new_password;

    @FXML
    private Button btn_set;

    @FXML
    private Button btn_cancel;

    @FXML
    void CancelEvent() {
        stage.close();
    }

    @FXML
    void SetEvent() {
        try{
            if(a_new_password.getText().trim().isEmpty()){
                throw new Exception.PasswordNullException();
            }
            if(new Admin().showMessage("提示","确定修改密码？", Alert.AlertType.CONFIRMATION,1)){
                //将新密码上传到数据库
                //TODO


                new Admin().showMessage("提示","密码修改成功", Alert.AlertType.INFORMATION,0);
                stage.close();
            }
        } catch (Exception.PasswordNullException e) {
            new Admin().showMessage("密码修改失败","新密码不能为空", Alert.AlertType.ERROR,0);
        }
    }

}
