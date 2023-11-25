import java.util.ArrayList;

class Users{
	private int user_id;
	private String userName;
	private String userPhoneNo;
	private String userCountry;
	private String userEmail;
	
	public Users(int user_id, String userName, String userPhoneNo, String userCountry, String userEmail) {
		this.user_id = user_id;
		this.userName = userName;
		this.userPhoneNo = userPhoneNo;
		this.userCountry = userCountry;
		this.userEmail = userEmail;
	}
	//getters
	public int getuser_id(){
		return user_id;	
	}
	
	public String getuserName() {
		return userName;
	}
	
	public String getuserPhoneNo() {
		return userPhoneNo;
	}
	
	public String getuserCountry() {
		return userCountry;
	}
	
	public String getuserEmail() {
		return userEmail;
	}
}

class Posts{
	private int post_id;
	private String postName;
	private String postType;
	private String postDescription;
	private String publishedDate;
	
	public Posts(int post_id, String postName, String postType, String postDescription, String publishedDate) {
		this.post_id = post_id;
		this.postName = postName;
		this.postType = postType;
		this.postDescription = postDescription;
		this.publishedDate = publishedDate;
	}
	//getters
	public int getpost_id() {
		return post_id;
	}
	
	public String getpostName() {
		return postName;
	}
	
	public String getpostType() {
		return postType;
	}
	
	public String getpostDescription() {
		return postDescription;
	}
	
	public String getpublishedDate() {
		return publishedDate;
	}
}

class Tags{
	private int tag_id;
	private String tagData;
	public Tags(int tag_id, String tagData) {
		this.tag_id = tag_id;
		this.tagData = tagData;
	}
	
	public int gettag_id() {
		return tag_id;
	}
	
	public String gettagData() {
		return tagData;
	}
}

class Comments{
	private int comment_id;
	private int commentingUsers;
	private String commentData;
	
	public Comments(int comment_id, int commentingUsers, String commentData) {
		this.comment_id = comment_id;
		this.commentingUsers = commentingUsers;
		this.commentData = commentData;
	}
	
	public int getcomment_id(){
		return comment_id;
	}
	
	public int getcommentingUser(){
		return commentingUsers;
	}
	
	public String getcommentData() {
		return commentData;
	}
}

class Likes{
	private int like_id;
	
	public Likes(int like_id) {
		this.like_id = like_id;
	}
	
	public int getlike_id() {
		return like_id;
	}
}

class ReferenceKeysForBlogForge {
	private ArrayList<Users> InformationAboutUsers;
	private ArrayList<Posts> InformationAboutPosts;
	private ArrayList<Tags> InformationAboutTags;
	private ArrayList<Comments> InformationAboutComments;
	private ArrayList<Likes> InformationAboutLikes;

	
	public ReferenceKeysForBlogForge(ArrayList<Users> InformationAboutUsers, ArrayList<Posts> InformationAboutPosts, ArrayList<Tags> InformationAboutTags, ArrayList<Comments> InformationAboutComments, ArrayList<Likes> InformationAboutLikes) {
		this.InformationAboutUsers  = InformationAboutUsers;
		this.InformationAboutPosts  = InformationAboutPosts;
		this.InformationAboutTags  = InformationAboutTags;
		this.InformationAboutComments  = InformationAboutComments;
		this.InformationAboutLikes  = InformationAboutLikes;
	}
	
	public ArrayList<Users> gettingUserdetails() {
		return InformationAboutUsers ;
	}
	
	public ArrayList<Posts> gettingPostdetails() {
		return InformationAboutPosts ;
	}
	
	public ArrayList<Tags> gettingTagdetails() {
		return InformationAboutTags ;
	}
	
	public ArrayList<Comments> gettingCommentdetails() {
		return InformationAboutComments ;
	}
	
	public ArrayList<Likes> gettingLikedetails() {
		return InformationAboutLikes ;
	}


}

public class BlogForge{
	public static void main(String args[]) {
		System.out.println("Implementing CRUD operations in ArrayList!!");
		System.out.println();
		ArrayList<Users> InformationAboutUsers = new ArrayList<Users>();
		//CREATE
		InformationAboutUsers .add(new Users(101,"Ranjith","7695831081","India","ranjithv@gmail.com"));
		InformationAboutUsers .add(new Users(102,"Vasuki","7904792229","India","vasukir@gmail.com"));
		
		ArrayList<Posts> InformationAboutPosts = new ArrayList<Posts>();
		InformationAboutPosts.add(new Posts(201, "Cricket", "Sports", "VictoryDay!!","10/11/2023"));
		InformationAboutPosts.add(new Posts(202, "Rainy", "Weather", "RainyDay!!","23/11/2023"));
		
		ArrayList<Tags> InformationAboutTags = new ArrayList<Tags>();
		InformationAboutTags.add(new Tags(301,"#cricket#goodDay#MatchDay#Happy"));
		InformationAboutTags.add(new Tags(302,"#rain#coldDrops#coffeetime#Happy"));
		
		ArrayList<Comments> InformationAboutComments = new ArrayList<Comments>();
		InformationAboutComments.add(new Comments(401,102,"GreatRanjith!!"));
		InformationAboutComments.add(new Comments(402,107,"RainWithCoffee!"));
		InformationAboutComments.add(new Comments(402,101,"Haha!"));
		InformationAboutComments.add(new Comments(401,109,"Wow"));
		

		ArrayList<Likes> InformationAboutLikes = new ArrayList<Likes>();
		InformationAboutLikes.add(new Likes(102));
		InformationAboutLikes.add(new Likes(111));
		InformationAboutLikes.add(new Likes(107));
		InformationAboutLikes.add(new Likes(109));
		InformationAboutLikes.add(new Likes(103));
		
		System.out.println("Records Created Successfully");
		System.out.println();
		
		ReferenceKeysForBlogForge blogForgeKeys = new ReferenceKeysForBlogForge(InformationAboutUsers,
				InformationAboutPosts, InformationAboutTags, InformationAboutComments, InformationAboutLikes);
		
		ArrayList<Users> listOfUsers = blogForgeKeys.gettingUserdetails();
		//READ
		System.out.println("$$ Records for Users class $$");
		for(Users user : listOfUsers) {
			System.out.println(user.getuser_id() + " " + user.getuserName() + " " + user.getuserPhoneNo() + " " + user.getuserCountry() + " " + user.getuserEmail());
			
		}
		System.out.println();
		
		ArrayList<Posts> listOfPosts = blogForgeKeys.gettingPostdetails();
		System.out.println("$$ Records for Posts class $$");
		for(Posts post : listOfPosts) {
			System.out.println(post.getpost_id() + " " + post.getpostName() + " " + post.getpostType() + " " + post.getpostDescription() + " " + post.getpublishedDate());
			
		}
		System.out.println();
		
		ArrayList<Tags> listOfTags = blogForgeKeys.gettingTagdetails();
		System.out.println("$$ Records for Tags class $$");
		for(Tags tag : listOfTags) {
			System.out.println(tag.gettag_id() + " " + tag.gettagData());		}
		System.out.println();
		
		ArrayList<Comments> listOfComments = blogForgeKeys.gettingCommentdetails();
		System.out.println("$$ Records for Comments class $$");
		for(Comments comment : listOfComments) {
			System.out.println(comment.getcomment_id() + " " + comment.getcommentingUser() + " " + comment.getcommentData());	
		}
		System.out.println();
		
		ArrayList<Likes> listOfLikes = blogForgeKeys.gettingLikedetails();
		System.out.println("$$ Records for Likes class $$");
		for(Likes like : listOfLikes) {
			System.out.println(like.getlike_id());
			
		}
		System.out.println();
		System.out.println("Records are Read successfully");
		System.out.println();
		
		
		

		//UPDATE
		for(int i = 0; i < InformationAboutComments.size(); i++) {
			if(InformationAboutComments.get(i).getcomment_id() == 401 && InformationAboutComments.get(i).getcommentingUser() == 109) {
				  Comments updatedComment = new Comments(401, 109, "Fantastic man!");
			        InformationAboutComments.set(i, updatedComment);
			        System.out.println("Updating the comment 'Wow' to 'Fantastic man'");
			        System.out.println("Updated row successfully");
			       
			        
			}
		
		}
		 System.out.println();

		
		//DELETE
		for(int i = 0; i < InformationAboutLikes.size(); i++) {
			if(InformationAboutLikes.get(i).getlike_id() == 103) {
				InformationAboutLikes.remove(i);
				System.out.println("Removing the likeid '103' from the Like list");
				System.out.println("Removed row Successfully");
			}
		}

	
		
	}
}







