ToDoList:-
The Todo List Application, developed with Spring Boot, extends its functionality to include user registration and login features. Users can now securely register, log in, and manage their todos. An admin panel provides a comprehensive overview of all users and their associated tasks, enhancing collaboration and organizational capabilities.

--------------------------------------------------------------------
API Flow:
---------------------------------------------------------------------
User Registration:

Endpoint: POST /api/register
Request: User submits registration details (firstname ,lastname, email, password).
Action: The application securely registers the user, storing credentials.
Response: Returns a success message or an error if registration fails.

---------------------------------------------------------------------
User Login:

Endpoint: POST /api/login
Request: User provides login credentials (email, password).
Action: Validates credentials, generates a secure token for the user session.
Response: Returns an authentication token or an error for invalid credentials.


---------------------------------------------------------------------
Create Todo:

Endpoint: POST /api/todos
Request: Authenticated user submits task details.
Action: The application creates a new todo associated with the authenticated user.
Response: Returns the created todo.


---------------------------------------------------------------------
Read Todo:

Endpoint: GET /api/todos
Request: Authenticated user requests their todo list.
Action: Retrieves and returns the user's todos.


---------------------------------------------------------------------
Update Todo:

Endpoint: PUT /api/todos/{todoId}
Request: Authenticated user updates task details.
Action: Modifies the specified todo if it belongs to the authenticated user.


---------------------------------------------------------------------
Delete Todo:

Endpoint: DELETE /api/todos/{todoId}
Request: Authenticated user requests to delete a todo.
Action: Removes the specified todo if it belongs to the authenticated user.


---------------------------------------------------------------------
Admin Panel - View All Users and Todos:

Endpoint: GET /api/admin/all-users-and-todos
Request: Admin, authenticated with admin credentials, requests an overview of all users and their todos.
Action: Retrieves and returns a list of all users and their associated todos.
Authentication: Ensures only admin users can access this endpoint.


