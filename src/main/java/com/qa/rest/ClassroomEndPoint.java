package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ClassroomService;

@Path("/classroom")
public class ClassroomEndPoint {

	@Inject
	private ClassroomService service;

	@Path("/reviewAllTrainees")
	@GET
	@Produces({ "application/json" })
	public String reviewAllTrainees() {
		return service.reviewAllTrainees();
	}

	@Path("/getTrainee")
	@GET
	@Produces({ "appliation/json" })
	public String getTrainee(@PathParam("id") int id) {
		return service.getTrainee(id);

	}
}
