package org.vorpinator.football.adp

import org.vorpinator.football.model.AverageDraftPosition

/**
 * User: Dayel Ostraco
 * Date: 7/18/12
 * Time: 9:53 PM
 */
class AdpParser {

    private static final ADP_SOURCE_URL = "http://fantasyfootballcalculator.com/adp_csv.php?teams="

    public static List<AverageDraftPosition> getAdpForLeague(Integer leagueSize, String adpSource, Date importDate){

        List<AverageDraftPosition> leagueAdp = new ArrayList<AverageDraftPosition>()
        (ADP_SOURCE_URL+leagueSize.toString()).toURL().eachLine {
            if(it!=null && it.length()>0 && it.substring(0,1).isNumber()){
                String[] data = it.split(",")
                String adp = data[0]
                String overallPosition = data[1]
                String firstName = data[2].substring(0, data[2].indexOf(" "))
                String lastName = data[2].substring(data[2].indexOf(" ")+1, data[2].length())
                String position = data[3]
                String team = data[4]
                String timesDrafted = data[5]
                String byeWeek = data[6]

                leagueAdp.add(new AverageDraftPosition(leagueSize.toString(), adp, overallPosition, firstName, lastName,
                        position, team, timesDrafted, byeWeek, adpSource, importDate))
            }
        }

        leagueAdp
    }

    public static List<AverageDraftPosition> getAdpForLeagues(String sourceName){
        List<AverageDraftPosition> allLeagueAdps = new ArrayList<AverageDraftPosition>()
        Date importDate = new Date()
        AdpLeagueSize.values().each {
            allLeagueAdps.addAll(getAdpForLeague(it.value, sourceName, importDate))
        }

        allLeagueAdps
    }
}