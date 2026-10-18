package ma.clicktrack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.clicktrack.dto.TrackLienResponse;
import ma.clicktrack.service.LienService;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/t")
public class TrackController {
    private final LienService lienService;

    public TrackController(LienService lienService) {
        this.lienService = lienService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrackLienResponse> trackClick(
            @PathVariable("id") Long id) {

        Optional<TrackLienResponse> response = lienService.trackClick(id);

        if (response.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(response.get());
    }

}
