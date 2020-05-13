package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired /// we know there's a PirateRepository - so plz grab it and give me it
	private PirateRepository pirateRepository;

	@Autowired
	private ShipRepository shipRepository;

	@Autowired
	private RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void canCreateAndSavePirateThatHasAShip(){

		Raid raid = new Raid("Tortuga", 100);
		raidRepository.save(raid);

		Ship ship = new Ship("Cutty Sark");
		shipRepository.save(ship);

		Pirate pirate = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate);

		pirate.addRaid(raid);
		pirateRepository.save(pirate); // actually an UPDATE because our pirate alreay has and ID
	}

}
