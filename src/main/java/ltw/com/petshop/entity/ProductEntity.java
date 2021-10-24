package ltw.com.petshop.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
public class ProductEntity {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", unique = true)
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "description")
	private String Desc;
	
	@Column(name = "specificAttribute")
	private String specificAttribute;
	
	@ManyToMany(mappedBy = "productEntities")
	private Set<CategoryEntity> categoryEntities;
	
	
}
