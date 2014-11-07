package service;

import domain.Person;
import ejb.PartyManagementBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author <a href="mailto:henry.g.brown@gmail.com">henryb</a>
 * @version 0.1201411071252
 * @since 0.1201411071252
 */
@Path("/party")
public class PartyManagementResource {

    @Inject
    PartyManagementBean partyManagement;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> index() {
        return list();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public List<Person> list() {
        return partyManagement.list();
    }

}
