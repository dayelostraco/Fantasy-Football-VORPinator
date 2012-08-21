package org.vorpinator.football.instahackathon

/**
 * User: Dayel Ostraco
 * Date: 8/21/12
 * Time: 4:56 PM
 */
class Hackathon {

    private String hackathonEventId;
    private String eventName;
    private Date eventDate;
    private int categorySelections;
    private int roundTimeSeconds;

    Hackathon(String hackathonEventId, String eventName, Date eventDate, int categorySelections, int roundTimeSeconds) {
        this.hackathonEventId = hackathonEventId
        this.eventName = eventName
        this.eventDate = eventDate
        this.categorySelections = categorySelections
        this.roundTimeSeconds = roundTimeSeconds
    }

    String getHackathonEventId() {
        return hackathonEventId
    }

    void setHackathonEventId(String hackathonEventId) {
        this.hackathonEventId = hackathonEventId
    }

    String getEventName() {
        return eventName
    }

    void setEventName(String eventName) {
        this.eventName = eventName
    }

    Date getEventDate() {
        return eventDate
    }

    void setEventDate(Date eventDate) {
        this.eventDate = eventDate
    }

    int getCategorySelections() {
        return categorySelections
    }

    void setCategorySelections(int categorySelections) {
        this.categorySelections = categorySelections
    }

    int getRoundTimeSeconds() {
        return roundTimeSeconds
    }

    void setRoundTimeSeconds(int roundTimeSeconds) {
        this.roundTimeSeconds = roundTimeSeconds
    }

    Map<String, Object> toJsonMap(){
        Map<String, Object> jsonMap = new HashMap<String, Object>()
        jsonMap.put("hackathonEventId", hackathonEventId)
        jsonMap.put("eventName", eventName)
        jsonMap.put("eventDate", eventDate.getTime())
        jsonMap.put("categorySelections", categorySelections)
        jsonMap.put("roundTimeSeconds", roundTimeSeconds)

        jsonMap
    }
}
