package lv.venta.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Student;

public interface iStudentRepo extends CrudRepository<Student, Integer>{

}
