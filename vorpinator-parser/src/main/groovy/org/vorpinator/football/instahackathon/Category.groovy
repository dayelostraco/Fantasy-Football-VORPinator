package org.vorpinator.football.instahackathon

/**
 * User: Dayel Ostraco
 * Date: 8/21/12
 * Time: 4:18 PM
 */
class Category {

    private String hackathonCategoryId;
    private String categoryName;
    private String hackathonEventId;

    Category(String hackathonCategoryId, String categoryName, String hackathonEventId) {
        this.hackathonCategoryId = hackathonCategoryId
        this.categoryName = categoryName
        this.hackathonEventId = hackathonEventId
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

    String getCategoryName() {
        return categoryName
    }

    void setCategoryName(String categoryName) {
        this.categoryName = categoryName
    }

    Map<String, String> toJsonMap(){
        Map<String, String> jsonMap = new HashMap<String, String>()
        jsonMap.put("hackathonCategoryId", hackathonCategoryId)
        jsonMap.put("categoryName", categoryName)
        jsonMap.put("hackathonEventId", hackathonEventId)

        jsonMap
    }
}
