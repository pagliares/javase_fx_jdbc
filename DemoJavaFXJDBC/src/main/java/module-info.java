module org.example.demojavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.demojavafxjdbc to javafx.fxml;
    exports org.example.demojavafxjdbc;
}