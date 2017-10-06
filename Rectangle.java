

import javafx.application.Application;

import javafx.stage.Stage;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;





public class Rectangle extends Application {



    @Override

    public void start(Stage primaryStage) {



        TextInputDialog textInputDialog = new TextInputDialog("");



        textInputDialog.setTitle("GeometricCalculator");



        textInputDialog.setContentText("Enter Width in cm ");



        Optional<String> result = textInputDialog.showAndWait();



        String widthinput = result.get();

         double width = Double.parseDouble(widthinput);



         textInputDialog.setContentText("Enter Height in cm");



        Optional<String> result2 = textInputDialog.showAndWait();

         String Heightinput = result2.get();

         double height = Double.parseDouble(Heightinput);



        double Area = width*height;

        double perimeter = 2*(width+height);





        System.out.println("The area of the rectangle is " + Area + " cm ");

        System.out.println("The perimeter of the rectangle is " + perimeter + " cm");





}


    

          public static void main(String [] args) {

               launch(args);



          
}


}
