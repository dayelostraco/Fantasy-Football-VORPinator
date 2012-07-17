package org.vorpinator.football.parser

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:45 PM
 */

EspnCsvParser parser = new EspnCsvParser();

def quarterBacks = parser.parseQuarterbacks(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN QB Projections.txt"), 2012)
def runningBacks = parser.parseRunningBacks(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN RB Projections.txt"), 2012)
def wideReceivers = parser.parseWideReceivers(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN WR Projections.txt"), 2012)
def tightEnds = parser.parseTightEnds(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN TE Projections.txt"), 2012)
def kickers = parser.parseKickers(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN K Projections.txt"), 2012)
def defenseSpecialTeams = parser.parseDefenseSpecialTeams(new File("/Users/dayelostraco/Desktop/VORP Projections/ESPN DST Projections.txt"), 2012)

print defenseSpecialTeams