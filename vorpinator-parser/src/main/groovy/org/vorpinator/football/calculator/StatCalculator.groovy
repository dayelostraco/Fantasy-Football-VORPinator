package org.vorpinator.football.calculator

import org.vorpinator.football.model.player.Player

/**
 * User: Dayel Ostraco
 * Date: 7/17/12
 * Time: 1:20 PM
 */
class StatCalculator {

    /**
     * Calculates the average projected points for a given position.
     */
    static def calculateAverageForPosition = {List<Player> playersForPosition, String position ->
        Double totalPointsForPosition = 0.0;
        playersForPosition.each { if(it.getPosition().equals(position)){totalPointsForPosition += it.getProjectedPoints()}}
        totalPointsForPosition / playersForPosition.size()
    }

    /**
     * Sorts the Collection of Players in descending order based on projected points and returns the player at the index
     * of (league size * starter slots for position -1). For ex: 12 Team League with two WR starter slots will have
     * the Replacement Player Value of the 24th best WR (Collection index 23)
     */
    static def calcReplacementLevelPlayer = {List<Player> playersForPosition, String position, Integer leagueSize, Integer starterSlotsForPosition ->
        playersForPosition.sort{-it.projectedPoints}
        playersForPosition.get((leagueSize*starterSlotsForPosition)-1)
    }

    /**
     * //C(P-A) + A where C is correlational strength, P is for projected points and A is average points for for fantasy starters at the position.
     */
    static def calculatePlayerVorp = {Player player, Double avgProjectedPointsForPosition, Double positionCorrelation ->
        positionCorrelation * ((Double)player.getProjectedPoints()-avgProjectedPointsForPosition) + avgProjectedPointsForPosition
    }
}