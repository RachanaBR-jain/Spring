# Spring
tags used
1)@ApplicationContext -is where Spring holds instances of objects that it has identified to be managed and distributed automatically. These are called beans
Bean management and dependency injection are some of Spring's main features
Using the Inversion of Control principle, Spring collects bean instances from our application and uses them at the appropriate time. 
2)@Component -Spring can use the class to create object- annotation that allows Spring to automatically detect our custom beans.
--@Controller, @Service and @Repository. They all provide the same function as @Component.
3)@ComponentScan("usingMaven.dependencyInjection")
@ComponentScan annotation to ( differentiating beans from other objects, such as domain objects) gather them all into its ApplicationContext.
it will scan every @Component we define by default.


