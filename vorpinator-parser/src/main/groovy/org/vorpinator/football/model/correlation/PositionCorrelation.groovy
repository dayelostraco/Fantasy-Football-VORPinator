package org.vorpinator.football.model.correlation

/**
 * User: Dayel Ostraco
 * Date: 7/18/12
 * Time: 12:09 PM
 */
public enum PositionCorrelation {
    QB_CORRELATION(0.60),
    RB_CORRELATION(0.48),
    WR_CORRELATION(0.42),
    TE_CORRELATION(0.62)

    PositionCorrelation(Double value) {this.value = value}
    private final Double value
    public Double getValue() {return value}
}