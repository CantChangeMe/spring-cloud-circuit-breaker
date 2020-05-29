# spring-cloud-circuit-breaker
Created this repo to learn how to implement Hystrix circuit breaker in spring boot.

## circuit-breaker-bookstore
1. This microservice gives the list of recommended reading books.
2. Uses only Spring web as dependency to start with.

## circuit-breaker-reading
1. This microservice uses @HystrixCommand at method level to add circuit breaker functionality.If this 
   method call fails then, fallbackmethod is called,so that at at minimum default recommended reading list can shown
   from this  microservice only.
2. Use two dependecies i.e Spring web and Hystrix

