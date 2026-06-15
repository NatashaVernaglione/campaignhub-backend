package com.campaignhub.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/campagne")
@CrossOrigin(origins = "http://localhost:4200")
public class CampagnaController {

    @Autowired
    private CampagnaService campagnaService;

    // GET - ottieni tutte le campagne
    @GetMapping
    public List<Campagna> getTutte() {
        return campagnaService.getTutte();
    }

    // POST - crea nuova campagna
    @PostMapping
    public Campagna crea(@RequestBody Campagna campagna) {
        return campagnaService.crea(campagna);
    }

    // PUT - modifica campagna
    @PutMapping("/{id}")
    public Campagna modifica(@PathVariable Long id, @RequestBody Campagna campagna) {
        return campagnaService.modifica(id, campagna);
    }

    // DELETE - elimina campagna
    @DeleteMapping("/{id}")
    public void elimina(@PathVariable Long id) {
        campagnaService.elimina(id);
    }
}