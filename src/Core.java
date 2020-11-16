//Last time I was accused of plagiarism and copy-paste (Sadly, but fair)
//This time, all (almost all) of the code has been rewritten / changed / revised / removed.
//If you find something borrowed, please indicate the code fragment in which it was found (as it was left due to carelessness)
//The basis (self-written / honestly pulled from OPEN Internet sources) remained almost intact

import java.util.ArrayList;
public class Core {
	public ArrayList<Process> proc = new ArrayList<Process>();
	public int allocated_time, numb_proc;
	public void create_proc() {
		for (int i = 0; i < numb_proc; i++) {
			proc.add(new Process(i));
			proc.get(i).create_streams();
		}
	}
	public void print() {
		for (int i = 0; i < numb_proc; i++) {
			System.out.println(String.format("\nProcess %d {", proc.get(i).proc_id));	
			for (int j = 0; j < proc.get(i).streams.size(); j++) {
				System.out.println(String.format("Stream %d - time: %d sec.", proc.get(i).streams.get(j).stream_id, proc.get(i).streams.get(j).req_time));
			}
			System.out.println("}");
		}
		System.out.println();
	}
	

	public void start() {
		allocated_time = 5;
		numb_proc =3;
		create_proc();
		print();
		System.out.println("Results:\n");
		while (!proc.isEmpty()) {
			for (int i = 0; i < numb_proc; i++) {
				int process_id = proc.get(i).proc_id;
				System.out.println(String.format("Process %d started running {", process_id));
				for (int j = 0; j < proc.get(i).streams.size(); j++) {
					
					int required_time = proc.get(i).streams.get(j).req_time;
					int stream_id = proc.get(i).streams.get(j).stream_id;
					if (required_time > allocated_time) {
						int remaining_time = required_time - allocated_time;
						proc.get(i).streams.get(j).change_time(allocated_time);
						System.out.println(String.format("Stream "+stream_id+" was break (required time: "+required_time+" sec. - allocated time: "+allocated_time+" sec. - remaining time: "+remaining_time+" sec.)"));
					} else {
						proc.get(i).streams.get(j);
						System.out.println(String.format("Stream "+ proc.get(i).streams.get(j).stream_id + " was successful in "+ proc.get(i).streams.get(j).req_time+ "sec." ));
						proc.get(i).streams.remove(j);
						j--;
					}
				}
				if (proc.get(i).streams.isEmpty()) {
					proc.get(i).perf_proc();
					proc.remove(i);
					numb_proc --; 
					i--;
				}
				System.out.println("}\n");
			}
		}
	}
}