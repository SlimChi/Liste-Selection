package metier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;

    public class Lists<T>{

        public ObservableList<T> tousLesItems;
        private FilteredList<T> itemsFiltrer;

        public Lists(){
            tousLesItems = FXCollections.observableArrayList();
            itemsFiltrer = new FilteredList<>(tousLesItems,critere -> true);
        }

        public ObservableList<T> getAllItems() {
            return tousLesItems;
        }

        public FilteredList<T> getFilteredItems() {
            return itemsFiltrer;
        }

        public void setAllItems(ArrayList<T> items) {
            tousLesItems = FXCollections.observableArrayList(items);

        }
    }

