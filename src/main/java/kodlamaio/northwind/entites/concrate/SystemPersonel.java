package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "system_personnel")
public class SystemPersonel extends User {

	
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="department_id")
	private int departmentId;

}
