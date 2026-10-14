package ma.clicktrack.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.clicktrack.model.Lien;
import ma.clicktrack.repository.LienRepository;
import ma.clicktrack.service.LienService;

@RestController 
@RequestMapping("/api/publishers")
public class LienController {
    private final LienService lienService;

    public LienController(LienService lienService) {
        this.lienService = lienService;
    }

    @PostMapping ("/{id}/liens")
    public ResponseEntity<Lien> createLien(@PathVariable("id") Long publisherId, @RequestBody Lien lien ){
        Optional<Lien> newLien = lienService.createLien(publisherId, lien);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLien.get());
    }
    
}
