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

    @GetMapping("/chuveiros")
    public List<Chuveiro> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Chuveiro createNote(@Valid @RequestBody Chuveiro note) {
        return noteRepository.save(note);
    }


}
