module me.mdzs.dataaalysislibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;


    opens me.mdzs.dataaalysislibrary to javafx.fxml;
    exports me.mdzs.dataaalysislibrary;
    exports me.mdzs.dataaalysislibrary.controllers;
    opens me.mdzs.dataaalysislibrary.controllers to javafx.fxml;
}