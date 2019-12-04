FROM tomcat:8.5-alpine
LABEL maintainer="multithreadke@gmail.com"
RUN mkdir /app
RUN mkdir /app/logs
RUN echo "Africa/Nairobi" > /etc/timezone
WORKDIR /app
VOLUME /app/logs
ARG USER_FILE=/usr/local/tomcat/conf/tomcat-users.xml
ARG ACCESS_FILE=/usr/local/tomcat/webapps/manager/META-INF/context.xml
RUN rm -f ${USER_FILE}
RUN rm -f ${ACCESS_FILE}
ARG USER_FILE=tomcat-users.xml
ARG ACCESS_FILE=context.xml
ADD ${USER_FILE} /usr/local/tomcat/conf/tomcat-users.xml
ADD ${ACCESS_FILE} /usr/local/tomcat/webapps/manager/META-INF/context.xml
#ARG JAR_FILE=target/devop-client-1.0.0.war
ARG JAR_FILE=devop-client-1.0.0.war
ADD ${JAR_FILE} /usr/local/tomcat/webapps/dev.war
EXPOSE 8080
CMD ["catalina.sh", "run"]