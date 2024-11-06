package com.javafx_aromart.khawalatest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;

public class Student_Statistics_Control implements Initializable {
	 @FXML
	    private CategoryAxis Xaxis;

	    @FXML
	    private NumberAxis Yaxis;

	    @FXML
	    private AreaChart<?, ?> Student_Statistics_AreaChart;
	    

	    @FXML
	    private BarChart<?, ?> Student_Statistics_BarChart;

	    @FXML
	    private BubbleChart<?, ?> Student_Statistics_BubbleChart;

	    @FXML
	    private PieChart Student_Statistics_PieChart;

	    @FXML
	    private LineChart<?, ?> Student_Statistics_linerChart;

//	    @FXML
//	    private CategoryAxis Xaxis;
//
//	    @FXML
//	    private NumberAxis Yaxis;
	    

	    @FXML
	    private CategoryAxis LineX;

	    @FXML
	    private NumberAxis LineY;

	    @FXML
	    private CategoryAxis barX;

	    @FXML
	    private NumberAxis barY;

	    @FXML
	    private NumberAxis bubbX;

	    @FXML
	    private NumberAxis bubbY;

	    
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {

			
			 XYChart.Series series = new XYChart.Series<>();
	         series.setName("age");
	         
	         
	   
	         series.getData().add(new XYChart. Data("1999", 1));
	         series.getData().add(new XYChart. Data("1990", 20));
	         series.getData().add(new XYChart. Data("2005", 100));
	         series.getData().add(new XYChart. Data("2010", 35));
	         series.getData().add(new XYChart. Data("2004", 12));
	         //Student_Statistics_AreaChart.getData().add(series);
	         Student_Statistics_BarChart.getData().add(series);
	         Student_Statistics_linerChart.getData().add(series);
	         
	         XYChart.Series series1 = new XYChart.Series<>();
		        series.setName("age");
	         series1.getData().add(new XYChart. Data(5, 1));
		        series1.getData().add(new XYChart. Data(8, 20));
		        series1.getData().add(new XYChart. Data(4, 100));
		        series1.getData().add(new XYChart. Data(15, 35));
		        series1.getData().add(new XYChart. Data(20, 12));
		        
		        Student_Statistics_BubbleChart.getData().add(series1);

	         
	         // الدائرة
	         ObservableList<PieChart.Data> pieChartData =
	 				FXCollections.observableArrayList(
	 						new PieChart.Data("man",34),
	 		                new PieChart.Data("woman",21)
	 		                );

	         Student_Statistics_PieChart.setData(pieChartData);




}
}
