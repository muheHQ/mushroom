package com.hong.backend.service.impl;

import com.hong.backend.domain.pojo.Reservations;
import com.hong.backend.Mapper.ReservationsMapper;
import com.hong.backend.service.IReservationsService;
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
public class ReservationsServiceImpl extends ServiceImpl<ReservationsMapper, Reservations> implements IReservationsService {

}
