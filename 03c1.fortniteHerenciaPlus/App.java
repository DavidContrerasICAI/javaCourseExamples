public class App
{
	static Personaje lista[] = new Personaje[4];

	public static void main(String args[]) 
	{
		Personaje.setISLA("Mi Isla");

		Personaje personaje = new Personaje(50, 50);
		PersonajePremium personajePremium = new PersonajePremium(10, 10, "Platanito");
		personaje = personajePremium; //UPCASTNG
		personajePremium = null;
		System.out.println(personaje.getInfo());
		//ERROR: System.out.println(personaje.getSkins());

		personajePremium = (PersonajePremium) personaje; //DOWNCASTING
		System.out.println(personajePremium.getSkins());
	}
}