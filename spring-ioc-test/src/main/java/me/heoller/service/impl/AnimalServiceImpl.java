package me.heoller.service.impl;

import org.springframework.stereotype.Service;
import me.heoller.service.AnimalService;

/**
 * @author huliang
 * @date 2020/9/13 16:52
 */
@Service
public class AnimalServiceImpl implements AnimalService {

	@Override
	public void sayHi() {
		System.out.println("Hello Spring");
	}

}
