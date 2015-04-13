import java.net.Socket;


public class fileFillThread extends clientHelperThread
{
	String theFileName;
	public fileFillThread(int[] theFileArray, ClientCommunicationProtocol ccp, String theFileName)
	{
		super(theFileArray, ccp);
		this.theFileName = theFileName;
	}
	
	public void run()
	{
		//this guy constantly tries to fill the byte array for the
		//receiving file
		//*****Write Code HERE****
		for(int i = 0; i < super.theFileArray.length; i++)
		{
			super.ccp.getServerOutput(i + "");
			super.theFileArray[i] = Integer.parseInt(super.ccp.getServerInput());
		}
		super.ccp.getServerOutput("-1");
		
		
	}
}
