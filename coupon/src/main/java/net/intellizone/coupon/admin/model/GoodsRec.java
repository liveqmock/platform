package net.intellizone.coupon.admin.model;

import org.nutz.dao.entity.annotation.Column;

public class GoodsRec {
	@Column("h.id")
	private int id;
	@Column("h.description")
	private String description;
	@Column("h.link")
	private String link;
	@Column("h.imgurl")
	private String imgurl;
	@Column("h.type")
	private int type;
	@Column("h.top")
	private int top; // 置顶
	@Column("h.orderHome")
	private int orderHome;// 排序
	@Column("h.home_cityId")
	private int home_cityId;
	@Column("h.content_type")
	private String contentType;
	@Column("h.ref_id")
	private long refId;

	@Column("s.id")
	private long goodsId;
	@Column("s.name")
	private String goodsName;
	@Column("s.CAT_TYPE")
	//所属分类（1优惠券，2商品等分类）
	private int goodsType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getOrderHome() {
		return orderHome;
	}

	public void setOrderHome(int orderHome) {
		this.orderHome = orderHome;
	}

	public int getHome_cityId() {
		return home_cityId;
	}

	public void setHome_cityId(int home_cityId) {
		this.home_cityId = home_cityId;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getRefId() {
		return refId;
	}

	public void setRefId(long refId) {
		this.refId = refId;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}

}
