package com.geekerstar.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geekerstar.quickstart.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author geekerstar
 * date: 2019/12/10 21:34
 * description:
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
