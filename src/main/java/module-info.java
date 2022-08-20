module com.example.forza_quattro_grid2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forza_quattro_grid2 to javafx.fxml;
    exports com.example.forza_quattro_grid2;
}