package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cities")
@CrossOrigin
public class City {

	@Id
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="city_name")
	private String cityName;
}
