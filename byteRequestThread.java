import java.net.Socket;


public class byteRequestThread extends clientHelperThread
{
	public byteRequestThread(int[] theFileArray, ClientCommunicationProtocol ccp)
	{
		super(theFileArray, ccp);
	}
	
	public void run()
	{
		//this guy constantly listens for a request from the server
		//for a certain byte and responds with that byte
		while(true)
		{
			//*****Write Code HERE****
			int whichByte = Integer.parseInt(ccp.getServerInput());
			ccp.getServerOutput(super.theFileArray[whichByte] + "");
			
			
		}
	}
}
