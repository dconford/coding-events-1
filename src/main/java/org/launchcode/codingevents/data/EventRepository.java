package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
//                                                   <Object, DataType of PrimaryKey>
public interface EventRepository extends CrudRepository<Event, Integer> {
}
