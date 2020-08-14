package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@RegisterRestClient(configKey="sample")
public interface SampleService {
    @GET
    @Path("/f55b5437-2360-4ccd-aee3-e6655dec87ce")
    @Produces(MediaType.APPLICATION_JSON)
    SampleResponse getResponse();
}

