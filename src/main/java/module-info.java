module com.mischief247.ffrpgmonstermaker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.mischief247.ffrpgmonstermaker to javafx.fxml;
    exports com.mischief247.ffrpgmonstermaker;
}