package com.example.tp_springboot.repositories;

import com.example.tp_springboot.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
