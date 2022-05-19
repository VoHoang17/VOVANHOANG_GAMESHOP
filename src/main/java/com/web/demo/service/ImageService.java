package com.web.demo.service;
import java.util.Optional;


import org.springframework.web.multipart.MultipartFile;

import com.web.demo.entity.ImageData;

public interface ImageService {
	public void store(MultipartFile file);

	<S extends ImageData> S save(S entity);

	void deleteById(Integer id);

	ImageData getById(Integer id);

	Optional<ImageData> findById(Integer id);
}
