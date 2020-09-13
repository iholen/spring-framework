import me.heoller.config.StartConfig;
import me.heoller.service.AnimalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huliang
 * @date 2020/9/13 17:28
 */
public class ApplicationStartCode {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				StartConfig.class);

		AnimalService bean = applicationContext.getBean(AnimalService.class);
		bean.sayHi();
	}

}
