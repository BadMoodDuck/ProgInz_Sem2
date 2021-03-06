package lv.venta.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Grade {
	
	@Setter(value=AccessLevel.NONE)
	@Column(name="IdGr")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGr;
	
	@Column(name = "GradeValue")
	private int gradeValue;
	
	
	@ManyToOne
	@JoinColumn(name ="IdSt")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "IdSubj")
	private Subject subject;

	public Grade(int gradeValue, Student student, Subject subject) {
		this.gradeValue = gradeValue;
		this.student = student;
		this.subject = subject;
	}

	
	
}
