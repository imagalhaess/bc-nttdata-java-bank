package br.com.dio.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@EqualsAndHashCode
@Getter
public class Money {
    private final List<MoneyAudity> history = new ArrayList<>();

    public Money(final MoneyAudity history) {
        this.history.add(history);
    }

    public void addHistory(final MoneyAudity history){
        this.history.add(history);
    }

    @Override
    public String toString() {
        return history.stream()
                .map(audity -> "Descrição: " + audity.description()
                        + " | Serviço: " + audity.targetService()
                        + " | Data: " + audity.createdAt()
                        .truncatedTo(ChronoUnit.SECONDS)
                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")))
                .collect(Collectors.joining("\n"));
    }
}
