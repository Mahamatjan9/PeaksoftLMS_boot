package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Group;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface GroupService {

    List<Group> getAllListGroup();

    List<Group> getAllGroup(Long courseId);

    void addGroup(Group group, Long courseId);

    Group getGroupById(Long id);

    void updateGroup(Group group, Long id);

    void deleteGroup(Long id);

    void assignGroup(Long courseId, Long groupId) throws IOException;
}
