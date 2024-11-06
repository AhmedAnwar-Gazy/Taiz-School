package com.javafx_aromart.khawalatest;
import entites.*;
/* import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
 */
import entites.Student;
import entites.Subject;
import entites.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Home_Control implements Initializable{
	  ArrayList<Student> students ;
	  ArrayList<Teacher> teachers ;
	  ArrayList<Subject> subjects ;
	  
	  

	    @FXML
	    private MenuItem AddStudent;

	    @FXML
	    private MenuItem AddSubject;

	    @FXML
	    private MenuItem AddTecher;

	    @FXML
	    private MenuItem EditStudent;

	    @FXML
	    private MenuItem EditSubject;

	    @FXML
	    private MenuItem EditTecher;

	    @FXML
	    private MenuItem SerchStudent;

	    @FXML
	    private MenuItem SerchSubject;

	    @FXML
	    private MenuItem SerchTecher;

	    @FXML
	    private MenuItem StatisticsStudent;

	    @FXML
	    private MenuItem StatisticsSubject;

	    @FXML
	    private MenuItem StatisticsTecher;

	    @FXML
	    private BorderPane mainPane;
	    
	    
	    //---------------------------------------------
	    @FXML
	    void studentEdit(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Student_Edit.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void studentInsertion(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Student_Insertion.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void studentSerch(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Student_Serch.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void studentStatistics(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Student_Statistics.fxml"));
	    	mainPane.setCenter(view);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //-----------------------------------------

	    @FXML
	    void subjectsEdit(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Subject_Edit.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void subjectsInsertion(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Subject_Insertion.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void subjectsSerch(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Subject_Serch.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void subjectsStatistics(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Subject_Statistics.fxml"));
	    	mainPane.setCenter(view);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //-----------------------------------------

	    @FXML
	    void techerEdit(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Tetcher_Edit.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void techerInsertion(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Tetcher_Insertion.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void techerSerch(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Tatcher_Serch.fxml"));
	    	mainPane.setCenter(view);
	    }

	    @FXML
	    void techerStatistics(ActionEvent event) throws IOException {
	    	HBox view = FXMLLoader.load(getClass().getResource("Tetcher_Statistics.fxml"));
	    	mainPane.setCenter(view);
	    }
	  
	    
	    
	    
	    
	    
	    
	  //-------------------------------------
	  
	  public Home_Control ()  {
		  students = new ArrayList<Student>() ;
		  teachers = new ArrayList<Teacher>() ;
		  subjects = new ArrayList<Subject>() ;

		  
	  }
	  
	  //--------------------------
	  
	  

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	  

}
