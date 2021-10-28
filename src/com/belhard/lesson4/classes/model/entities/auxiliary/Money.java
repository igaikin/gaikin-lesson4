package com.belhard.lesson4.classes.model.entities.auxiliary;

import java.math.BigDecimal;

public class Money {
    private BigDecimal amount;
    private Currency currency;

    enum Currency {
        USD("Dollar", "$"), EUR("Euro", "€"), BYN("Belarus ruble", "Br"), RUR("Ruble", "₽"), PLN("Zloty", "zł"),
        UAH("Hryvna", "₴");
        private final String name;
        private final String symbol;

        Currency(String name, String symbol) {
            this.name = name;
            this.symbol = symbol;
        }

        String getName() {
            return name;
        }

        String getSymbol() {
            return symbol;
        }
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
