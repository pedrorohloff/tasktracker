package com.devaztari.tasks.mappers;

import com.devaztari.tasks.domain.dto.TaskListDto;
import com.devaztari.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
