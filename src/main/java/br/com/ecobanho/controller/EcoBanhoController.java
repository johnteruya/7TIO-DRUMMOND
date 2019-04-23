package br.com.ecobanho.controller;

import br.com.ecobanho.exception.ResourceNotFoundException;
import br.com.ecobanho.model.Banho;
import br.com.ecobanho.repository.BanhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@RestController
@RequestMapping("/api")
public class EcoBanhoController {

    @Autowired
    BanhoRepository noteRepository;

    @GetMapping("/notes")
    public List<Banho> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Banho createNote(@Valid @RequestBody Banho note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public Banho getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public Banho updateNote(@PathVariable(value = "id") Long noteId,
                                           @Valid @RequestBody Banho noteDetails) {

        Banho note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Banho updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Banho note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
