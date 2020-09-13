package me.heoller.config;

import me.heoller.service.AnimalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huliang
 * @date 2020/9/13 16:58
 */
@ComponentScan("me.heoller")
@Configuration
public class BeanConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfig.class);

		AnimalService bean = applicationContext.getBean(AnimalService.class);
		bean.sayHi();
	}

}
