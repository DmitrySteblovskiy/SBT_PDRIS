FROM openjdk:19-alpine
ADD out/artifacts/Task1Application_jar/Task1Application.jar pdristask1_setter.jar
EXPOSE 8080 27017
ENTRYPOINT ["java", "-jar", "/pdristask1_setter.jar"]