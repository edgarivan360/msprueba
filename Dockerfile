FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/msprueba.sh"]

COPY msprueba.sh /usr/bin/msprueba.sh
COPY target/msprueba.jar /usr/share/msprueba/msprueba.jar
