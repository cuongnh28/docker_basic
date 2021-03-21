Start Application

1. Create artifact
mvn -DskipTests package

2. Build docker compose file
docker-compose build

3. Run docker compose to make app and db live
docker-compose up
