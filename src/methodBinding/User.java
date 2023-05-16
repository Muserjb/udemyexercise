package methodBinding;

public class User {
    public int id = 1;
    public String userType = "User";
    public User(){
        System.out.println("User Constructor ");
    }
    public void displayUserInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "id = " + id +
                ", userType = '" + userType + '\'' +
                '}';
    }

    public void printUserType() {
        System.out.println("User");
    }

    public void saveWebLink() {
        System.out.println("User: saveWebLink");
        //postAReview();
    }
    public Review postAReview(String reviewText) {
        System.out.println("User: postAReview");
        Review review = new Review(reviewText);
        return review;
    }

    // Method binding demo
    public static void staticMethod() {
    }

    public void instanceMethod(double d) {
        System.out.println("User: instanceMethod");
    }
    public void instanceMethod(User u) {
        System.out.println("User: instanceMethod");
    }
}