package com.devmountain.noteApp.dtos;

import com.devmountain.noteApp.entites.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable {

    private Long id;
    private String body;

    public NoteDto(Note note) {
        this.id = note.getId();
        this.body = note.getBody();
    }
}
