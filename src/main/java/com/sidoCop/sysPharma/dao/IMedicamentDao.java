package com.sidoCop.sysPharma.dao;

import java.util.List;

import com.sidoCop.sysPharma.domaine.model.Medicament;

public interface IMedicamentDao {

	Medicament recuperationMedicament(int id);

	Medicament creerMedicament(Medicament medicament);

	Medicament modifierMedicament(Medicament medicament);

	void supprimerMedicament(Medicament medicament);

	List<Medicament> recuperationListeMedicament();

}