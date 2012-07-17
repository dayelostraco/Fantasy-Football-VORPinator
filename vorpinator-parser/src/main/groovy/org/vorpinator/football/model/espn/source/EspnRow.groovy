package org.vorpinator.football.model.espn.source

import org.vorpinator.football.model.player.Kicker
import org.vorpinator.football.model.player.QuarterBack
import org.vorpinator.football.model.player.RunningBack
import org.vorpinator.football.model.player.TightEnd
import org.vorpinator.football.model.player.WideReceiver
import org.vorpinator.football.model.player.DefenseSpecialTeam
import org.vorpinator.football.model.source.SourceRow

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 7:54 PM
 */
class EspnRow extends SourceRow {

    private static final String CSV_SEPARATOR = "\t";
    private static final String SOURCE_NAME = "ESPN.com"

    private String rank;
    private String playerTeamPos;
    private String completionsAttempts;
    private String passingYards;
    private String passingTouchDowns;
    private String interceptions;
    private String rushingAttempts;
    private String rushingYards;
    private String rushingTouchDowns;
    private String receptions;
    private String receivingYards;
    private String receivingTouchdowns;
    private String projectedPoints;
    private Integer year;

    EspnRow(String csvRow, Integer year) {
        String[] csvColumns = csvRow.split(CSV_SEPARATOR);
        this.rank = csvColumns[0]
        this.playerTeamPos = csvColumns[1]
        this.completionsAttempts = csvColumns[2]
        this.passingYards = csvColumns[3]
        this.passingTouchDowns = csvColumns[4]
        this.interceptions = csvColumns[5]
        this.rushingAttempts = csvColumns[6]
        this.rushingYards = csvColumns[7]
        this.rushingTouchDowns = csvColumns[8]
        this.receptions = csvColumns[9]
        this.receivingYards = csvColumns[10]
        this.receivingTouchdowns = csvColumns[11]
        this.projectedPoints = csvColumns[12]
        this.year = year
    }

    QuarterBack createQuarterBack(){
        QuarterBack quarterback = new QuarterBack();

        quarterback.firstName = this.getFirstName()
        quarterback.lastName = this.getLastName()
        quarterback.position = this.getPosition()
        quarterback.team = this.getTeam()
        quarterback.year = this.getYear()
        quarterback.passCompletions = this.getPassingCompletions()
        quarterback.passAttempts = this.getPassingAttempts()
        quarterback.passingYards = this.getPassingYards()
        quarterback.completionPercentage = this.getCompletionPercentage()
        quarterback.passingTouchdowns = this.getPassingTouchDowns()
        quarterback.interceptions = this.getInterceptions()
        quarterback.rushingAttempts = this.getRushingAttempts()
        quarterback.rushingYards = this.getRushingYards()
        quarterback.rushingYardsPerCarry = this.getRushingYardsPerCarry()
        quarterback.rushingTouchdowns = this.getRushingTouchDowns()
        quarterback.projectedPoints = this.getProjectedPoints()
        quarterback.sourceRank = this.getRank()
        quarterback.projectionSource = this.getProjectionSource();

        quarterback
    }

    RunningBack createRunningBack(){
        RunningBack runningBack = new RunningBack();

        runningBack.firstName = this.getFirstName()
        runningBack.lastName = this.getLastName()
        runningBack.position = this.getPosition()
        runningBack.team = this.getTeam()
        runningBack.year = this.getYear()
        runningBack.rushingAttempts = this.getRushingAttempts()
        runningBack.rushingYards = this.getRushingYards()
        runningBack.rushingYardsPerCarry = this.getRushingYardsPerCarry()
        runningBack.rushingTouchdowns = this.getRushingTouchDowns()
        runningBack.receptions = this.getReceptions()
        runningBack.receivingYards = this.getReceivingYards()
        runningBack.receivingYardsPerCatch = this.getReceivingYardsPerCatch()
        runningBack.receivingTouchdowns = this.getReceivingTouchDowns()
        runningBack.projectedPoints = this.getProjectedPoints()
        runningBack.sourceRank = this.getRank()
        runningBack.projectionSource = this.getProjectionSource();

        runningBack
    }

    WideReceiver createWideReceiver(){
        WideReceiver wideReceiver = new WideReceiver();

        wideReceiver.firstName = this.getFirstName()
        wideReceiver.lastName = this.getLastName()
        wideReceiver.position = this.getPosition()
        wideReceiver.team = this.getTeam()
        wideReceiver.year = this.getYear()
        wideReceiver.receptions = this.getReceptions()
        wideReceiver.receivingYards = this.getReceivingYards()
        wideReceiver.receivingYardsPerCatch = this.getReceivingYardsPerCatch()
        wideReceiver.receivingTouchdowns = this.getReceivingTouchDowns()
        wideReceiver.rushingAttempts = this.getRushingAttempts()
        wideReceiver.rushingYards = this.getRushingYards()
        wideReceiver.rushingYardsPerCarry = this.getRushingYardsPerCarry()
        wideReceiver.rushingTouchdowns = this.getRushingTouchDowns()
        wideReceiver.projectedPoints = this.getProjectedPoints()
        wideReceiver.sourceRank = this.getRank()
        wideReceiver.projectionSource = this.getProjectionSource();

        wideReceiver
    }

    TightEnd createTightEnd(){
        TightEnd tightEnd = new TightEnd();

        tightEnd.firstName = this.getFirstName()
        tightEnd.lastName = this.getLastName()
        tightEnd.position = this.getPosition()
        tightEnd.team = this.getTeam()
        tightEnd.year = this.getYear()
        tightEnd.receptions = this.getReceptions()
        tightEnd.receivingYards = this.getReceivingYards()
        tightEnd.receivingYardsPerCatch = this.getReceivingYardsPerCatch()
        tightEnd.receivingTouchdowns = this.getReceivingTouchDowns()
        tightEnd.rushingAttempts = this.getRushingAttempts()
        tightEnd.rushingYards = this.getRushingYards()
        tightEnd.rushingYardsPerCarry = this.getRushingYardsPerCarry()
        tightEnd.rushingTouchdowns = this.getRushingTouchDowns()
        tightEnd.projectedPoints = this.getProjectedPoints()
        tightEnd.sourceRank = this.getRank()
        tightEnd.projectionSource = this.getProjectionSource();

        tightEnd
    }

    Kicker createKicker(){
        Kicker kicker = new Kicker()

        kicker.firstName = this.getFirstName()
        kicker.lastName = this.getLastName()
        kicker.position = this.getPosition()
        kicker.team = this.getTeam()
        kicker.year = this.getYear()
        kicker.projectedPoints = this.getProjectedPoints()
        kicker.sourceRank = this.getRank()
        kicker.projectionSource = this.getProjectionSource()

        kicker
    }

    DefenseSpecialTeam createDefenseSpecialTeam(){
        DefenseSpecialTeam defenseSpecialTeam = new DefenseSpecialTeam()

        defenseSpecialTeam.position = this.getPosition()
        defenseSpecialTeam.team = this.getTeam()
        defenseSpecialTeam.year = this.getYear()
        defenseSpecialTeam.projectedPoints = this.getProjectedPoints()
        defenseSpecialTeam.sourceRank = this.getRank()
        defenseSpecialTeam.projectionSource = this.getProjectionSource()

        return defenseSpecialTeam
    }

    Integer getRank() {
        Integer.parseInt(rank)
    }

    String getFirstName() {
        playerTeamPos.split(" ")[0].substring(1)
    }

    String getLastName() {
        playerTeamPos.substring(playerTeamPos.indexOf(" ") + 1, playerTeamPos.indexOf(","))
    }

    String getTeam() {
        playerTeamPos.split(",")[1].split(" ")[1]
    }

    String getPosition() {
        String position = playerTeamPos.split(",")[1].split(" ")[2]
        position.substring(0, position.length()-1)
    }

    Integer getPassingCompletions() {
        Integer.parseInt(completionsAttempts.split("/")[0])
    }

    Integer getPassingAttempts() {
        Integer.parseInt(completionsAttempts.split("/")[1])
    }

    Double getCompletionPercentage() {
        (Double) getPassingCompletions() / (Double) getPassingAttempts() * 100
    }

    Integer getPassingYards() {
        Integer.parseInt(passingYards)
    }

    Integer getPassingTouchDowns() {
        Integer.parseInt(passingTouchDowns)
    }

    Integer getInterceptions(){
        Integer.parseInt(interceptions)
    }

    Integer getRushingAttempts(){
        Integer.parseInt(rushingAttempts)
    }

    Integer getRushingYards(){
        Integer.parseInt(rushingYards)
    }

    Integer getRushingTouchDowns(){
        Integer.parseInt(rushingTouchDowns)
    }

    Double getRushingYardsPerCarry(){
        (Double) getRushingYards() / (Double) getRushingAttempts()
    }

    Integer getReceptions(){
        Integer.parseInt(receptions)
    }

    Integer getReceivingYards(){
        Integer.parseInt(receivingYards)
    }

    Double getReceivingYardsPerCatch(){
        (Double) getReceivingYards() / (Double) getReceptions()
    }

    Integer getReceivingTouchDowns(){
        Integer.parseInt(receivingTouchdowns)
    }

    Integer getProjectedPoints(){
        Integer.parseInt(projectedPoints)
    }

    Integer getYear(){
        year
    }

    String getProjectionSource(){
        SOURCE_NAME
    }
}
