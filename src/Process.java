import java.util.ArrayList;
import java.util.Random;

public class Process {
	public int proc_id, all_time = 0;
	public ArrayList<Stream> streams = new ArrayList<Stream>();
	public Random rand = new Random();
	public Process(int process_id) {
		this.proc_id = process_id;
	}


	public void create_streams() {
		for (int i = 0; i < rand.nextInt(10) + 1; i++) {
			int time = rand.nextInt(10) + 1;
			streams.add(new Stream(i, time));
			all_time += time;
		}
	}
	public void perf_proc() {
		System.out.println(String.format("Process " + proc_id + " was successful in "+all_time+" sec."));
	}
}