module uniquindio.edu.co.listaclientes {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.edu.co.listaclientes to javafx.fxml;
    exports uniquindio.edu.co.listaclientes;
    exports uniquindio.edu.co.listaclientes.viewController;
    opens uniquindio.edu.co.listaclientes.viewController to javafx.fxml;
}