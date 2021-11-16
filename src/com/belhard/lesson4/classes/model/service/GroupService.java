package com.belhard.lesson4.classes.model.service;

import com.belhard.lesson4.classes.model.beans.groups.Group;

public interface GroupService {
    Group getGroupByStudentId(long studentId);
}
