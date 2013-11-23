package net.empego.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_SITEMAPENTRY")
public class SiteMapEntryDO {

	private SiteMapEntryDO() {
		super();
	}

	private SiteMapEntryDO(final String label, final SiteMapEntryDO parent) {
		super();
		this.label = label;
		this.parent = parent;
	}

	@Id
	@GeneratedValue
	private int pk;

	private String label;

	@ManyToOne()
	private SiteMapEntryDO parent;

	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private List<SiteMapEntryDO> children = new ArrayList<SiteMapEntryDO>();

	public int getPk() {
		return pk;
	}

	public void setPk(final int pk) {
		this.pk = pk;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public SiteMapEntryDO getParent() {
		return parent;
	}

	public void setParent(final SiteMapEntryDO parent) {
		this.parent = parent;
	}

	public List<SiteMapEntryDO> getChildren() {
		return children;
	}

	public void setChildren(final List<SiteMapEntryDO> children) {
		this.children = children;
	}

}
