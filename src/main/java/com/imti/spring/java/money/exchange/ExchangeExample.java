/**
 * 
 */
package com.imti.spring.java.money.exchange;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.Money;
import org.springframework.stereotype.Component;

/**
 * @author imteyaz
 *
 */
@Component
public class ExchangeExample {

	public void seeExchangeRate() {
		ExchangeRateProvider imfRateProvider = MonetaryConversions.getExchangeRateProvider("IMF");
		ExchangeRateProvider ecbRateProvider = MonetaryConversions.getExchangeRateProvider("ECB");
		CurrencyUnit riyal = Monetary.getCurrency("BRL");
		CurrencyUnit dollar = Monetary.getCurrency(Locale.US);
		CurrencyConversion imfDollarConversion = imfRateProvider.getCurrencyConversion(dollar);
		CurrencyConversion ecbDollarConversion = ecbRateProvider.getCurrencyConversion(dollar);
		MonetaryAmount amount = Money.of(10, riyal);
		System.out.println(amount.with(imfDollarConversion));
		System.out.println(amount.with(ecbDollarConversion));

	}

}
