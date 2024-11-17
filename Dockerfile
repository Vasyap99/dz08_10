#EXPOSE 8080

#FROM docker.io/tomcat:9.0.68-jdk17
FROM phenompeople/openjdk17:latest


COPY apache-tomcat-8.5.96 /opt/tomcat

COPY target/dz08_10-1.0-SNAPSHOT.war /opt/tomcat/webapps

RUN addgroup s && adduser tomcat
RUN usermod -G s tomcat
#RUN chown -R tomcat /usr/local/tomcat/bin

RUN chmod -R a+rwx /opt/tomcat

#USER tomcat



#FROM ky64/postgre:0.5
#RUN apt-get install postgres


EXPOSE 80
EXPOSE 8100

WORKDIR /opt/tomcat/bin




CMD ["/opt/tomcat/bin/catalina.sh", "run"]
#CMD ["/opt/tomcat/bin/startup.sh", "run"]