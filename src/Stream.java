//Last time I was accused of plagiarism and copy-paste (Sadly, but fair)
//This time, all (almost all) of the code has been rewritten / changed / revised / removed.
//If you find something borrowed, please indicate the code fragment in which it was found (as it was left due to carelessness)
//The basis (self-written / honestly pulled from OPEN Internet sources) remained almost intact

public class Stream {
	public int stream_id;
	public int req_time;
    public Stream (int stream_id, int required_time) {
    	this.req_time = required_time;
        this.stream_id = stream_id;   
    }
    public void change_time(int time){
    	req_time = req_time - time;
    }

}