
public class Program {
		public static ILeaveRequestHandler getChainOfILeaveRequestHandlers() {
			ILeaveRequestHandler hr = new HR();
			ILeaveRequestHandler projectManager = new ProjectManager(hr);
			ILeaveRequestHandler supervisor = new Supervisor(projectManager);
			return supervisor;
		}
		
		public static void main(String[] args) {
			LeaveRequest request1 = new LeaveRequest("Mr. X", 1);
			LeaveRequest request2 = new LeaveRequest("Mr. Y", 2);
			LeaveRequest request3 = new LeaveRequest("Mr. Z", 3);
			LeaveRequest request4 = new LeaveRequest("Mr. W", 4);
			LeaveRequest request5 = new LeaveRequest("Mr. P", 5);
			LeaveRequest request6 = new LeaveRequest("Mr. S", 6);
			ILeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
			handler.handleRequest(request1);
			handler.handleRequest(request2);
			handler.handleRequest(request3);
			handler.handleRequest(request4);
			handler.handleRequest(request5);
			handler.handleRequest(request6);
		}
	}



