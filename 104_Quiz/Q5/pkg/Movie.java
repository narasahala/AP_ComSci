package pkg;

public class Movie{
    String movieName;
    double movieRating;
    int numOfRating;
    int movieRevenue;
    public Movie()
    {
        movieName = "Avengers";
        movieRating = 8.0;
        numOfRating = 33;
        movieRevenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        movieRating = b;
        numOfRating = c;
        movieRevenue = d;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return movieRevenue;
    }
    public double getRating(){
        return movieRating;
    }
    public double addRating(double a){
        int numOfRating2 = numOfRating + 1;
        movieRating = (((movieRating*numOfRating) + a)/numOfRating2);
        numOfRating++;
        return movieRating;
    }
    public void movieToString(){
        System.out.println("Movie : " + movieName);
        System.out.println("Rating: " + movieRating);
        System.out.println("Numbr of Ratings: " + numOfRating);
        System.out.println("Movie's Revenue: " + movieRevenue);
        System.out.println("");
    }
    public boolean compareRatings(Movie a){
        if(a.getRating() < getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    public String revenueToString(){
        int a = getRevenue();
        int c;
        int c1;
        int c2;
        int b = 1000000;
        if(a>1000000)
        {
            c = a/b;
            a = a-(c*b);
            c1 = a/1000;
            a = a-(c1*1000);
            c2= a;
            if(c1 == 0 && c2 == 0)
            {
                return(c + "," + c1 + "00" + "," + c2+ "00");
            }
            else if(c1 == 0){
                return(c + "," +c1 + "00," + c2);
            }
            else if(c2 == 0)
            {
                return(c + "," + c1 +","+ c2 + "00");
            }
            return(c +"," + c1 + "," + c2);
        }
        else if(a>1000)
        {
            c1 = a/1000;
            a = a-(c1*1000);
            c2 = a;
            return(c1 + "," + c2);
        }
        else{
            c2 = a;
            return(","+ c2);
        }
}
}
