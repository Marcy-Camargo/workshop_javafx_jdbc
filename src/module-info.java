module workshop_javafx_jdbc {
    requires javafx.controls; //Para controles JavaFX como Button, TableView, etc.
    requires javafx.fxml; //Para carregar arquivos .fxml
    requires java.sql; //Para trabalhar com JDBC (acesso a banco de dados)

    opens application to javafx.graphics, javafx.fxml; //Abre a package application para FXML e gráficos
    opens gui to javafx.fxml; //Abre a package gui para FXML (controladores)
    opens model.entities to javafx.base; //Permite reflexão para JavaFX acessar propriedades (TableView, etc.)

    exports model.entities; //Torna o pacote visível para outros módulos (caso use fora)
}
