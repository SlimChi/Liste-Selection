package fr.cs.listeselection;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import metier.Lists;

import java.util.ArrayList;

public class ListController<T> extends BorderPane {

    @FXML
    private ListView<T> listeGauche;

    @FXML
    private ListView<T> listeDroite;

    private Lists tousLesItems;

    public ListController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("liste.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        tousLesItems = new Lists();

        try {
            fxmlLoader.load();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(){

    }
    public void setParamettreListe(ArrayList<T> items){
        tousLesItems.setAllItems(items);
        listeGauche.setItems(tousLesItems.getAllItems());

    }


}
