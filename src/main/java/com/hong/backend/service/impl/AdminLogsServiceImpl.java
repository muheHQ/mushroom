package com.hong.backend.service.impl;

import com.hong.backend.domain.pojo.AdminLogs;
import com.hong.backend.Mapper.AdminLogsMapper;
import com.hong.backend.service.IAdminLogsService;
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
public class AdminLogsServiceImpl extends ServiceImpl<AdminLogsMapper, AdminLogs> implements IAdminLogsService {

}
