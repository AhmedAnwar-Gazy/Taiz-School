package com.javafx_aromart.khawalatest;
import entites.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import entites.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Student_Edit_Control {

    @FXML
    private Button Student_Edit_Back;

    @FXML
    private Button Student_Edit_Save;

    @FXML
    private TableView<persong> Student_Edit_Tabel;

    @FXML
    private TableColumn<persong, Integer> Student_Edit_Tabel_Age;

    @FXML
    private TableColumn<persong, Integer> Student_Edit_Tabel_GBA;

    @FXML
    private TableColumn<persong, Integer> Student_Edit_Tabel_ID;

    @FXML
    private TableColumn<persong, String> Student_Edit_Tabel_Name;

    @FXML
    private TableColumn<persong, String> Student_Edit_Tabel_Sbject1;

    @FXML
    private TableColumn<?, ?> Student_Edit_Tabel_Sbject2;

    @FXML
    private TableColumn<?, ?> Student_Edit_Tabel_Sbject3;

    @FXML
    private TableColumn<?, ?> Student_Edit_Tabel_Sbject4;

    @FXML
    private TableColumn<?, ?> Student_Edit_Tabel_Sbject5;

    @FXML
    private TableColumn<?, ?> Student_Edit_Tabel_Sbject6;

    private ObservableList<persong> personList = FXCollections.observableArrayList();

    @FXML
    void backEdit(ActionEvent event) {

    }

    @FXML
    void deleteEdit(ActionEvent event) {

    }

    @FXML
    void saveEdit(ActionEvent event) {

    }
    @FXML
    public void initialize() {
        // Initialize the columns with the respective property names
        Student_Edit_Tabel_ID.setCellValueFactory(new PropertyValueFactory<>("id"));
        Student_Edit_Tabel_ID.setEditable(false); // Prevent editing of the ID column
        Student_Edit_Tabel_Name.setCellValueFactory(new PropertyValueFactory<>("name"));
        Student_Edit_Tabel_Name.setCellFactory(TextFieldTableCell.forTableColumn());
        Student_Edit_Tabel_Name.setOnEditCommit(event -> {
            persong person = event.getRowValue();
            person.setName(event.getNewValue());
          //  updateDatabase(person); // Update the database with the new name
        });

        Student_Edit_Tabel_Age.setCellValueFactory(new PropertyValueFactory<>("age"));
        Student_Edit_Tabel_Age.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Student_Edit_Tabel_Age.setOnEditCommit(event -> {
            persong person = event.getRowValue();
            person.setAge(event.getNewValue());
     //       updateDatabase(person); // Update the database with the new age
        });

//        imageURL.setCellValueFactory(new PropertyValueFactory<>("imageurl"));
//
        // Fetch data from the database
//        loadDataFromDatabase();

        // Set the items for the TableView
        Student_Edit_Tabel.setItems(personList);
        Student_Edit_Tabel.setEditable(true); // Make the table editable
    }
    private void updateDatabase(Person person) {
        String url = "jdbc:mysql://localhost:3306/school"; // Replace with your database URL
        String user = "root"; // Replace with your database username
        String password = "mohammedmogeab"; // Replace with your database password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE student SET name = ?, age = ? WHERE student_id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
           // pst.setString(1, persong.getName());
          //  pst.setInt(2, persong.getAge());
            pst.setInt(3, person.getId());
            pst.executeUpdate();

            // Close resources
            pst.close();
        } catch (Exception e) {
//            showAlert("Database Update Error", "Could not update the database. Please try again.");
            e.printStackTrace();
        }
    }
//
//    private void loadDataFromDatabase() {
//        String url = "jdbc:mysql://localhost:3306/school"; // Replace with your database URL
//        String user = "root"; // Replace with your database username
//        String password = "mohammedmogeab"; // Replace with your database password
//
//        try {
//            // Register JDBC driver (optional)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish connection
////            Connection conn = DriverManager.getConnection(url, user, password);
//            String query = "SELECT * FROM student"; // Adjust the query according to your table structure
//            //PreparedStatement pst = conn.prepareStatement(query);
//          //  ResultSet res = pst.executeQuery();

//            while (res.next()) {
//                personList.add(new persong(res.getInt("student_id"), res.getString("name"), res.getInt("age")));
//            }
//
//            // Close resources
//            res.close();
//            pst.close();
//            conn.close();
//        } catch (Exception e) {
//           // showAlert("Database Error", "Could not load data from database. Please check your connection and try again.");
//            e.printStackTrace(); // Print the stack trace to help with debugging
//        }
//    }
//
    

}
