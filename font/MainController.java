package admin_jar.font;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import admin_jar.Main.Admin;

import java.io.IOException;

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
    private Button btn_course;

    @FXML
    private Button btn_stu;

    @FXML
    private Button btn_tea;

    @FXML
    private Button btn_add;

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
    //prepassword的作用是储存上一次的编译内容
    //这里需要读取密码到prepassword里
    //TODO
    private  String prepassword = "";
    //这里需要读取个人信息到前面的TextField里
    //TODO


    @FXML
    void AlterEvent() throws IOException {
        new Admin().ChangePassword();
    }

    //初始化所有子界面的可视化状态
    void setVisible(){
        CourseLabel.setVisible(false);
        CourseList.setVisible(false);
        StuLabel.setVisible(false);
        StuList.setVisible(false);
        TeaLabel.setVisible(false);
        TeaList.setVisible(false);
        btn_add.setVisible(true);
    }

    //以下三个都分别需要提取对应的数据表
    //TODO
    @FXML
    void CourseEvent() {
        setVisible();
        CourseLabel.setVisible(true);
        CourseList.setVisible(true);
        //提取课程的数据库

    }

    @FXML
    void StuEvent() {
        setVisible();
        StuLabel.setVisible(true);
        StuList.setVisible(true);
        //提取学生的数据库

    }

    @FXML
    void TeaEvent() {
        setVisible();
        TeaList.setVisible(true);
        TeaLabel.setVisible(true);
        //提取老师的数据库

    }

    @FXML
    void AddEvent() throws IOException {
        if(CourseList.isVisible()){
            new Admin().CourseField();
        }
        if (TeaList.isVisible()){
            new Admin().TeaField();
        }
        if(StuList.isVisible()){
            new Admin().StuField();
        }
    }

}
