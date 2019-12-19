package com.geekerstar.generator.test.service.impl;

import com.geekerstar.generator.test.entity.User;
import com.geekerstar.generator.test.mapper.UserMapper;
import com.geekerstar.generator.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Geekerstar
 * @since 2019-12-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
