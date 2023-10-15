run:
	mvn compile
	mvn spring-boot:stop
	mvn spring-boot:start
stop:
	mvn spring-boot:stop