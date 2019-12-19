package de.hfu.residents.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepositoryStub;

public class BaseResidentServiceTest {
	private Resident max;
	private Resident peter;
	private BaseResidentService brs;
	private ResidentRepositoryStub rrs;
	
	@Before
	public void maxInit() {
		Date date = new Date();
		date.setTime(1000);		
		max = new Resident("Max", "Manthey", "SwagStreet", "Yolo City", date);
		peter = new Resident("peter", "peter", "peterStreet", "Yolo peter", date);
		
		rrs = new ResidentRepositoryStub();
		brs = new BaseResidentService();
		brs.setResidentRepository(rrs);
	}
	
	@Test
	public void testFilteredListEins() {
		assertNotNull(brs.getFilteredResidentsList(max));
	}
	
	@Test
	public void testFilteredListZwei() {
		assertNotNull(brs.getFilteredResidentsList(peter));
	}
	
	@Test
	public void testFilteredListDrei() {
		assertNotEquals(brs.getFilteredResidentsList(peter), brs.getFilteredResidentsList(max));
	}
	
	@Test
	public void testUniqueResidentEins() throws ResidentServiceException {
		assertNotNull(brs.getUniqueResident(max));
	}

	@Test
	public void testUniqueResidentZwei() {
		assertNotNull(brs.getFilteredResidentsList(peter));
	}
	
	@Test
	public void testUniqueResidentDrei() {
		assertNotEquals(brs.getFilteredResidentsList(peter), brs.getFilteredResidentsList(max));
	}
}
