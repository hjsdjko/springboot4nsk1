package com.entity.view;

import com.entity.TongjishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 统计商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
@TableName("tongjishangpin")
public class TongjishangpinView  extends TongjishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongjishangpinView(){
	}
 
 	public TongjishangpinView(TongjishangpinEntity tongjishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, tongjishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
