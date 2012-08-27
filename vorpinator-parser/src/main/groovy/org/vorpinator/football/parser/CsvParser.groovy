package org.vorpinator.football.parser

import org.vorpinator.football.model.player.Kicker
import org.vorpinator.football.model.player.QuarterBack
import org.vorpinator.football.model.player.RunningBack
import org.vorpinator.football.model.player.TightEnd
import org.vorpinator.football.model.player.WideReceiver
import org.vorpinator.football.model.player.DefenseSpecialTeam

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:04 PM
 */
public interface CsvParser {

    QuarterBack parseQuarterback(String line, Integer year);

    RunningBack parseRunningBack(String line, Integer year);

    WideReceiver parseWideReceiver(String line, Integer year);

    TightEnd parseTightEnd(String line, Integer year);

    Kicker parseKicker(String line, Integer year);

    DefenseSpecialTeam parseDefenseSpecialTeam(String line, Integer year);

    List<QuarterBack> parseQuarterbacks(File file, Integer year);

    List<RunningBack> parseRunningBacks(File file, Integer year);

    List<WideReceiver> parseWideReceivers(File file, Integer year);

    List<TightEnd> parseTightEnds(File file, Integer year);

    List<Kicker> parseKickers(File file, Integer year);

    List<DefenseSpecialTeam> parseDefenseSpecialTeams(File file, Integer year);
}