Start Application
Create artifact
mvn -DskipTests package

Build docker compose file
docker-compose build

Run docker compose to make app and db live
docker-compose up
