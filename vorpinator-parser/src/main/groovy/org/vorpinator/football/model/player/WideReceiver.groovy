package org.vorpinator.football.model.player

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:25 PM
 */
class WideReceiver extends Player {

    private Integer receptions;
    private Integer receivingYards;
    private Double receivingYardsPerCatch;
    private Integer receivingTouchdowns;
    private Integer receivingTargets;
    private Integer rushingAttempts;
    private Integer rushingYards;
    private Integer rushingTouchdowns;
    private Double rushingYardsPerCarry;

    Integer getReceptions() {
        return receptions
    }

    void setReceptions(Integer receptions) {
        this.receptions = receptions
    }

    Integer getReceivingYards() {
        return receivingYards
    }

    void setReceivingYards(Integer receivingYards) {
        this.receivingYards = receivingYards
    }

    Double getReceivingYardsPerCatch() {
        return receivingYardsPerCatch
    }

    void setReceivingYardsPerCatch(Double receivingYardsPerCatch) {
        this.receivingYardsPerCatch = receivingYardsPerCatch
    }

    Integer getReceivingTouchdowns() {
        return receivingTouchdowns
    }

    void setReceivingTouchdowns(Integer receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns
    }

    Integer getReceivingTargets() {
        return receivingTargets
    }

    void setReceivingTargets(Integer receivingTargets) {
        this.receivingTargets = receivingTargets
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

    void setRushingYardsPerCarry(Double rushingYardsPerCarry) {
        this.rushingYardsPerCarry = rushingYardsPerCarry
    }
}