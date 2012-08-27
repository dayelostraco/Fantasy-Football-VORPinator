package org.vorpinator.football.parser

import org.vorpinator.football.model.player.Player
import org.vorpinator.football.filter.PlayerFilter

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:45 PM
 */

//EspnProjectionCsvParser parser = new EspnProjectionCsvParser();
//
//def filteredQuarterBacks = new ArrayList<Player>()
//PlayerFilter.filterByPassAttempts parser.parseQuarterbacks(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN QB Projections.txt"), 2012),filteredQuarterBacks,250
//
//print filteredQuarterBacks
//def filteredRunningBacks = new ArrayList<Player>()
//PlayerFilter.filterByRushingAttempts parser.parseRunningBacks(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN RB Projections.txt"), 2012),filteredRunningBacks,150
//
//def filteredWideReceivers = new ArrayList<Player>()
//PlayerFilter.filterByReceptions parser.parseWideReceivers(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN WR Projections.txt"), 2012),filteredWideReceivers, 70
//
//def filteredTightEnds = new ArrayList<Player>()
//PlayerFilter.filterByReceptions parser.parseTightEnds(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN TE Projections.txt"), 2012),filteredTightEnds, 30
//
//def kickers = parser.parseKickers(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN K Projections.txt"), 2012)
//def defenseSpecialTeams = parser.parseDefenseSpecialTeams(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN DST Projections.txt"), 2012)
//
//StatCalculator calculator = new StatCalculator();
//def avgProjectedPointsForQB = calculator.calculateAverageForPosition(filteredQuarterBacks, "QB")
//def avgProjectedPointsForRB = calculator.calculateAverageForPosition(filteredRunningBacks, "RB")
//def avgProjectedPointsForWR = calculator.calculateAverageForPosition(filteredWideReceivers, "WR")
//def avgProjectedPointsForTE = calculator.calculateAverageForPosition(filteredTightEnds, "TE")

//def sql = Sql.newInstance("jdbc:postgresql://localhost:5432/postgres", "postgres", "Z0mb1301", "org.postgresql.Driver")
//def query = "select * from \"FANTASY_FOOTBALL\".\"POSITION\""
//sql.eachRow query, {position->
//    println position.id + " "  + position.fullname +" " +position.abbreviation
//}