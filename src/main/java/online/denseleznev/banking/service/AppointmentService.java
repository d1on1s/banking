package online.denseleznev.banking.service;

import online.denseleznev.banking.domain.Appointment;

import java.util.List;

public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
