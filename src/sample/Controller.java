package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

	@FXML
	public TableView<Item> itemsTable;
	@FXML
	public TableColumn<Item, String> tableColumnName;
	@FXML
	public TableColumn<Item, Double> tableColumnValue;
	@FXML
	public TableColumn<Item, Integer> tableColumnItems;
	@FXML
	public TableColumn<Item, Double> tableColumnTotale;

	@FXML
	public LineChart<String, Number> lineChart;

	XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();

	private static ObservableList<Item> data = FXCollections.observableArrayList(
			new Item("Item no. 1", 150, 12),
			new Item("Item no. 2", 100, 13),
			new Item("Item no. 3", 121, 21),
			new Item("Item no. 4", 212, 132),
			new Item("Item no. 5", 250, 244),
			new Item("Item no. 6", 10, 25),
			new Item("Item no. 7", 50, 112),
			new Item("Item no. 8", 10, 34),
			new Item("Item no. 9", 40, 42),
			new Item("Item no. 10", 50, 52)
	);

	private static ObservableList<XYChart.Data<String, Number>> chartData = FXCollections.observableArrayList(
			new XYChart.Data<String, Number>("10", 132D),
			new XYChart.Data<String, Number>("11", 142D),
			new XYChart.Data<String, Number>("12", 139D),
			new XYChart.Data<String, Number>("13", 138D),
			new XYChart.Data<String, Number>("14", 131D),
			new XYChart.Data<String, Number>("15", 142D),
			new XYChart.Data<String, Number>("16", 145D),
			new XYChart.Data<String, Number>("17", 144D),
			new XYChart.Data<String, Number>("18", 140D),
			new XYChart.Data<String, Number>("19", 136D),
			new XYChart.Data<String, Number>("20", 132D),
			new XYChart.Data<String, Number>("21", 133D)
	);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tableColumnName.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
		tableColumnValue.setCellValueFactory(new PropertyValueFactory<Item, Double>("value"));
		tableColumnItems.setCellValueFactory(new PropertyValueFactory<Item, Integer>("items"));
		tableColumnTotale.setCellValueFactory(new PropertyValueFactory<Item, Double>("total"));
		itemsTable.setItems(data);
		series.setName("Test chart name");
		series.setData(chartData);
		lineChart.getData().add(series);
	}
}
