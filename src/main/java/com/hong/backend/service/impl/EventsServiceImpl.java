package com.hong.backend.service.impl;

import com.hong.backend.domain.pojo.Events;
import com.hong.backend.Mapper.EventsMapper;
import com.hong.backend.service.IEventsService;
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
public class EventsServiceImpl extends ServiceImpl<EventsMapper, Events> implements IEventsService {

}
