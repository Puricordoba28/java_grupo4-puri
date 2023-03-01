package com.example.java_grupo4.services;

import com.example.java_grupo4.entities.Medicamento;
import java.util.ArrayList;

public interface MedicamentoService {

    public Medicamento save(Medicamento medicamento);

    public Medicamento getById(Long id);

    public ArrayList<Medicamento> getAll();

    public void delete(Long id);
}
