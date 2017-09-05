package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	//預設沒有這個Function, 所以要自行加入 
	public List<Course> findByTopicId(String topicId);

}
