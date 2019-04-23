package br.com.ecobanho.controller;

import br.com.ecobanho.model.Chuveiro;
import br.com.ecobanho.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EcoBanhoController {

    @Autowired
    chuveiroRepository noteRepository;

    @GetMapping("/notes")
    public List<Chuveiro> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Chuveiro createNote(@Valid @RequestBody Chuveiro note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public Chuveiro getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public Chuveiro updateNote(@PathVariable(value = "id") Long noteId,
                                           @Valid @RequestBody Banho noteDetails) {

    	Chuveiro note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Chuveiro updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
    	Chuveiro note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
