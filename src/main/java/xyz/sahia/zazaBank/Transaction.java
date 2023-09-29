package xyz.sahia.zazaBank;

import java.time.LocalDate;

public record Transaction(LocalDate date, String action, int amount, String source) {
}
