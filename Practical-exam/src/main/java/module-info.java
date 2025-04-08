module org.rocs.practicalexam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rocs.practicalexam to javafx.fxml;
    exports com.rocs.practicalexam;
}