package com.kramrs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kramrs.entity.Task;
import com.kramrs.model.vo.query.TaskQuery;
import com.kramrs.model.vo.response.TaskBackResp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kramrs
 * @Description: 定时任务 Mapper
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

    /**
     * 查询定时任务数量
     *
     * @param taskQuery 任务查询条件
     * @return 数量
     */
    Long selectTaskCount(@Param("param") TaskQuery taskQuery);

    /**
     * 查询定时任务列表
     *
     * @param taskQuery 任务查询条件
     * @return 定时任务列表
     */
    List<TaskBackResp> selectTaskList(@Param("param") TaskQuery taskQuery);
}
