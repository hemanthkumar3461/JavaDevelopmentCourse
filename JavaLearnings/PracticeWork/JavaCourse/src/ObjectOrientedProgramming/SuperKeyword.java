package ObjectOrientedProgramming;


class Video{
	String title;
	int length;
	boolean avail;
	
	public Video(String ttl, int len) {
		title = ttl;
		length = len;
	}
}
class SuperKeyword extends Video {//Movie
	String director;
	String rating;
		public SuperKeyword(String ttl, int len, String dir, String rate) 
		{
			super(ttl,len);
			director = dir;
			rating = rate;
			
		}
		

}
