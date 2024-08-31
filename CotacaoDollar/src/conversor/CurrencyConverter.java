package conversor;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double converte(double price, double quantity) { //Passei os PARAMETROS para a função trabalhar. O que ela vai usar  PRICE e Quantity
		return price * quantity + IOF * (price * quantity);
	}

}
