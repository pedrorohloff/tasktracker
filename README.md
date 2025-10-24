# tasktracker

The task-tracker project is a REST API built in Spring Boot with PostgreSQL as a mean of showing my knowledge in building Spring Boot Web Apps.

This project comes with a configured docker-compose.yml file where you can run and use the application without needing to stress on how to setup your Docker image!

### Technologies Used

The main language and framework used to build this API is the following:

- Java 21 LTS
- Maven 4.0.0
- Spring Boot 3.5.6

The dependencies used in this API are the following:

- Spring Data JPA
- PostgreSQL Driver
- H2 Database (For tests)
- Spring Web

## How to use?

To use the API you can first, run it by using:

```
    ./mvnw spring-boot:run
```

And then the following endpoints will be available to access and use.

### TaskList Endpoints

1. List All Task Lists
```
    curl 'http://localhost:8080/task-lists'
```

Expected Results: A list of all TaskLists stored in the database.


2. Create Task List
```
    curl -X POST 'http://localhost:8080/task-lists' \
    -H "Content-Type: application/json" \
    -d '{"title": "My anwsome TaskList", "description": "This is the description"}'
```

Expected Results: The TaskList that you just created.

3. Get Specific Task List
```
    curl 'http://localhost:8080/task-lists/{task_list_id}'
```

Expected Results: The TaskList with the ID set in the url.

4. Update a Task List
```
    curl -X PUT 'http://localhost:8080/task-lists/{task_list_id}' \
    -H "Content-Type: application/json" \
    -d '{"title": "Anwsome title", "description": "some description"}'
```

Expected Results: The TaskList just updated.

5. Delete TaskList
```
    curl -X DELETE 'http://localhost:8080/task-lists/{task_list_id}'
```

Expected Results: No Content.

### Task Endpoints

1. List All Tasks
```
    curl 'curl 'http://localhost:8080/task-lists/{task_list_id}/tasks'
```

Expected Results: A list of all Task stored in the database.

2. Create Task
```
    curl -X POST 'http://localhost:8080/task-lists/{task_list_id}/tasks' \
    -H "Content-Type: application/json" \
    -d '{"title": "My anwsome Task", "description": "This is the description", "priority": "HIGH"}'
```

Expected Results: The Task that you just created.

3. Get Specific Task
```
    curl 'http://localhost:8080/task-lists/{task_list_id}/tasks/{task_id}'
```

Expected Results: The Task with the ID set in the url.

4. Update a Task
```
    curl -X PUT 'http://localhost:8080/task-lists/{task_list_id}/tasks/{task_id}' \
    -H "Content-Type: application/json" \
    -d '{"title": "Anwsome title", "description": "some description", "priority": "HIGH", "status": "OPEN"}'
```

Expected Results: The Task just updated.

5. Delete Task
```
    curl -X DELETE 'http://localhost:8080/task-lists/{task_list_id}/tasks/{task_id}'
```

Expected Results: No Content.


