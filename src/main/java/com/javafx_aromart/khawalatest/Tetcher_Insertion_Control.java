package com.javafx_aromart.khawalatest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import entites.*;

public class Tetcher_Insertion_Control implements Initializable{
    private FileChooser fileChooser = new FileChooser();
    private String[] subjectsArray = {"java","data structure","c++","circat analeses", "DSB","math"};
    private String[] degreeArray = {"Diploma","Bachelor's","Master's","PhD"}; 
	
	  
	  public Tetcher_Insertion_Control() {
		 
	}
	  
	

    @FXML
    private TextField Tetcher_Insertion_BirthPlace;

    @FXML
    private CheckBox Tetcher_Insertion_CheckActiv;

    @FXML
    private ChoiceBox<String> Tetcher_Insertion_ChiceBox_Dagree;

    @FXML
    private ChoiceBox<String> Tetcher_Insertion_ChiceBox_Subjects;

    @FXML
    private DatePicker Tetcher_Insertion_DatePicer_BirthDate;

    @FXML
    private TextField Tetcher_Insertion_FName;

    @FXML
    private ImageView Tetcher_Insertion_Image;

    @FXML
    private TextField Tetcher_Insertion_LName;

    @FXML
    private Button Tetcher_Insertion_Loade;

    @FXML
    private TextField Tetcher_Insertion_MName;

    @FXML
    private RadioButton Tetcher_Insertion_RadioFemail;

    @FXML
    private RadioButton Tetcher_Insertion_RadioMale;

    @FXML
    private Button Tetcher_Insertion_Submet;
    

    @FXML
    void submetInsert(ActionEvent event) throws SQLException {
		LocalDate date;
	    String name;
	    int berthDate;
	    boolean gender;
	    String sp="";
	    
		name =Tetcher_Insertion_FName.getText() + Tetcher_Insertion_MName.getText() + Tetcher_Insertion_LName.getText() ;
		date = Tetcher_Insertion_DatePicer_BirthDate.getValue();
		berthDate = date.getYear();
		gender = Tetcher_Insertion_RadioMale.isSelected();
		DataBaseConection.addTecher(name, berthDate, gender);
		
    }

    @FXML
    void uploadImageInsert(ActionEvent event) {
        File file = fileChooser.showOpenDialog(Tetcher_Insertion_Loade.getScene().getWindow());
        if (file != null) {
            try {
                Image image = new Image(new FileInputStream(file));
                Tetcher_Insertion_Image.setImage(image);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );
        
        Tetcher_Insertion_ChiceBox_Dagree.getItems().addAll(degreeArray);
        Tetcher_Insertion_ChiceBox_Dagree.setOnAction(this::getDegree);
        Tetcher_Insertion_ChiceBox_Subjects.getItems().addAll(subjectsArray);
        Tetcher_Insertion_ChiceBox_Subjects.setOnAction(this::getSubject);
		
	}

    
    public void getDegree(ActionEvent event) {
		
	}
    public void getSubject(ActionEvent event) {
		
	}
    
}
