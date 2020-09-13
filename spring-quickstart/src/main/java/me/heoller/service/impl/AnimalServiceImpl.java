package me.heoller.service.impl;

import me.heoller.service.AnimalService;
import org.springframework.stereotype.Service;

/**
 * @author huliang
 * @date 2020/9/13 17:27
 */
@Service
public class AnimalServiceImpl implements AnimalService {

	@Override
	public void sayHi() {
		System.out.println("Hello Spring");
	}

}
