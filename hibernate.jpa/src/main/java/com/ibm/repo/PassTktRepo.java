package com.ibm.repo;


import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

public class PassTktRepo {
	private static PassTktRepo repo;
	
	@BeforeAll
	public static void init()
	{
		repo = new PassTktRepo();
	}		

	@Test
	public void testSaveTicket() {
		Ticket tck = new Ticket();
		tck.setAmount(5000);
		tck.setPnr(1114);
		tck.setTravelDate(null);
		repo.saveTicket(tkt);
		
	}

	@Test
	public void testSavePassanger() {
		Passenger pass = new Passenger();
		pass.setAge(28);
		pass.setId(2);
		pass.setName("Manasa");
		repo.savePass(pass, 1111);
	}
	

}
