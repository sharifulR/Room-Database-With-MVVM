package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.roomdatabase.models.Note;
import com.example.roomdatabase.viewModels.NoteViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NoteViewModel noteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();

        noteViewModel.getAllNotes().observe(this, new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {

                //
                Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initial() {
        noteViewModel= new ViewModelProvider(this).get(NoteViewModel.class);
    }
}