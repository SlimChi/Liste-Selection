package fr.cs.listeselection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import metier.Personne;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Personne personne1 = new Personne( "nom1");
      Personne personne2 = new Personne("nom2");


        ArrayList<Personne> personnes = new ArrayList<Personne>();
        personnes.add(personne1);
        personnes.add(personne2);

        ListController controller = new ListController();
        controller.setParamettreListe(personnes);
        Scene scene = new Scene(controller);
         stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}