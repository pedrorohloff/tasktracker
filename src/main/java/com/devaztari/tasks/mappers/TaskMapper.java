package com.devaztari.tasks.mappers;

import com.devaztari.tasks.domain.dto.TaskDto;
import com.devaztari.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
