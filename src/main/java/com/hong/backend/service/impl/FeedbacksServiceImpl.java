package com.hong.backend.service.impl;

import com.hong.backend.domain.pojo.Feedbacks;
import com.hong.backend.Mapper.FeedbacksMapper;
import com.hong.backend.service.IFeedbacksService;
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
public class FeedbacksServiceImpl extends ServiceImpl<FeedbacksMapper, Feedbacks> implements IFeedbacksService {

}
