package org.vorpinator.football.model.player

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:04 PM
 */
abstract class Player {

    private String firstName;
    private String lastName;
    private String suffix;
    private Integer year;
    private String team;
    private String position;
    private Integer fumbles;
    private Integer projectedPoints;
    private String projectionSource;
    private Integer sourceRank;

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getSuffix() {
        return suffix
    }

    void setSuffix(String suffix) {
        this.suffix = suffix
    }

    Integer getYear() {
        return year
    }

    void setYear(Integer year) {
        this.year = year
    }

    String getTeam() {
        return team
    }

    void setTeam(String team) {
        this.team = team
    }

    String getPosition() {
        return position
    }

    void setPosition(String position) {
        this.position = position
    }

    Integer getFumbles() {
        return fumbles
    }

    void setFumbles(Integer fumbles) {
        this.fumbles = fumbles
    }

    Integer getProjectedPoints() {
        return projectedPoints
    }

    void setProjectedPoints(Integer projectedPoints) {
        this.projectedPoints = projectedPoints
    }

    String getProjectionSource() {
        return projectionSource
    }

    void setProjectionSource(String projectionSource) {
        this.projectionSource = projectionSource
    }

    Integer getSourceRank() {
        return sourceRank
    }

    void setSourceRank(Integer sourceRank) {
        this.sourceRank = sourceRank
    }
}