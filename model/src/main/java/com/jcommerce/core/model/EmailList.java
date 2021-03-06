/**
 * @author KingZhao
 *         Kylin Soong
 */
package com.jcommerce.core.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email_list")
public class EmailList extends ModelObject {
	
	private Long id;
	
	@Id 
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private static final long serialVersionUID = -8421244750064039951L;
	private String email;
	private boolean confirm;//订阅者是否已确认
	private String hash;

	@Basic( optional = true )
	@Column( length = 60  )
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	@Basic( optional = true )
	@Column( length = 10  )
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
