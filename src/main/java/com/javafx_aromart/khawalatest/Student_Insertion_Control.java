package com.javafx_aromart.khawalatest;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
import java.io.FileInputStream;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import entites.*;

public class Student_Insertion_Control implements Initializable{
    private FileChooser fileChooser = new FileChooser();
    //private String[] teatcherArray = {"Khawla","Salah","Fawzy","Abdeltawab","Mujeeb","Derham","Marwan"};
    private String[] subjectsArray = {"java","data structure","c++","circat analeses", "DSB","math"};
    
	 // ArrayList<Student> students ;
	  
	  public Student_Insertion_Control() {
		  //students = new ArrayList<Student>() ;
	}
	  
	
    @FXML
    private TextField Student_Insertion_BirthPlace;

    @FXML
    private CheckBox Student_Insertion_CheckActiv;

    @FXML
    private ChoiceBox<String> Student_Insertion_ChoiceBox;

    @FXML
    private DatePicker Student_Insertion_DatePicker;

    @FXML
    private TextField Student_Insertion_FName;

    @FXML
    private TextField Student_Insertion_LName;

    @FXML
    private TextField Student_Insertion_MName;

    @FXML
    private RadioButton Student_Insertion_RadioFemal;

    @FXML
    private RadioButton Student_Insertion_RadioMale;

    @FXML
    private ImageView Student_Insertion_Student_Image;

    @FXML
    private Button Student_Insertion_Submet;

    @FXML
    private Button Student_Insertion_UpLoad_Button;
    
	
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );
       Student_Insertion_ChoiceBox.getItems().addAll(subjectsArray);
        Student_Insertion_ChoiceBox.setOnAction(this::getTecher);
		
	}
	
	public void getTecher(ActionEvent event) {
		
		String myFood = Student_Insertion_ChoiceBox.getValue();
	
	
	}
	
	
	
	
    @FXML
    void selectDate(ActionEvent event) {
    	
    }

    @FXML
    void submetInsert(ActionEvent event) throws SQLException {
    	
    
		LocalDate date;
	    String name;
	    int berthDate;
	    Boolean gender;
	    
		name =Student_Insertion_FName.getText() + Student_Insertion_MName.getText() + Student_Insertion_LName.getText() ;
		date = Student_Insertion_DatePicker.getValue();
		berthDate = date.getYear();
		gender = Student_Insertion_RadioMale.isSelected();
		DataBaseConection.addStudent(name, berthDate, gender);
		//students.add(new Student( name, berthDate,gender));
    }
    
    
    
    

    @FXML
    void uploadImageInsetion(ActionEvent event) {
        File file = fileChooser.showOpenDialog(Student_Insertion_UpLoad_Button.getScene().getWindow());
        if (file != null) {
            try {
                Image image = new Image(new FileInputStream(file));
                Student_Insertion_Student_Image.setImage(image);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    







}
