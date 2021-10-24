package ltw.com.petshop.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@Column(name = "desc")
	private String Desc;
	
	@Column(name = "specificAttribute")
	private String specificAttribute;
	
	@OneToMany(mappedBy = "productEntity")
	private Set<CategoryProduct> categoryProducts;
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductEntity(String id, String name, float price, String desc, String specificAttribute) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		Desc = desc;
		this.specificAttribute = specificAttribute;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public String getSpecificAttribute() {
		return specificAttribute;
	}

	public void setSpecificAttribute(String specificAttribute) {
		this.specificAttribute = specificAttribute;
	}
	
	
}
