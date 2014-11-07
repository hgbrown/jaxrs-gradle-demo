package ejb;

import domain.Person;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author <a href="mailto:henry.g.brown@gmail.com">henryb</a>
 * @version 0.1201411071251
 * @since 0.1201411071251
 */
@Stateless
public class PartyManagementBean {

    public List<Person> list() {
        return Arrays.asList(new Person("Henry", "Brown"), new Person("James", "Brown"));
    }

}
