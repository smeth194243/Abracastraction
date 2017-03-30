package abs.model;

public class Pizza extends Food implements Tasty
{
	private String pizzaPlace;
	private String flavor;
	
	public Pizza()
	{
		super("3 Meat Treat");
	}
	
	@Override
	public int getTastiness()
	{
		return 9001;
	}
	
	public String getPizzaPlace()
	{
		return pizzaPlace;
	}
	
	public void setPizzaPlace(String pizzaPlace)
	{
		this.pizzaPlace = pizzaPlace;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
	
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}
}
