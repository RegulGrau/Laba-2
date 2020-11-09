public class Main {

	public static void main(String args[]) {

		Core core = new Core();
		core.set_time(5);
		
		//core.set_time(3);		
		//core.set_number_process(5);
		
		core.set_number_process(3);
		core.create_processes();
		
		
		core.print();
		
		core.planner();
	}
}