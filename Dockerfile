FROM openjdk:19-alpine
ADD out/artifacts/Task1App_jar/Task1App.jar pdristask1_setter.jar
EXPOSE 8080 27017
ENTRYPOINT ["java", "-jar", "/pdristask1_setter.jar"]