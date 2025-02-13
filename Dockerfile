FROM openjdk
WORKDIR /app
COPY . /app
RUN javac Caesar.java
CMD ["java","Caesar"]