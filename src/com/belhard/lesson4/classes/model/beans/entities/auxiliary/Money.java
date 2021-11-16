package com.belhard.lesson4.classes.model.beans.entities.auxiliary;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class Money {
    @NonNull
    private BigDecimal amount;

    @NonNull
    private Currency currency;

    public String getFormattedOutput() {
        return currency.getSymbol() + amount;
    }

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

        Currency(String name, String symbol, BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
            this.name = name;
            this.symbol = symbol;
        }

        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }

        public void setExchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
        }

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return symbol;
        }
    }
}
