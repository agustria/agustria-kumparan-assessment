package data;

public class assessmentData {
    private static Integer numberOfLike;
    private static String opiniArticleTitle;
    
    public static Integer getNumberOfLike() {
        return numberOfLike;
    }

    public static void setNumberOfLike(Integer numberOfLike) {
    	assessmentData.numberOfLike = numberOfLike;
    }
    
    public static String getOpiniArticleTitle() {
        return opiniArticleTitle;
    }

    public static void setOpiniArticleTitle(String opiniArticleTitle) {
    	assessmentData.opiniArticleTitle = opiniArticleTitle;
    }
	

}
