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
@Table(name = "navigation")
public class Navigation extends ModelObject {
	
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

	private static final long serialVersionUID = -3694253855775909964L;
	public static final int CATEGORYTYPE_GOODSCATEGORY=1;//货物分类导航
	public static final int CATEGORYTYPE_ARTICLECATEGORY=2;//文章分类导航
	
	public static final int TYPE_TOP=1;//上部
	public static final int TYPE_MIDDLE=2;//中部
	public static final int TYPE_BOTTOM=3;//下部

	private int categoryType;//导航類別
	private int categoryId;//所在類別下ID
	private String name;
	private boolean isShow;//是否显示导航
	private int viewOrder;
	private boolean openNew;//是否在新窗口查看
	private String url;
	private int type;//位置類型

	@Basic( optional = true )
	@Column( name = "ctype")
	public int getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}

	@Basic( optional = true )
	@Column( name = "cid", length = 10  )
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@Basic( optional = true )
	@Column( length = 255  )
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic( optional = true )
	@Column( name = "vieworder")
	public int getViewOrder() {
		return viewOrder;
	}

	public void setViewOrder(int viewOrder) {
		this.viewOrder = viewOrder;
	}

	@Basic( optional = true )
	@Column( name = "is_show")
	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public boolean isOpenNew() {
		return openNew;
	}

	public void setOpenNew(boolean openNew) {
		this.openNew = openNew;
	}

	@Basic( optional = true )
	@Column( length = 255  )
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
