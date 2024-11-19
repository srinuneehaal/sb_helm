# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
Statements

https://www.youtube.com/watch?app=desktop&v=M6ZavWvKlcc

docker build -t spring-docker .
docker run -p 8080:8080 spring-docker
helm create ytkubechart

minikube start --driver=docker

kubectl get nodes
kubectl get services

minikube docker-env
@FOR /f "tokens=*" %i IN ('minikube -p minikube docker-env --shell cmd') DO @%i
docker build -t spring-docker .
minikube image ls
helm install mychart ytkubechart
kubectl get pods
kubectl get services
minikube ip
minikube service mychart-ytkubechart --url
kubectl get pods -o wide


upgrade helm: change values and version in Chart.yaml
helm upgrade mychart ytkubechart
kubectl get pods -o wide
minikube service mychart-ytkubechart --url






