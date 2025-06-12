package com.sidoCop.sysPharma.dao;

import java.util.List;

import com.sidoCop.sysPharma.domaine.model.Categorie;
import com.sidoCop.sysPharma.domaine.model.Medicament;

public class MedicamentDao implements IMedicamentDao {

	@Override
	public Medicament recuperationMedicament(int id) {
		System.out.println("DAO: récupération du médicament id=" + id);

		if (id == 2) {
			Medicament medicament = new Medicament(2, "Aspirine", 10.0, "Description", "image",
					new Categorie("ANTIINFLAMMATOIRES"));// création d'un objet-mock- MOCK SGBDR
			return medicament;

		}
		return null;
	}

	@Override
	public Medicament creerMedicament(Medicament medicament) {
		System.out.println("DAO: création du médicament " + medicament.toString());
		return medicament;
	}

	@Override
	public Medicament modifierMedicament(Medicament medicament) {
		System.out.println("DAO: modification du médicament " + medicament.toString());
		return medicament;
	}

	@Override
	public void supprimerMedicament(Medicament medicament) {
		System.out.println("DAO: suppression du médicament " + medicament.toString());
	}

	@Override
	public List<Medicament> recuperationListeMedicament() {
		System.out.println("DAO: récupération de tous les médicaments");
		return null;
	}

	public void initialisation() {
		System.out.println("Dao: création du spring");
	}

	public void destruction() {
		System.out.println("Dao: destruction du spring");
	}

}