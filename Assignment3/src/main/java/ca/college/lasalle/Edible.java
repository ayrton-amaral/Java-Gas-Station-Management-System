package ca.college.lasalle;

import java.time.LocalDate;

public interface Edible {
    double getNumberOfCalories();
    LocalDate getExpiryDate();
}
