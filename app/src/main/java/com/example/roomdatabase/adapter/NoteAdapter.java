package com.example.roomdatabase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdatabase.R;
import com.example.roomdatabase.models.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder> {

    private List<Note> notes=new ArrayList<>();

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_item,parent,false);
        return new NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {

        Note currentNote=notes.get(position);
        holder.titleTV.setText(currentNote.getNoteTitle());
        holder.descriptionTV.setText(currentNote.getDescription());
        holder.priorityTV.setText(currentNote.getPriority());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
    public void setNotes(List<Note> notes){
        this.notes=notes;
        notifyDataSetChanged();
    }

    static class NoteHolder extends RecyclerView.ViewHolder{

        private TextView titleTV,descriptionTV,priorityTV;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            titleTV=itemView.findViewById(R.id.titleTV);
            descriptionTV=itemView.findViewById(R.id.descriptionTV);
            priorityTV=itemView.findViewById(R.id.priorityTV);
        }
    }
}
