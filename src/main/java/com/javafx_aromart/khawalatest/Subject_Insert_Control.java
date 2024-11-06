package com.javafx_aromart.khawalatest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import entites.*;

public class Subject_Insert_Control implements Initializable {
    private FileChooser fileChooser = new FileChooser();
    private String[] teatcherArray = {"Khawla","Salah","Fawzy","Abdeltawab","Mujeeb","Derham","Marwan"};


    @FXML
    private TextField Subject_Insertion_Book;

    @FXML
    private ImageView Subject_Insertion_Image;

    @FXML
    private ChoiceBox<String> Subject_Insertion_Instractor_ChoiceBox;

    @FXML
    private TextField Subject_Insertion_Name;

    @FXML
    private Spinner<Integer> Subject_Insertion_Spinner = new Spinner<>();;

    @FXML
    private Button Subject_Insertion_Submet;

    @FXML
    private Button Subject_Insertion_Upload;
    

    @FXML
    void submetInsert(ActionEvent event) throws SQLException {
    	String name;
    	String book;
    	//int mints;
    	name = Subject_Insertion_Name.getText();
    	book = Subject_Insertion_Book.getText();
    	//mints = Subject_Insertion_Spinner.getValue().
    	DataBaseConection.addSubject(name, book, null);
    }
    
    

    

    @FXML
    void uploadImage(ActionEvent event) {
        File file = fileChooser.showOpenDialog(Subject_Insertion_Upload.getScene().getWindow());
        if (file != null) {
            try {
                Image image = new Image(new FileInputStream(file));
                Subject_Insertion_Image.setImage(image);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));
                Subject_Insertion_Instractor_ChoiceBox.getItems().addAll(teatcherArray);
                Subject_Insertion_Instractor_ChoiceBox.setOnAction(this::getTecher);
                

                SpinnerValueFactory<Integer> valueFactory =  new SpinnerValueFactory.IntegerSpinnerValueFactory( 60, 120, 180,240);
                Subject_Insertion_Spinner.setValueFactory(valueFactory);
        	}
        	
        	public void getTecher(ActionEvent event) {
        		
        		String myFood = Subject_Insertion_Instractor_ChoiceBox.getValue();
        	  	
        	}


}
