package com.example.Springcrud.contain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public interface ContaintsRepositery extends JpaRepository<Containts, UUID> {
    List<Containts> findByContact(String contact);

}
