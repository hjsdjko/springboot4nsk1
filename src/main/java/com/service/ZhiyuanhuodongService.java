package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanhuodongView;


/**
 * 志愿活动
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface ZhiyuanhuodongService extends IService<ZhiyuanhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanhuodongVO> selectListVO(Wrapper<ZhiyuanhuodongEntity> wrapper);
   	
   	ZhiyuanhuodongVO selectVO(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
   	
   	List<ZhiyuanhuodongView> selectListView(Wrapper<ZhiyuanhuodongEntity> wrapper);
   	
   	ZhiyuanhuodongView selectView(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanhuodongEntity> wrapper);
   	

}

