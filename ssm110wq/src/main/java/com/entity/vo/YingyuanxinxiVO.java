package com.entity.vo;

import com.entity.YingyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 影院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
public class YingyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 影院规模
	 */
	
	private String yingyuanguimo;
		
	/**
	 * 影院图片
	 */
	
	private String yingyuantupian;
		
	/**
	 * 影厅数量
	 */
	
	private Integer yingtingshuliang;
		
	/**
	 * 影院介绍
	 */
	
	private String yingyuanjieshao;
		
	/**
	 * 影院地址
	 */
	
	private String yingyuandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：影院规模
	 */
	 
	public void setYingyuanguimo(String yingyuanguimo) {
		this.yingyuanguimo = yingyuanguimo;
	}
	
	/**
	 * 获取：影院规模
	 */
	public String getYingyuanguimo() {
		return yingyuanguimo;
	}
				
	
	/**
	 * 设置：影院图片
	 */
	 
	public void setYingyuantupian(String yingyuantupian) {
		this.yingyuantupian = yingyuantupian;
	}
	
	/**
	 * 获取：影院图片
	 */
	public String getYingyuantupian() {
		return yingyuantupian;
	}
				
	
	/**
	 * 设置：影厅数量
	 */
	 
	public void setYingtingshuliang(Integer yingtingshuliang) {
		this.yingtingshuliang = yingtingshuliang;
	}
	
	/**
	 * 获取：影厅数量
	 */
	public Integer getYingtingshuliang() {
		return yingtingshuliang;
	}
				
	
	/**
	 * 设置：影院介绍
	 */
	 
	public void setYingyuanjieshao(String yingyuanjieshao) {
		this.yingyuanjieshao = yingyuanjieshao;
	}
	
	/**
	 * 获取：影院介绍
	 */
	public String getYingyuanjieshao() {
		return yingyuanjieshao;
	}
				
	
	/**
	 * 设置：影院地址
	 */
	 
	public void setYingyuandizhi(String yingyuandizhi) {
		this.yingyuandizhi = yingyuandizhi;
	}
	
	/**
	 * 获取：影院地址
	 */
	public String getYingyuandizhi() {
		return yingyuandizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
