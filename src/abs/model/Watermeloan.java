package abs.model;

public class Watermeloan extends Food
{
	private boolean isSeedy;
	
	public Watermeloan()
	{
		super("A not very seedy watermeloan");
	}
	
	public boolean isSeedy()
	{
		return isSeedy;
	}
	
	public void setSeedy(boolean isSeedy)
	{
		this.isSeedy = isSeedy;
	}
}
