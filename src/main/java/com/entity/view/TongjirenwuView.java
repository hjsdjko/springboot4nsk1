package com.entity.view;

import com.entity.TongjirenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 统计任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
@TableName("tongjirenwu")
public class TongjirenwuView  extends TongjirenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongjirenwuView(){
	}
 
 	public TongjirenwuView(TongjirenwuEntity tongjirenwuEntity){
 	try {
			BeanUtils.copyProperties(this, tongjirenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
