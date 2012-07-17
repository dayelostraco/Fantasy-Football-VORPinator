package org.vorpinator.football.model.player

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:33 PM
 */
class Kicker extends Player {

    private Integer fieldGoalsMade;
    private Integer fieldGoalAttempts;
    private Double fieldGoalPercentage;

    Integer getFieldGoalsMade() {
        return fieldGoalsMade
    }

    void setFieldGoalsMade(Integer fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade
    }

    Integer getFieldGoalAttempts() {
        return fieldGoalAttempts
    }

    void setFieldGoalAttempts(Integer fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts
    }

    Double getFieldGoalPercentage() {
        return fieldGoalPercentage
    }

    void setFieldGoalPercentage(Double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage
    }
}