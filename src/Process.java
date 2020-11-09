import java.util.ArrayList;
import java.util.Random;

public class Process {
	private int process_id, all_time = 0;
	private ArrayList<Stream> streams = new ArrayList<Stream>();
	private Random rand = new Random();
	public Process(int process_id) {
		this.process_id = process_id;
	}
	public int get_process_id() {
		return process_id;
	}
	public ArrayList<Stream> get_streams(){
		return streams;
	}
	public void create_streams() {
		for (int i = 0; i < rand.nextInt(10) + 1; i++) {
			int time = rand.nextInt(10) + 1;
			streams.add(new Stream(i, time));
			all_time += time;
		}
	}
	public void perform_process() {
		System.out.println(String.format("Process " + process_id + " was successful in "+all_time+" sec."));
	}
}