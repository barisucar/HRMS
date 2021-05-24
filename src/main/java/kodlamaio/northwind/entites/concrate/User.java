package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "Email")
	private String email;
	@Column(name = "Password")
	private String password;

}
