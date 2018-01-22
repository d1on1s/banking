package online.denseleznev.banking.dao;

import java.util.List;

import online.denseleznev.banking.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
