package com.example.java_grupo4.servicesImpl;

import com.example.java_grupo4.entities.Medicamento;
import com.example.java_grupo4.repositories.MedicamentoRepository;
import com.example.java_grupo4.services.MedicamentoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class MedicamentoServiceImpl implements MedicamentoService {


    MedicamentoRepository repository;
    @Override
    public Medicamento save(Medicamento medicamento) {
        return repository.save(medicamento);
    }

    @Override
    public Medicamento getById(Long id) {
        return null;
    }

    @Override
    public ArrayList<Medicamento> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
