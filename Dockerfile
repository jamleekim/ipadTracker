FROM openjdk:11-jdk
ARG DEBIAN_FRONTEND=noninteractive
ENV TZ=Asia/Seoul
WORKDIR /root
COPY /target/ipadTracker-1.0.jar .
CMD ["java", "-jar" , "ipadTracker-1.0.jar"]
# RUN java -jar ipadTracker-1.0.jar