module fr.cs.listeselection {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.cs.listeselection to javafx.fxml;
    exports fr.cs.listeselection;
}