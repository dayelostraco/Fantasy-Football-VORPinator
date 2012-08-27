package org.vorpinator.football.model.player

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:18 PM
 */
class QuarterBack extends Player {

    private Integer passCompletions;
    private Integer passAttempts;
    private Double completionPercentage;
    private Integer passingYards;
    private Integer passingTouchdowns;
    private Integer interceptions;
    private Integer rushingAttempts;
    private Integer rushingYards;
    private Integer rushingTouchdowns;
    private Double rushingYardsPerCarry;

    Integer getPassCompletions() {
        return passCompletions
    }

    void setPassCompletions(Integer passCompletions) {
        this.passCompletions = passCompletions
    }

    Integer getPassAttempts() {
        return passAttempts
    }

    void setPassAttempts(Integer passAttempts) {
        this.passAttempts = passAttempts
    }

    Double getCompletionPercentage() {
        return completionPercentage
    }

    void setCompletionPercentage(Double completionPercentage) {
        this.completionPercentage = completionPercentage
    }

    Integer getPassingYards() {
        return passingYards
    }

    void setPassingYards(Integer passingYards) {
        this.passingYards = passingYards
    }

    Integer getPassingTouchdowns() {
        return passingTouchdowns
    }

    void setPassingTouchdowns(Integer passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns
    }

    Integer getInterceptions() {
        return interceptions
    }

    void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions
    }

    Integer getRushingAttempts() {
        return rushingAttempts
    }

    void setRushingAttempts(Integer rushingAttempts) {
        this.rushingAttempts = rushingAttempts
    }

    Integer getRushingYards() {
        return rushingYards
    }

    void setRushingYards(Integer rushingYards) {
        this.rushingYards = rushingYards
    }

    Integer getRushingTouchdowns() {
        return rushingTouchdowns
    }

    void setRushingTouchdowns(Integer rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns
    }

    Double getRushingYardsPerCarry() {
        return rushingYardsPerCarry
    }

    void setRushingYardsPerCarry(Double yardsPerCarry) {
        this.rushingYardsPerCarry = yardsPerCarry
    }
}
