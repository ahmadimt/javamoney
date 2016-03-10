/**
 * 
 */
package com.imti.spring.java.money.exchange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imti.spring.java.money.SpringbootJavaMoneyApplication;

/**
 * @author imteyaz
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootJavaMoneyApplication.class)
public class ExchangeExampleTest {

	@Autowired
	ExchangeExample example;

	@Test
	public void testExchangeRate() {
		example.seeExchangeRate();
	}
}
