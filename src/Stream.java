public class Stream {
    private int stream_id, required_time;
    public Stream (int stream_id, int required_time) {
    	this.required_time = required_time;
        this.stream_id = stream_id;   
    }
    public int get_stream_id() {
        return stream_id;
    }
    public int get_required_time() {
        return required_time;
    }
    public void change_time(int time){
    	required_time -= time;
    }
    public void perform_stream() {
    	System.out.println(String.format("Stream "+ stream_id + " was successful in "+required_time+ "sec." ));
    }
}