FROM tomcat:9.0-jdk17-temurin

COPY . /app
WORKDIR /app
RUN  ./gradlew package -DskipTests

RUN cp  /app/target/*.war /usr/local/tomcat/webapp/ROOT.war
CMD ["catlina.sh", "run"]