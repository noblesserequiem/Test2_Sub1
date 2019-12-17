package Test_Sub1;

public class Local {
	private String restaurant, specific, zona;
	public Local(String rest, String spec, String zona)
	{
		this.restaurant = rest;
		this.specific = spec;
		this.zona = zona;
	}
	public String getRestaurant()
	{
		return this.restaurant;
	}
	public String getSpecific()
	{
		return this.specific;
	}
	public String getZona()
	{
		return this.zona;
	}
	public void setRestaurant(String new_restaurant)
	{
		this.restaurant = new_restaurant;
	}
	public void setSpecific(String new_specific)
	{
		this.specific = new_specific;
	}
	public void setZona(String new_zona)
	{
		this.zona = new_zona;
	}
	
	public String toString()
	{
		return "Restaurant: " + this.restaurant + "\nSpecific: " + this.specific + "\nZona: " + this.zona;
	}
	
}
