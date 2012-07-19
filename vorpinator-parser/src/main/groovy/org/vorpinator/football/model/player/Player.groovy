package org.vorpinator.football.model.player

/**
 * User: Dayel Ostraco
 * Date: 7/16/12
 * Time: 4:04 PM
 */
abstract class Player {

    private String name
    private Integer year
    private String team
    private String position
    private Integer fumbles
    private Integer projectedPoints
    private String projectionSource
    private Integer sourceRank
    private Double vorp

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
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

    Double getVorp() {
        return vorp
    }

    void setVorp(Double vorp) {
        this.vorp = vorp
    }
}