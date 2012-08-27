package org.vorpinator.football.adp

/**
 * User: Dayel Ostraco
 * Date: 7/18/12
 * Time: 9:55 PM
 */
public enum AdpLeagueSize {

    EIGHT_TEAM_LEAGUE(8),
    TEN_TEAM_LEAGUE(10),
    TWELVE_TEAM_LEAGUE(12),
    FOURTEEN_TEAM_LEAGUE(14),
    SIXTEEN_TEAM_LEAGUE(16)

    AdpLeagueSize(Double value) {this.value = value}
    private final Integer value
    public Integer getValue() {return value}
}