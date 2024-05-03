package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 统计商品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
@TableName("tongjishangpin")
public class TongjishangpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongjishangpinEntity() {
		
	}
	
	public TongjishangpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 统计编号
	 */
					
	private String tongjibianhao;
	
	/**
	 * 统计名称
	 */
					
	private String tongjimingcheng;
	
	/**
	 * 订单数
	 */
					
	private Integer dingdanshu;
	
	/**
	 * 统计时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：统计编号
	 */
	public void setTongjibianhao(String tongjibianhao) {
		this.tongjibianhao = tongjibianhao;
	}
	/**
	 * 获取：统计编号
	 */
	public String getTongjibianhao() {
		return tongjibianhao;
	}
	/**
	 * 设置：统计名称
	 */
	public void setTongjimingcheng(String tongjimingcheng) {
		this.tongjimingcheng = tongjimingcheng;
	}
	/**
	 * 获取：统计名称
	 */
	public String getTongjimingcheng() {
		return tongjimingcheng;
	}
	/**
	 * 设置：订单数
	 */
	public void setDingdanshu(Integer dingdanshu) {
		this.dingdanshu = dingdanshu;
	}
	/**
	 * 获取：订单数
	 */
	public Integer getDingdanshu() {
		return dingdanshu;
	}
	/**
	 * 设置：统计时间
	 */
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
