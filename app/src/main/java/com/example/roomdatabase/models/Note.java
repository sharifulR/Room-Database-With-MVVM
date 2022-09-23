package com.example.roomdatabase.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "note_title")
    private String noteTitle;

    private String description;

    private String priority;

    public Note(String noteTitle, String description, String priority) {
        this.noteTitle = noteTitle;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }
}
