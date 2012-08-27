package org.vorpinator.football.parser

import org.vorpinator.football.model.espn.source.EspnRow

import org.vorpinator.football.model.player.Kicker
import org.vorpinator.football.model.player.QuarterBack
import org.vorpinator.football.model.player.RunningBack
import org.vorpinator.football.model.player.TightEnd
import org.vorpinator.football.model.player.WideReceiver
import org.vorpinator.football.model.player.DefenseSpecialTeam

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:01 PM
 */
class EspnProjectionCsvParser implements CsvParser {

    @Override
    QuarterBack parseQuarterback(String line, Integer year) {
        new EspnRow(line, year).createQuarterBack()
    }

    @Override
    RunningBack parseRunningBack(String line, Integer year) {
        new EspnRow(line, year).createRunningBack()
    }

    @Override
    WideReceiver parseWideReceiver(String line, Integer year) {
        new EspnRow(line, year).createWideReceiver()
    }

    @Override
    TightEnd parseTightEnd(String line, Integer year) {
        new EspnRow(line, year).createTightEnd()
    }

    @Override
    Kicker parseKicker(String line, Integer year) {
        new EspnRow(line, year).createKicker()
    }

    @Override
    DefenseSpecialTeam parseDefenseSpecialTeam(String line, Integer year) {
        new EspnRow(line, year).createDefenseSpecialTeam()
    }

    @Override
    List<QuarterBack> parseQuarterbacks(File file, Integer year) {
        List<QuarterBack> quarterbacks = new ArrayList<QuarterBack>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                quarterbacks.add(parseQuarterback(it, year))
            }
        }

        return quarterbacks;
    }

    @Override
    List<RunningBack> parseRunningBacks(File file, Integer year) {
        List<RunningBack> runningBacks = new ArrayList<RunningBack>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                runningBacks.add(parseRunningBack(it, year))
            }
        }

        return runningBacks;
    }

    @Override
    List<WideReceiver> parseWideReceivers(File file, Integer year) {
        List<WideReceiver> wideReceivers = new ArrayList<WideReceiver>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                wideReceivers.add(parseWideReceiver(it, year))
            }
        }

        return wideReceivers;
    }

    @Override
    List<TightEnd> parseTightEnds(File file, Integer year) {
        List<TightEnd> tightEnds = new ArrayList<TightEnd>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                tightEnds.add(parseTightEnd(it, year))
            }
        }

        return tightEnds;
    }

    @Override
    List<Kicker> parseKickers(File file, Integer year) {
        List<Kicker> kickers = new ArrayList<Kicker>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                kickers.add(parseKicker(it, year))
            }
        }

        return kickers;
    }

    @Override
    List<DefenseSpecialTeam> parseDefenseSpecialTeams(File file, Integer year) {
        List<DefenseSpecialTeam> defenseSpecialTeams = new ArrayList<DefenseSpecialTeam>()
        file.eachLine {
            if(it.split("\t")[0].isNumber()){
                defenseSpecialTeams.add(parseDefenseSpecialTeam(it, year))
            }
        }

        return defenseSpecialTeams;
    }
}
