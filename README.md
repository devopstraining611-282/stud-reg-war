# stud-reg-war
A Simple Java based Web App that with a registration page and the result page. It is developed using Spring Boot. It should be built using Maven. It is a simple Web App to demonstrate the use of Maven Build Tool.  It packages a .war artifact.

# For Amazon Linux 2023
- Launch instance using Amazon Linux 2023 AMI
- Install Java 17, Maven and Git
  ```
  sudo yum update -y
  sudo yum install java-17-amazon-corretto-devel -y
  sudo yum install maven -y
  sudo yum install git -y
  ```
- Clone the repo `git clone https://github.com/devopstraining611-282/student-registration-java.git`
- Go to the repo directory `cd student-registration-java`
- Build the project `mvn clean package`
- It will build and create the package jar file named "**student-registration-java-0.0.1-SNAPSHOT.jar**"
- Execute to run the app in the background even when the console is loggedout `nohup java -jar target/student-registration-java-0.0.1-SNAPSHOT.jar &`
- Access in the browser using the url "**http://<EC2_Public_IP_or_DNS>:8080/**"

# For Ubuntu Server 22.04 LTS
- Launch instance using Ubuntu Server 24.04 LTS
- Install Java 17, Maven and Git
  ```
  sudo apt-get update
  sudo apt-get install openjdk-17-jdk -y
  sudo apt-get install maven -y
  sudo apt-get install git -y
  ```
- Clone the repo `git clone https://github.com/devopstraining611-282/student-registration-java.git`
- Go to the repo directory `cd student-registration-java`
- Build the project `mvn clean package`
- It will build and create the package jar file named "**student-registration-java-0.0.1-SNAPSHOT.jar**"
- Execute to run the app in the background even when the console is loggedout `nohup java -jar target/student-registration-java-0.0.1-SNAPSHOT.jar &`
- Access in the browser using the url "**http://<EC2_Public_IP_or_DNS>:8080/**"
