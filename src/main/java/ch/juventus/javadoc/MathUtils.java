package ch.juventus.javadoc;

import java.util.List;

/**
 * <H1>Mathematische Rechnungsoperationen</H1>
 * In dieser Klasse werden Mathematische Rechnungsoperationen erstellt und ausgefuehrt.
 *
 * @author KingKong_RR
 * @version 1.0
 * @since 2021-09-16
 */
public class MathUtils {
    /**
     * In dieser Methode wird die Addition ausgefuehrt.
     * Sollte der Summand 0 sein so wird 0 zurueckgegeben.
     * Sollte NULL sein dann wird eine NULL-PIONTER-EXCEPTION ausgegeben.
     *
     * @param numbers Summand + summand
     * @return Summe aller werte zusammen
     */
    public double addition(List<Double> numbers) {
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * In dieser Methode wird die Subtraktion ausgefuehrt
     *
     * @param a Minuend
     * @param b Subtrahend
     * @return Differenz
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * In dieser Methode wird die Division ausgefuehrt
     *
     * @param a Dividend
     * @param b Divisor
     * @return Quotient
     */
    public double divison(double a, double b) {
        return a / b;
    }

    /**
     * In dieser MEthode wird die Multiplikation ausgefuehrt
     *
     * @param a Multiplikator
     * @param b Multiplikand
     * @return Produkt
     */
    public double multiplication(double a, double b) {
        return a * b;
    }


}
