FROM openjdk:12-alpine
COPY . /app
WORKDIR /app
CMD java factorial
