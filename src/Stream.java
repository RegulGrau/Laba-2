//If You don't read Readme, please, could You read them?

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