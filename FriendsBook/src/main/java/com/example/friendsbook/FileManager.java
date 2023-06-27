package com.example.friendsbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveFriends(List<Friend> friends) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(friends);
            System.out.println("Friends saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save friends: " + e.getMessage());
        }
    }

    public List<Friend> loadFriends() {
        List<Friend> friends = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            friends = (List<Friend>) inputStream.readObject();
            System.out.println("Friends loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to load friends: " + e.getMessage());
        }
        return friends;
    }
}