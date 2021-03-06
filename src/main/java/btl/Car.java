package btl;


import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
@EnableAutoConfiguration
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String brandname;
	private String platenumber;
	private String color;
	private String model;
	private int seatnumber;
	private int usedyear;
	private String lastmaintaincedate;
}
