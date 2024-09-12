package com.entity.view;

import com.entity.XuankexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 选课信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
@TableName("xuankexinxi")
public class XuankexinxiView  extends XuankexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuankexinxiView(){
	}
 
 	public XuankexinxiView(XuankexinxiEntity xuankexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuankexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
