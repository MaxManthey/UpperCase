package de.hfu.residents.service;

import static org.easymock.EasyMock.*;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;

public class BaseResidentServiceTestMock {

	@Test
	public void test() {
		Date date = new Date(2019, 12, 3);
		Resident max = new Resident("Max", "Manthey", "SwagStreet", "Yolo City", date);
		Resident peter = new Resident("peter", "peter", "peterStreet", "Yolo peter", date);
		
		ArrayList<Resident> bewohner = new ArrayList<Resident>();
		bewohner.add(max);
		bewohner.add(peter);
		
		Resident searchResident1 = new Resident("name1","","","",date);
		Resident searchResident2 = new Resident("name2","","","",date);
		Resident searchResident3 = new Resident("","","straße1","",date);
		
		ResidentRepository test = createMock(ResidentRepository.class);
		
		expect(test.getResidents()).andReturn(bewohner);
		
		replay(test);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(test);
		service.getFilteredResidentsList(searchResident1);
		
		verify(test);
	}

}
