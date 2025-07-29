package br.com.dio.model;

import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Getter;
import lombok.ToString;
import java.util.List;
import java.util.ArrayList;

@EqualsAndHashCode
@ToString
@Getter


public class Money {
    private final List<MoneyAudity> history = new ArrayList<>();

    public Money(final MoneyAudity history) {
        this.history.add(history);
    }

    public void addHistory(final MoneyAudity history){
        this.history.add(history);
    }
}
