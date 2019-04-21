package com.geekzila.file;

import java.util.List;

import com.geekzila.file.model.File;
import com.geekzila.file.service.FileService;
import com.geekzila.file.service.impl.FileServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FileService fileService = new FileServiceImpl();
		List<File> files = fileService.findAll();

		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println(file.getSize() + "kb is the size of " + file.getName() + " file");
		}
	}
}
