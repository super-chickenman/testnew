package admin_jar.font;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import manager_jar.Main.Admin;

public class MainController {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private Stage stage;

    @FXML
    private TextField a_main_password;

    @FXML
    private TextField a_main_aid;

    @FXML
    private TextField a_main_name;

    @FXML
    private Button btn_alter;

    @FXML
    private Button btn_cancel;

    @FXML
    private Button btn_course;

    @FXML
    private Button btn_stu;

    @FXML
    private Button btn_tea;

    @FXML
    private ListView<?> CourseList;

    @FXML
    private Label CourseLabel;

    @FXML
    private Label StuLabel;

    @FXML
    private Label TeaLabel;

    @FXML
    private ListView<?> TeaList;

    @FXML
    private ListView<?> StuList;
    //监控btn_alter的状态
    boolean isEditable = false;
    //储存上一次的编译内容
    //这里需要读取密码到prepassword里
    //还需要读取个人信息
    //TODO
    private  String prepassword = "";

    @FXML
    void AlterEvent() {
        if(!isEditable){
            a_main_password.setEditable(true);
            btn_alter.setText("确定");
            btn_cancel.setVisible(true);
            isEditable = true;
        }else{
            if(new Admin().showMessage("修改密码","确定修改密码?", Alert.AlertType.CONFIRMATION,1)){
                //这里需要将修改的密码上传到数据库
                //TODO


                a_main_password.setEditable(false);
                btn_cancel.setVisible(false);
                btn_alter.setText("修改密码");
                isEditable = false;
                prepassword = a_main_password.getText();
            }
        }
    }

    @FXML
    void CancelEvent() {
        a_main_password.setEditable(false);
        btn_cancel.setVisible(false);
        btn_alter.setText("修改密码");
        isEditable = false;
        a_main_password.setText(prepassword);
    }

    //初始化所有子界面的可视化状态
    void setVisible(){
        CourseLabel.setVisible(false);
        CourseList.setVisible(false);
        StuLabel.setVisible(false);
        StuList.setVisible(false);
        TeaLabel.setVisible(false);
        TeaList.setVisible(false);
    }

    //以下三个都分别需要提取对应的数据表
    //TODO
    @FXML
    void CourseEvent() {
        setVisible();
        CourseLabel.setVisible(true);
        CourseList.setVisible(true);
    }

    @FXML
    void StuEvent() {
        setVisible();
        StuLabel.setVisible(true);
        StuList.setVisible(true);
    }

    @FXML
    void TeaEvent() {
        setVisible();
        TeaList.setVisible(true);
        TeaLabel.setVisible(true);
    }

}
