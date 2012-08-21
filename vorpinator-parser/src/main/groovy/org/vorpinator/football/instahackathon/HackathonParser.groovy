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
String hackathonEventId = "8a57f6833931012d013949d0570f0000"
File hackathonTeamCsv = new File("/Users/dayelostraco/Desktop/Hackathon Signup.txt")
File hackathonCategoriesCsv = new File("/Users/dayelostraco/Desktop/Hackathon Categories.txt")

parseCategories(hackathonCategoriesCsv, hackathonEventId)
parseTeams(hackathonTeamCsv, hackathonEventId)

public void parseCategories(File file, String hackathonEventId) {
    file.eachLine {
        Category category = new Category(null, it, hackathonEventId)
        category.setHackathonCategoryId(addCategoryViaRest(category))
    }
}

public void parseTeams(File file, String hackathonEventId) {
    int lineCount = 0;

    file.eachLine {

        if(lineCount!=0){
            String[] columns = it.split("\t")

            Team team = new Team(null, lineCount + "", columns[0], hackathonEventId, null, "2")
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