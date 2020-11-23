# Laba-2
Last time I was accused of plagiarism and copy-paste (Sadly, but fair).<br/>
This time, all (almost all) of the code has been rewritten / changed / revised / removed.<br/>
If You find something borrowed, please indicate the code fragment in which it was found (as it was left due to carelessness).<br/>
The basis (self-written / honestly pulled from OPEN Internet sources) remained almost intact.<br/>
If you don't like something in the program, 
I sincerely ask You to say so, even if You no longer want to look at this program.<br/>
Briefly about the program:<br/>
Has four classes<br/>
main - start the program.<br/>
process - creation and termination of processes, access to them.<br/>
stream - creating streams (in processes) and recording their time.<br/>
core - the main crass, stores a dynamic array of processes (which have a dynamic array of threads).<br/>
Can create processes and display a list of current processes in the console (needed because of the randomness of creating processes and threads).<br/>
The "start" function implements a cyclic scheduling algorithm (and some prelaunch preparation, hidden outside main for the user's convenience) (priorities are not supported due to the fact that the task says about the implementation of ANY of the scheduling algorithms, and the unmodified cyclic - the simplest - priorities DOES NOT HAVE).<br/>
The essence of the algorithm is to go through all processes (and in each process through streams) with the cost of no more than a quantum of time for a single pass along the stream.<br/>
If this time is exceeded, the stream saves the remaining time, the process goes on and the stream will be passed through one more time.<br/>
At the end of each process, the total running time of its streams is displayed.<br/>
I confess, for the sake of convenience and at the expense of security, I used public fields instead of private ones. If necessary / desired, this problem can be solved by adding getters (setters if necessary)<br/>
The report on the work of the program has finished.<br/>
Best wishes, <br/>Mikhail Kuzmichev, Student of PIBD-21 group<br/>
