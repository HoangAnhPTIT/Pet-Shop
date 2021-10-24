package ltw.com.petshop.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "voucher")
public class Voucher {
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
}
