package com.testpro.data.stuActive.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testpro.common.service.MyBatisServiceSupport;
import com.testpro.data.stuActive.service.spi.IStuActiveService;

/**
 * Service Implementation:StuActive
 * @author lubo
 * @date 2018-7-23
 */
@Service
@Transactional
public class StuActiveServiceImpl extends MyBatisServiceSupport implements IStuActiveService {
	
}
