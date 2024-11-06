package com.javafx_aromart.khawalatest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class Subject_Statistics_Control implements Initializable {
    @FXML
    private NumberAxis LinY;

    @FXML
    private BubbleChart<?, ?> Subject_Statistics_BubbleChart;

    @FXML
    private LineChart<?, ?> Subject_Statistics_LineChar;

    @FXML
    private PieChart Subject_Statistics_PieChar;

    @FXML
    private NumberAxis bubbX;

    @FXML
    private NumberAxis bubbY;

    @FXML
    private CategoryAxis linX;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		 XYChart.Series series = new XYChart.Series<>();
	        series.setName("age");
	  
	        series.getData().add(new XYChart. Data("1999", 1));
	        series.getData().add(new XYChart. Data("1990", 20));
	        series.getData().add(new XYChart. Data("2005", 100));
	        series.getData().add(new XYChart. Data("2010", 35));
	        series.getData().add(new XYChart. Data("2004", 12));
	        Subject_Statistics_LineChar.getData().add(series);

	        XYChart.Series series1 = new XYChart.Series<>();
	        series.setName("age");
	  
	        series1.getData().add(new XYChart. Data(5, 1));
	        series1.getData().add(new XYChart. Data(8, 20));
	        series1.getData().add(new XYChart. Data(4, 100));
	        series1.getData().add(new XYChart. Data(15, 35));
	        series1.getData().add(new XYChart. Data(20, 12));
	        
	       Subject_Statistics_BubbleChart.getData().add(series1);

	        
	     // الدئراة
	     		ObservableList<PieChart.Data> pieChartData =
	     				FXCollections.observableArrayList(
	     						new PieChart.Data("man",34),
	     		                new PieChart.Data("woman",21)
	     		                );

	     		Subject_Statistics_PieChar.setData(pieChartData);
			
		
	}

}
