package com.testpro.bizOrgIdMapping.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testpro.common.service.MyBatisServiceSupport;
import com.testpro.bizOrgIdMapping.service.spi.IBizOrgIdMappingService;

/**
 * Service Implementation:BizOrgIdMapping
 * @author lubo
 * @date 2018-7-23
 */
@Service
@Transactional
public class BizOrgIdMappingServiceImpl extends MyBatisServiceSupport implements IBizOrgIdMappingService {
	
}
