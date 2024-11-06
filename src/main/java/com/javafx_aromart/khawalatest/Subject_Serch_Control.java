package com.javafx_aromart.khawalatest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import entites.*;


public class Subject_Serch_Control {

    @FXML
    private Button Subject_Serch_Serch_Button;

    @FXML
    private TextField Subject_Serch_Serch_Filed;

    @FXML
    private TableView<?> Subject_Serch_Table;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Book;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Instractor1;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Instractor2;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Instractor3;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_MaxGread;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Minets;

    @FXML
    private TableColumn<?, ?> Subject_Serch_Table_Name;

    @FXML
    private ChoiceBox<?> Subject_Serch_filter_ChoiceBox;
    
    @FXML
    void serch(ActionEvent event) {

    }


}
