public class news{
    public static void main(String[] args){
        String[] news = {"How to learn Java really fast",
                         "Listen to Mr Wang",
                         "A day and life as a Java developer",
                         "Java networking effect"};
        String title = "*******************TITLE*******************";
        System.out.println(title.substring(13, 30));
        for(int i = 0; i < news.length; i++){
            if (news[i].length() > 20){
                System.out.println(news[i] + "...");
            }else{
                System.out.println(news[i]);
            }
        }
    }
}