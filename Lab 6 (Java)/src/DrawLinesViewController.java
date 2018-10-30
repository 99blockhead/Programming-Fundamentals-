// Georgian Student Number : 200416930
// Lakehead Student Number : 0877826
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DrawLinesViewController implements Initializable {

    @FXML
    private Canvas canvas;

    @FXML
    private ImageView lPatternImageView;

    @FXML
    private ImageView footballPatternImageView;

    @FXML
    private ImageView threeQuartersImageView;

    @FXML
    private ImageView fullImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lPatternImageView.setImage(new Image("L-pattern.png"));
        footballPatternImageView.setImage(new Image("footballPattern.png"));
        threeQuartersImageView.setImage(new Image("3Quarters.png"));
        fullImageView.setImage(new Image("full.png"));
    }

    @FXML
    public void drawXButtonPressed() //What happens when the x button is pressed
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();

        //draw line from top corner to bottom corner
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

        //draw line from bottom left corner to upper right corner
        gc.strokeLine(0, canvas.getHeight(), canvas.getWidth(), 0);
    }

    @FXML
    public void drawLPatternButtonPressed() // What happens when the L Pattern button is pressed
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
        for(int i = 0; i < canvas.getWidth(); i+=10){
            gc.strokeLine(0,i,i,canvas.getHeight());// Bottom Left L-Shape
    }
    }

    @FXML
    public void footballPatternButtonPressed() // What happens when the football shape button is pressed
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
        for(int i = 0; i < canvas.getWidth()+10; i+=10){
            gc.strokeLine(0,i,i,canvas.getHeight()); // Bottom Left L-Shape
            gc.strokeLine(canvas.getWidth(),i,i,0); //Upper Right L-Shape
        }
    }

    @FXML
    public void threeQuartersPatternButtonPressed() //What happens when the three quarters pattern button pressed
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();

        for(int i = 0; i < canvas.getWidth()+10; i+=10){
            gc.strokeLine(0,i,i,canvas.getHeight()); // Bottom Left L-Shape
            gc.strokeLine(canvas.getWidth(),i,i,0); //Upper Right L-Shape

        }

        double n = canvas.getWidth();
        for(int i = 0; i < canvas.getWidth()+10; i+=10)
        {
          gc.strokeLine(canvas.getWidth(),i,n,canvas.getHeight()); //Bottom Right L-Shape
          n = n - 10;
        }

    }

    @FXML
    public void fullPatternButtonPressed() //What happens when the full pattern shape is pressed
    {
        //get the GraphicsContent, which is used to draw on the canvas
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();

        for(int i = 0; i < canvas.getWidth()+10; i+=10){
            gc.strokeLine(0,i,i,canvas.getHeight());//Bottom Left L-Shape
            gc.strokeLine(canvas.getWidth(),i,i,0); //Upper Right L-Shape
        }

        double n = canvas.getWidth();
        for(int i = 0; i < canvas.getWidth()+10; i+=10) //Lower Right Corner L-Shape
        {
            gc.strokeLine(canvas.getWidth(),i,n,canvas.getHeight());

            n = n - 10;
        }

        double p = canvas.getWidth();
        for(int i = 0; i < canvas.getWidth()+10; i+=10) // Upper Left Corner L-Shape
        {
            gc.strokeLine(0,i,p,0);

            p = p - 10;
        }


    }

    public GraphicsContext clearCanvasAndGetGraphicsContext() //clear
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //clear the canvas
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); //clear

        return gc;
    }
}
