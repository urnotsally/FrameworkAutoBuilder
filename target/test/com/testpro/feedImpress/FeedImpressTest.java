package com.testpro.feedImpress;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.testpro.common.exception.BaseException;
import com.testpro.feedImpress.bean.FeedImpress;
import com.testpro.feedImpress.bean.FeedImpressSearch;
import com.testpro.feedImpress.service.spi.IFeedImpressService;

/**
 * FeedImpress JUnit Test<br/>
 * 带事务处理,默认为回滚(MySQL的InnoDB引擎)
 * @author lubo
 * @date 2018-7-23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class FeedImpressTest {
	@Autowired
	private IFeedImpressService feedImpressService;
	
	@Test
	public void find() {
		FeedImpress s = feedImpressService.find(FeedImpress.class, 1);
		System.out.println( s );
	}
	
	@Test
	public void queryAll() {
		List<FeedImpress> list = feedImpressService.queryAll(FeedImpress.class);
		System.out.println( list.size() );
	}
	
	@Test(expected = BaseException.class)
	//@Rollback(false)	//引擎:InnoDB
	public void add() {
		try {
			FeedImpress entity = new FeedImpress();
			entity.setId(1);
			feedImpressService.save(entity);
			System.out.println( entity );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void update() {
		FeedImpress entity = new FeedImpress();
		entity.setId(1);
		feedImpressService.update(entity);
	}
	
	@Test
	public void page() {
		FeedImpressSearch search = new FeedImpressSearch();
		// search.setPageSize(5);
		search.setPageNo(1);
		// search.setName("s");
		List<FeedImpress> list = feedImpressService.page(FeedImpress.class, search);
		System.out.println(
				"第:"+search.getPageNo()+"页, " +
				"总页数:"+search.getTotalPages()+", " +
				"总记录:"+search.getTotalRecords());
		for (FeedImpress s : list) {
			System.out.println(s);
		}
	}
	
	@Test 
	public void delete() {
		feedImpressService.delete(FeedImpress.class, 1);
		// feedImpressService.deleteByIds(FeedImpress.class, new Object[]{3,5,9});
	}
	
}
