package com.web.demo.service;

import java.util.List;
import java.util.Optional;

import com.web.demo.entity.Category;
import com.web.demo.entity.Games;

public interface AdminGameService {
	List<Games> findAll();

	<S extends Games> Games save(S entity);

	Games getById(Integer id);

	void deleteById(Integer id);

	Optional<Games> findById(Integer id);

	List<Games> findAllTop();

	List<Games> findBycategories(Category cate);
}
