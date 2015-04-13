import java.net.Socket;


public abstract class clientHelperThread extends Thread
{
	protected int[] theFileArray;
	protected ClientCommunicationProtocol ccp;
	
	clientHelperThread(int[] theFileArray, ClientCommunicationProtocol ccp)
	{
		this.theFileArray = theFileArray;
		this.ccp = ccp;
	}
}
