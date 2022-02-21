module com.example.quizzify {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.quizzify to javafx.fxml;
    exports com.example.quizzify;
}