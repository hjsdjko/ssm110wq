package com.entity.view;

import com.entity.DiscussyingyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影院信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
@TableName("discussyingyuanxinxi")
public class DiscussyingyuanxinxiView  extends DiscussyingyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyingyuanxinxiView(){
	}
 
 	public DiscussyingyuanxinxiView(DiscussyingyuanxinxiEntity discussyingyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyingyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
