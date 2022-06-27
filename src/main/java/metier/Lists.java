package metier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;

    public class Lists<T>{

        public ObservableList<T> allItems;
        private FilteredList<T> filteredItems;

        public Lists(){
            allItems = FXCollections.observableArrayList();
            filteredItems = new FilteredList<>(allItems,critere -> true);
        }

        public ObservableList<T> getAllItems() {
            return allItems;
        }

        public FilteredList<T> getFilteredItems() {
            return filteredItems;
        }

        public void setAllItems(ArrayList<T> items) {
            allItems = FXCollections.observableArrayList(items);

        }
    }

