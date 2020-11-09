import java.util.ArrayList;

public class Core {
	private ArrayList<Process> processes = new ArrayList<Process>();
	private int allocated_time, number_prococesses;
	public void set_time(int time) {
		if(time > 0) 
			allocated_time = time;
		else 
			end();
	}
	public void set_number_process(int number) {
		if(number > 0) 
			number_prococesses = number;
		else 
			end();
	}
	public void end() {
		
		
		System.out.println("Incorrect input");
		System.exit(0);
	}
	public void create_processes() {
		for (int i = 0; i < number_prococesses; i++) {
			processes.add(new Process(i));
			processes.get(i).create_streams();
		}
	}
	public void print() {
		for (int i = 0; i < number_prococesses; i++) {
			System.out.println(String.format("\nProcess %d {", processes.get(i).get_process_id()));
			
			for (int j = 0; j < processes.get(i).get_streams().size(); j++) {
				System.out.println(String.format("Stream %d - time: %d sec.", processes.get(i).get_streams().get(j).get_stream_id(), processes.get(i).get_streams().get(j).get_required_time()));
			}
			System.out.println("}");
		}
		System.out.println();
	}
	
	
	public void planner() {
		System.out.println("Results:\n");
		while (!processes.isEmpty()) {
			for (int i = 0; i < number_prococesses; i++) {
				int process_id = processes.get(i).get_process_id();
				System.out.println(String.format("Process %d started running {", process_id));
				for (int j = 0; j < processes.get(i).get_streams().size(); j++) {
					int stream_id = processes.get(i).get_streams().get(j).get_stream_id();
					int required_time = processes.get(i).get_streams().get(j).get_required_time();
					if (required_time > allocated_time) {
						int remaining_time = required_time - allocated_time;
						processes.get(i).get_streams().get(j).change_time(allocated_time);
						System.out.println(String.format("Stream "+stream_id+" was break (required time: "+required_time+" sec. - allocated time: "+allocated_time+" sec. - remaining time: "+remaining_time+" sec.)"));
					} else {
						processes.get(i).get_streams().get(j).perform_stream();
						processes.get(i).get_streams().remove(j);
						j--;
					}
				}
				if (processes.get(i).get_streams().isEmpty()) {
					processes.get(i).perform_process();
					processes.remove(i);
					number_prococesses --; 
					i--;
				}
				System.out.println("}\n");
			}
		}
	}
}