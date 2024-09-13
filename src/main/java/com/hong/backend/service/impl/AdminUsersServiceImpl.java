package com.hong.backend.service.impl;

import com.hong.backend.domain.pojo.AdminUsers;
import com.hong.backend.Mapper.AdminUsersMapper;
import com.hong.backend.service.IAdminUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HQ
 * @since 2024-09-13
 */
@Service
public class AdminUsersServiceImpl extends ServiceImpl<AdminUsersMapper, AdminUsers> implements IAdminUsersService {

}
