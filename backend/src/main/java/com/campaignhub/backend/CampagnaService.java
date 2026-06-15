package com.campaignhub.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CampagnaService {

    @Autowired
    private CampagnaRepository campagnaRepository;

    // Ottieni tutte le campagne
    public List<Campagna> getTutte() {
        return campagnaRepository.findAll();
    }

    // Crea una nuova campagna
    public Campagna crea(Campagna campagna) {
        return campagnaRepository.save(campagna);
    }

    // Elimina una campagna
    public void elimina(Long id) {
        campagnaRepository.deleteById(id);
    }

    // Modifica una campagna
    public Campagna modifica(Long id, Campagna nuovaCampagna) {
        nuovaCampagna.setId(id);
        return campagnaRepository.save(nuovaCampagna);
    }
}