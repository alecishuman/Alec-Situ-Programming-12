package com.example.friendsbook;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    public TableColumn<Friend, String> name;
    @FXML
    public TableColumn<Friend, String> id;
    @FXML
    public TableColumn<Friend, String> phone;
    @FXML
    public TableColumn<Friend, String> email;
    @FXML
    public TableView<Friend> table;

    private FileManager fileManager;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        String filePath = "friends.txt"; // Change this to your desired file path
        fileManager = new FileManager(filePath);
        initColumns();
        fillTable();
    }

    private void fillTable() {
        List<Friend> friends = fileManager.loadFriends();
        table.getItems().addAll(friends);
    }

    private void initColumns() {
        name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        id.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        phone.setCellValueFactory(cellData -> cellData.getValue().mobileProperty());
        email.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
    }

    @FXML
    public void saveFriends() {
        List<Friend> friends = table.getItems();
        fileManager.saveFriends(friends);
    }
}