package org.vorpinator.football.parser

import org.vorpinator.football.model.player.QuarterBack
import org.vorpinator.football.model.player.RunningBack
import org.vorpinator.football.model.player.WideReceiver
import org.vorpinator.football.model.player.TightEnd
import org.vorpinator.football.model.player.Kicker
import org.vorpinator.football.model.player.DefenseSpecialTeam

/**
 * User: Dayel Ostraco
 * Date: 7/19/12
 * Time: 11:10 AM
 */
class YahooSportsStatsCsvParser implements CsvParser {

    @Override
    /**
     * Name	Team	G	QBRat 	Comp 	Att 	Pct 	Yds 	Y/G 	Y/A 	TD 	Int 	Rush 	Yds 	Y/G 	Avg 	TD 	Sack 	YdsL 	Fum 	FumL
     */
    QuarterBack parseQuarterback(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    RunningBack parseRunningBack(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    WideReceiver parseWideReceiver(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    TightEnd parseTightEnd(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    Kicker parseKicker(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    DefenseSpecialTeam parseDefenseSpecialTeam(String line, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    List<QuarterBack> parseQuarterbacks(File file, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    List<RunningBack> parseRunningBacks(File file, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    List<WideReceiver> parseWideReceivers(File file, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    List<TightEnd> parseTightEnds(File file, Integer year) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    List<Kicker> parseKickers(File file, Integer year) {
        return null
    }

    @Override
    List<DefenseSpecialTeam> parseDefenseSpecialTeams(File file, Integer year) {
        return null
    }
}
