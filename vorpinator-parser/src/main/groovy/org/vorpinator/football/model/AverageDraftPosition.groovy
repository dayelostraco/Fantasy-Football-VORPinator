package org.vorpinator.football.model

/**
 * User: Dayel Ostraco
 * Date: 7/18/12
 * Time: 11:01 PM
 */
class AverageDraftPosition {

    private String leagueSize
    private String adp
    private String draftPosition
    private String playerFirstName
    private String playerLastName
    private String position
    private String team
    private String timesDrafted
    private String byeWeek
    private String source
    private Date importDate

    AverageDraftPosition(String leagueSize, String adp, String draftPosition, String playerFirstName,
                         String playerLastName, String position, String team, String timesDrafted,
                         String byeWeek, String source, Date importDate) {

        this.leagueSize = leagueSize
        this.adp = adp
        this.draftPosition = draftPosition
        this.playerFirstName = playerFirstName
        this.playerLastName = playerLastName
        this.position = position
        this.team = team
        this.timesDrafted = timesDrafted
        this.byeWeek = byeWeek
        this.source = source
        this.importDate = importDate
    }

    String getLeagueSize() {
        return leagueSize
    }

    void setLeagueSize(String leagueSize) {
        this.leagueSize = leagueSize
    }

    String getAdp() {
        return adp
    }

    void setAdp(String adp) {
        this.adp = adp
    }

    String getDraftPosition() {
        return draftPosition
    }

    void setDraftPosition(String draftPosition) {
        this.draftPosition = draftPosition
    }

    String getPlayerFirstName() {
        return playerFirstName
    }

    void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName
    }

    String getPlayerLastName() {
        return playerLastName
    }

    void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName
    }

    String getPosition() {
        return position
    }

    void setPosition(String position) {
        this.position = position
    }

    String getTeam() {
        return team
    }

    void setTeam(String team) {
        this.team = team
    }

    String getTimesDrafted() {
        return timesDrafted
    }

    void setTimesDrafted(String timesDrafted) {
        this.timesDrafted = timesDrafted
    }

    String getByeWeek() {
        return byeWeek
    }

    void setByeWeek(String byeWeek) {
        this.byeWeek = byeWeek
    }

    String getSource() {
        return source
    }

    void setSource(String source) {
        this.source = source
    }

    Date getImportDate() {
        return importDate
    }

    void setImportDate(Date importDate) {
        this.importDate = importDate
    }
}