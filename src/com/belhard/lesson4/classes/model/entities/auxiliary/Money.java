package com.belhard.lesson4.classes.model.entities.auxiliary;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class Money {
    private BigDecimal amount;
    private Currency currency;

    public enum Currency {
        USD("Dollar", "$", BigDecimal.ONE),
        EUR("Euro", "\u20AC", BigDecimal.valueOf(0.8)),
        BYN("Belarus ruble", "Br", BigDecimal.valueOf(2.5)),
        RUR("Ruble", "\u20BD", BigDecimal.valueOf(70)),
        PLN("Zloty", "z\u0142", BigDecimal.valueOf(4)),
        UAH("Hryvna", "\u20B4", BigDecimal.valueOf(30));

        private final String name;
        private final String symbol;
        private BigDecimal exchangeRate;

        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }

        public void setExchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
        }

        Currency(String name, String symbol, BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
            this.name = name;
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return currency.getSymbol() + amount;
    }
}
