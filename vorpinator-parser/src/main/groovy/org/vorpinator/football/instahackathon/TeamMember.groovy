package org.vorpinator.football.instahackathon

/**
 * User: Dayel Ostraco
 * Date: 8/21/12
 * Time: 3:35 PM
 */
class TeamMember {

    private String teamMemberId;
    private String fullName;
    private String teamId;
    private String company;

    TeamMember(String teamMemberId, String fullName, String teamId, String company) {
        this.teamMemberId = teamMemberId
        this.fullName = fullName
        this.teamId = teamId
        this.company = company
    }

    String getTeamMemberId() {
        return teamMemberId
    }

    void setTeamMemberId(String teamMemberId) {
        this.teamMemberId = teamMemberId
    }

    String getFullName() {
        return fullName
    }

    void setFullName(String fullName) {
        this.fullName = fullName
    }

    String getTeamId() {
        return teamId
    }

    void setTeamId(String teamId) {
        this.teamId = teamId
    }

    String getCompany() {
        return company
    }

    void setCompany(String company) {
        this.company = company
    }

    Map<String, String> toJsonMap(){
        Map<String, String> jsonMap = new HashMap<String, String>()
        jsonMap.put("teamMemberId", teamMemberId)
        jsonMap.put("fullName", fullName)
        jsonMap.put("teamId", teamId)
        jsonMap.put("company", company)

        return jsonMap
    }
}
