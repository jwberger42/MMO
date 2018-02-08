package com.mmo.launcher;

import com.mmo.game.gameView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by jwberger42 on 2018-02-07.
 */
public class Launcher extends Application {
    private Button butt;
    private gameView gv = new gameView();
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage theStage) throws Exception {
        theStage.setTitle("Launcher");
        FlowPane rootNode = new FlowPane(10,10);
        Scene theScene = new Scene(rootNode,300,100);
        theStage.setScene(theScene);
        butt = new Button("PRESS ME");
        rootNode.getChildren().add(butt);
        theStage.show();
        butt.setOnAction(event -> {
            theStage.setScene(gv.Start());
            theStage.setTitle("MMO GAME!!!!");
            theStage.setMaximized(true);
            theStage.setFullScreen(true);
        });
    }
}
