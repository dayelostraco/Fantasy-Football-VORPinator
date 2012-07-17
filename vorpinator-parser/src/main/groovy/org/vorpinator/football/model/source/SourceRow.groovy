package org.vorpinator.football.model.source

import org.vorpinator.football.model.player.Kicker
import org.vorpinator.football.model.player.QuarterBack
import org.vorpinator.football.model.player.RunningBack
import org.vorpinator.football.model.player.TightEnd
import org.vorpinator.football.model.player.WideReceiver
import org.vorpinator.football.model.player.DefenseSpecialTeam

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 9:10 PM
 */
abstract class SourceRow {

    abstract QuarterBack createQuarterBack()

    abstract RunningBack createRunningBack()

    abstract WideReceiver createWideReceiver()

    abstract TightEnd createTightEnd()

    abstract Kicker createKicker()

    abstract DefenseSpecialTeam createDefenseSpecialTeam()
}
