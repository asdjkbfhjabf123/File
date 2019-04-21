package com.geekzila.file.service;

import java.util.List;

import com.geekzila.file.model.File;

public interface FileService {

	public void add(File file);

	public List<File> findAll();

}
