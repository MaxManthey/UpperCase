package de.hfu.residents.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hfu.residents.domain.Resident;

public class ResidentRepositoryStub implements ResidentRepository {

	@Override
	public List<Resident> getResidents() {
		Date date = new Date();
		date.setTime(1000);
		Resident max = new Resident("Max", "Manthey", "SwagStreet", "Yolo City", date);
		Resident max2 = new Resident("Max2", "Manthey2", "SwagStreet2", "Yolo City2", date);
		List<Resident> listA = new ArrayList<Resident>();

		listA.add(max);
		listA.add(max2);
		// TODO Auto-generated method stub
		return listA;
	}
}
