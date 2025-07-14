How to run
Clone this repo:

git clone https://github.com/Yeshwanthh98/FreightFoxAssignment-1.git
Open it in your IDE (STS, IntelliJ, etc).

Configure application.properties with your PostgreSQL details.

Run using:

mvn spring-boot:run
or run the AlumniApplication class directly.

It starts on http://localhost:8081.

API endpoints:

 -> Add alumni 
POST http://localhost:8081/api/alumni/search

JSON body:

{
  "name": "John Doe",
  "university": "MIT",
  "passoutYear": 2020,
  "location": "New York",
  "linkedinHeadline": "Engineer at Google",
  "currentRole": "Backend Developer"
}
Update alumni


PUT http://localhost:8081/api/alumni/update

JSON body:
{
  "id": 1,
  "name": "John Doe",
  "university": "MIT",
  "passoutYear": 2020,
  "location": "San Francisco",
  "linkedinHeadline": "Senior Engineer",
  "currentRole": "Team Lead"
}
Get all alumni

GET http://localhost:8081/api/alumni/all
