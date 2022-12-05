package com.example.peaksoftlms_boot.repository;

import com.example.peaksoftlms_boot.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {



}
