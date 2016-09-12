package com.example.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiParams;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.annotation.ApiQueryParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
@RequestMapping("/students")
@Api(description = "Student Personal Data", name = "Students")
public class Students {
	
	@RequestMapping(value = "/{id}/attributes", params="term", method = RequestMethod.GET)
	@ApiMethod(description = "Gets attributes by term")	
	@ApiParams(queryparams={@ApiQueryParam(name = "term", description="Term Requested", required=true)})
	public Student getAttributesByIdAndTerm(
			@ApiPathParam(name = "id", description = "PIDM")
			@PathVariable String id, 			
			@RequestParam(value = "term") String term) {
		Student student = new Student();
		student.setName("David Dill - "+ term);
		student.setAge(31);
		
		return student;
	}
	
	
	@RequestMapping(value = "/{id}/attributes", params={"term", "stage"}, method = RequestMethod.GET)
	@ApiMethod(description = "Gets attributes by term and stage")
	@ApiParams(queryparams={@ApiQueryParam(name = "term", description="Term Requested", required=true),
							@ApiQueryParam(name = "stage", description="Stage Requested", required=true)})
	public Student getAttributesByIdTermAndStage(
			@ApiPathParam(name = "id", description = "PIDM")
			@PathVariable String id, 			
			@RequestParam(value = "term") String term, 
			@RequestParam(value = "stage") String stage) {
		Student student = new Student();
		student.setName("David Dill - "+ term + " - " + stage);
		student.setAge(31);
		
		return student;
	}

}
