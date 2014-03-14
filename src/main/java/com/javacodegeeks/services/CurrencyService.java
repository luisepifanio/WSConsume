package com.javacodegeeks.services;

import net.webservicex.currencyconvertor.Currency;

public interface CurrencyService {
    Double getConversionRate(Currency fromCurrency, Currency toCurrency);
}
