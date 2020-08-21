package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
     private Button btn1;
     private  Button btn2;
     private Label label1;
     private  Label label2;
      private VBox root;
      private  VBox root2;
      private FlowPane root3;
    @Override
    public void start(Stage primaryStage) throws Exception{
       btn1= new Button();
       btn2= new Button();
       btn1.setText("Username Button");
       btn2.setText("password Button");
       label1=new Label("UserNAme");
       label2=new Label("Password");
          root3=new FlowPane();
       root =new VBox();
        root.getChildren().addAll(label1, label2);
        root.setAlignment(Pos.CENTER);
     //   Scene scene=new Scene(root);
        root.setSpacing(20);
        root2 = new VBox();
        root2.getChildren().addAll(btn1, btn2);
     //   Scene scene2= new Scene(root2);
          root2.setAlignment(Pos.CENTER);
          root2.setSpacing(20);
    root3.getChildren().addAll(root,root2);
    root3.setHgap(20);
    root3.setAlignment(Pos.CENTER);

    Scene scene=new Scene(root3, 400,200);


        primaryStage.setTitle("181380035");
        primaryStage.setScene(scene);
        primaryStage.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
