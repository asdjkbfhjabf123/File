package com.geekzila.file.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.file.model.File;
import com.geekzila.file.service.FileService;

public class FileServiceImpl implements FileService {

	public List<File> files = new ArrayList<File>();

	public FileServiceImpl() {
		files.add(new File(.28, "Rakesh"));
		files.add(new File(.58, "Aruv"));

	}

	public void add(File file) {
		// TODO Auto-generated method stub
		files.add(file);
	}

	public List<File> findAll() {
		// TODO Auto-generated method stub
		return files;
	}

}
