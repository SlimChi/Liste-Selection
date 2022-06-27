package fr.cs.listeselection;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import metier.Lists;

import java.util.ArrayList;

public class ListController<T> extends BorderPane {

    @FXML
    private ListView<T> itemSelected;

    @FXML
    private ListView<T> itemsView;

    private Lists allItems;

    public ListController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("liste.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        allItems = new Lists();

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
        allItems.setAllItems(items);
        itemsView.setItems(allItems.getAllItems());

    }


}
