package org.vorpinator.football.instahackathon

import groovyx.net.http.HTTPBuilder
import groovyx.net.http.ContentType
import net.sf.json.JSONObject
import org.apache.commons.lang.StringUtils

/**
 * User: Dayel Ostraco
 * Date: 8/21/12
 * Time: 12:00 PM
 */
File hackathonTeamCsv = new File("/Users/dayelostraco/Desktop/Hackathon Signup.txt")
File hackathonCategoriesCsv = new File("/Users/dayelostraco/Desktop/Hackathon Categories.txt")

Calendar eventCal = new GregorianCalendar(2012, 7, 25, 9, 0)
Hackathon hackathon = createHackathonEvent("Hackathon 2.0 Dry Run #2", eventCal.getTime(), 1, 30)
parseCategories(hackathonCategoriesCsv, hackathon)
parseTeams(hackathonTeamCsv, hackathon)

public Hackathon createHackathonEvent(String eventName, Date eventDate, int categorySelections, int roundTime){
    Hackathon hackathon = new Hackathon(null, eventName, eventDate, categorySelections, roundTime)
    hackathon.setHackathonEventId(addHackathonEventViaRest(hackathon))

    hackathon
}

public void parseCategories(File file, Hackathon hackathon) {
    file.eachLine {
        Category category = new Category(null, it, hackathon.getHackathonEventId())
        category.setHackathonCategoryId(addCategoryViaRest(category))

        category
    }
}

public void parseTeams(File file, Hackathon hackathon) {
    int lineCount = 0;

    file.eachLine {

        if(lineCount!=0){
            String[] columns = it.split("\t")

            Team team = new Team(null, lineCount + "", columns[0], hackathon.getHackathonEventId(), null, "2")
            team.setTeamId(addTeamViaRest(team))

            if(StringUtils.isNotEmpty(team.getTeamId())){
                //Team Member 1
                if(StringUtils.isNotEmpty(columns[5])){
                    TeamMember teamMember = new TeamMember(null, columns[5], team.getTeamId(), columns[11])
                    teamMember.setTeamMemberId(addTeamMemberViaRest(team, teamMember))
                }

                //Team Member 2
                if(StringUtils.isNotEmpty(columns[7])){
                    TeamMember teamMember = new TeamMember(null, columns[7], team.getTeamId(), columns[11])
                    teamMember.setTeamMemberId(addTeamMemberViaRest(team, teamMember))
                }

                //Team Member 3
                if(StringUtils.isNotEmpty(columns[9])){
                    TeamMember teamMember = new TeamMember(null, columns[9], team.getTeamId(), columns[11])
                    teamMember.setTeamMemberId(addTeamMemberViaRest(team, teamMember))
                }
            } else {
                println("Could not add Team " + team.getTeamName())
            }
        }

        lineCount++
    }
}

public String addTeamViaRest(Team team){

    def httpBuilder = new HTTPBuilder("http://instahackathon.elasticbeanstalk.com/")

    httpBuilder.post(body: team.toJsonMap(), path: "hackathon/" + team.getHackathonEventId() + "/team/add", requestContentType: ContentType.JSON) { resp, json ->

        if (resp.statusLine.statusCode == 200) {
            JSONObject jsonObject = json;
            String teamId = jsonObject.get("teamId")

            teamId
        }
        else {
            null
        }
    }
}

public String addTeamMemberViaRest(Team team, TeamMember teamMember){

    def httpBuilder = new HTTPBuilder("http://instahackathon.elasticbeanstalk.com/")

    httpBuilder.post(body: teamMember.toJsonMap(), path: "hackathon/" + team.getHackathonEventId() + "/team/" + team.getTeamId() + "/member/add", requestContentType: ContentType.JSON) { resp, json ->

        if (resp.statusLine.statusCode == 200) {
            JSONObject jsonObject = json;
            String teamMemberId = jsonObject.get("teamMemberId")

            teamMemberId
        }
        else {
            null
        }
    }
}

public String addCategoryViaRest(Category category){

    def httpBuilder = new HTTPBuilder("http://instahackathon.elasticbeanstalk.com/")

    httpBuilder.post(body: category.toJsonMap(), path: "hackathon/" + category.getHackathonEventId() + "/category/add", requestContentType: ContentType.JSON) { resp, json ->

        if (resp.statusLine.statusCode == 200) {
            JSONObject jsonObject = json;
            String teamMemberId = jsonObject.get("teamMemberId")

            teamMemberId
        }
        else {
            null
        }
    }
}

public String addHackathonEventViaRest(Hackathon hackathon) {

    def httpBuilder = new HTTPBuilder("http://instahackathon.elasticbeanstalk.com/")

    httpBuilder.post(body: hackathon.toJsonMap(), path: "hackathon/add", requestContentType: ContentType.JSON) { resp, json ->

        if (resp.statusLine.statusCode == 200) {
            JSONObject jsonObject = json;
            String hackathonEventId = jsonObject.get("hackathonEventId")

            hackathonEventId
        }
        else {
            null
        }
    }
}