package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository means that spring will create a new instance of PirateRepository for us
@Repository   // this asks spring to create ONE instance of this for us to re-use
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
