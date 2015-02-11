package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * 
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig 

object SampleWebApplication extends App {
SpringApplication.run(classOf[HelloConfig]);
}
