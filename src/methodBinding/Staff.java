package methodBinding;

public class Staff extends User {
    public int id = 2;
    public String userType;
    public void printId() {
        System.out.println("id: " + id);
        System.out.println("super.id: " + super.id);
    }
    public Staff(){
        userType = "Staff";
        System.out.println("Staff constructor 1");
    }
    public Staff(int id){
        this();
        this.id = id;
        System.out.println("Staff constructor 2 ");
    }

    public void printUserType() {
        System.out.println("Staff");
    }

    public Review postAReview(String reviewText) {
        System.out.println("Staff: postAReview");
        Review review = super.postAReview(reviewText);
        review.setApproved(true);
        return review;
    }

    public void instanceMethod(int d) {
        System.out.println("Staff: instanceMethod");
    }
    public void instanceMethod(Staff d) {
        System.out.println("Staff: instanceMethod");
    }
}