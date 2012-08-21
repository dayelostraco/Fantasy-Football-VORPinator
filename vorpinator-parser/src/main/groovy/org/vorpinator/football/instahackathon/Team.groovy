package org.vorpinator.football.instahackathon

/**
 * User: Dayel Ostraco
 * Date: 8/21/12
 * Time: 3:30 PM
 */
class Team {

    private String teamId;
    private String draftOrder;
    private String teamName;
    private String hackathonEventId;
    private String hackathonCategoryId;
    private String teamOptions;
    List<TeamMember> teamMembers;

    Team(String teamId, String draftOrder, String teamName, String hackathonEventId, String hackathonCategoryId, String teamOptions) {
        this.teamId = teamId
        this.draftOrder = draftOrder
        this.teamName = teamName
        this.hackathonEventId = hackathonEventId
        this.hackathonCategoryId = hackathonCategoryId
        this.teamOptions = teamOptions
    }

    String getTeamId() {
        return teamId
    }

    void setTeamId(String teamId) {
        this.teamId = teamId
    }

    String getDraftOrder() {
        return draftOrder
    }

    void setDraftOrder(String draftOrder) {
        this.draftOrder = draftOrder
    }

    String getTeamName() {
        return teamName
    }

    void setTeamName(String teamName) {
        this.teamName = teamName
    }

    String getHackathonEventId() {
        return hackathonEventId
    }

    void setHackathonEventId(String hackathonEventId) {
        this.hackathonEventId = hackathonEventId
    }

    String getHackathonCategoryId() {
        return hackathonCategoryId
    }

    void setHackathonCategoryId(String hackathonCategoryId) {
        this.hackathonCategoryId = hackathonCategoryId
    }

    String getTeamOptions() {
        return teamOptions
    }

    void setTeamOptions(String teamOptions) {
        this.teamOptions = teamOptions
    }

    List<TeamMember> getTeamMembers() {
        return teamMembers
    }

    void setTeamMembers(List<TeamMember> teamMembers) {
        this.teamMembers = teamMembers
    }

    Map<String, String> toJsonMap(){

        Map<String, String> jsonMap = new HashMap<String, String>()
        jsonMap.put("teamId", teamId)
        jsonMap.put("draftOrder",draftOrder)
        jsonMap.put("teamName", teamName)
        jsonMap.put("hackathonEventId", hackathonEventId)
        jsonMap.put("hackathonCategoryId", hackathonCategoryId)
        jsonMap.put("teamOptions", teamOptions)

        return jsonMap;
    }
}
