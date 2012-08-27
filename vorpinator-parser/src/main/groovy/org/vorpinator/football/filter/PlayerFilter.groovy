package org.vorpinator.football.filter

/**
 * User: Dayel Ostraco
 * Date: 7/18/12
 * Time: 8:17 PM
 */
class PlayerFilter {

    /**
     * Filters a collection of Players based on a minimum number of Pass Attempts.
     */
    static def filterByPassAttempts = {players, filteredPlayers, filterAmount -> players.each {if(it.getPassAttempts()>=filterAmount){filteredPlayers.add it}}}

    /**
     * Filters a collection of Players based on a minimum number of Rushing Attempts.
     */
    static def filterByRushingAttempts = {players, filteredPlayers, filterAmount -> players.each {if(it.getRushingAttempts()>=filterAmount){filteredPlayers.add it}}}

    /**
     * Filters a collection of Players based on a minimum number of Receptions.
     */
    static def filterByReceptions = {players, filteredPlayers, filterAmount -> players.each {if(it.getReceptions()>=filterAmount){filteredPlayers.add it}}}
}
