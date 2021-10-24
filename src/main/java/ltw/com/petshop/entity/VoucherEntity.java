package ltw.com.petshop.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "voucher")
public class VoucherEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "effectiveDate")
    private Timestamp effectiveDate;

    @Column(name = "expriredDate")
    private Timestamp expriredDate;

    @Column(name = "valuePercent")
    private float valuePercent;

    @Column(name = "maxValue")
    private float maxValue;

    @Column(name = "quantity")
    private int quantity;
    
    @OneToMany(mappedBy = "voucherEntity")
    private Set<UserVoucher> userVouchers;

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

	public Timestamp getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Timestamp getExpriredDate() {
		return expriredDate;
	}

	public void setExpriredDate(Timestamp expriredDate) {
		this.expriredDate = expriredDate;
	}

	public float getValuePercent() {
		return valuePercent;
	}

	public void setValuePercent(float valuePercent) {
		this.valuePercent = valuePercent;
	}

	public float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(float maxValue) {
		this.maxValue = maxValue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Set<UserVoucher> getUserVouchers() {
		return userVouchers;
	}

	public void setUserVouchers(Set<UserVoucher> userVouchers) {
		this.userVouchers = userVouchers;
	}
    
    
    
}
