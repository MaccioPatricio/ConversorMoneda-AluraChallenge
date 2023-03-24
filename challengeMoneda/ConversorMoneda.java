package challengeMoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMoneda {

	public static final double DOLAR_BLUE = 394.00;
	public static final double EURO = 415.00;
	public static final double LIBRA = 387.46;
	public static final double YEN = 0.643934;
	public static final double WON = 6.39;
	public static final double DOLAR_A_PESO = 204.96;
	public static final double EURO_A_PESO = 220.60;
	public static final double LIBRA_A_PESO = 249.75;
	public static final double YEN_A_PESO = 1.55;
	public static final double WON_A_PESO = 0.16;

	private String[] opciones = { "Conversor de moneda", "Conversor de temperatura" };
	private String opcionSeleccionada;

	public ConversorMoneda() {
		menu();
	}

	private void menu() {
		try {
			opcionSeleccionada = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Opciones",
					JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]).toString();
			seleccionConversor();
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			return;
		}
	}

	private void seleccionConversor() {

		switch (opcionSeleccionada) {
		case "Conversor de moneda":
			opcionMoneda();
			break;
		case "Conversor de temperatura":
			opcionTemperatura();
			break;
		}

	}

	public void opcionMoneda() {

		try {
			double inputMoneda = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir: ",
							"Conversor de moneda", JOptionPane.PLAIN_MESSAGE));
			DecimalFormat formato = new DecimalFormat("#.##");
			String inputFormateado;

			String[] opciones2 = { "De pesos a Dólar", "De pesos a Euros", "De pesos a Libras Esterlinas",
					"De pesos a Yen Japónes", "De pesos a Won coreano", "De Dólar a pesos", "De Euros a pesos",
					"De Libras Esterlinas a pesos", "De Yen Japones a Pesos", "De Won coreano a pesos" };

			String opcionMoneda = JOptionPane.showInputDialog(null, "Monedas", "Opciones", JOptionPane.PLAIN_MESSAGE,
					null, opciones2, opciones2[0]).toString();

			switch (opcionMoneda) {
			case "De pesos a Dólar":
				inputMoneda = inputMoneda / DOLAR_BLUE;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " Dolares");
				break;
			case "De pesos a Euros":
				inputMoneda = inputMoneda / EURO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " Euros");
				break;
			case "De pesos a Libras Esterlinas":
				inputMoneda = inputMoneda / LIBRA;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " Libras Esterlinas");
				break;
			case "De pesos a Yen Japónes":
				inputMoneda = inputMoneda / YEN;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " Yenes");
				break;
			case "De pesos a Won coreano":
				inputMoneda = inputMoneda / WON;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " Yenes");
				break;
			case "De Dólar a pesos":
				inputMoneda = inputMoneda * DOLAR_A_PESO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " pesos");
				break;
			case "De Euros a pesos":
				inputMoneda = inputMoneda * EURO_A_PESO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " pesos");
				break;
			case "De Libras Esterlinas a pesos":
				inputMoneda = inputMoneda * LIBRA_A_PESO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " pesos");
				break;
			case "De Yen Japones a Pesos":
				inputMoneda = inputMoneda * YEN_A_PESO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " pesos");
				break;
			case "De Won coreano a pesos":
				inputMoneda = inputMoneda * WON_A_PESO;
				inputFormateado = formato.format(inputMoneda);
				JOptionPane.showMessageDialog(null, "Tienes :" + inputFormateado + " pesos");
				break;
			}

			continuar();

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor introducido no es válido. Introduzca un número.", "Error",
					JOptionPane.ERROR_MESSAGE);
			opcionMoneda();
			return;
		}

	}

	public void opcionTemperatura() {

		try {
			double inputTemperatura = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Ingresa el valor de la temperatura que deseas convertir: ",
							"Conversor de temperatura", JOptionPane.PLAIN_MESSAGE));
			double temperaturaAnterior = inputTemperatura;
			DecimalFormat formato = new DecimalFormat("#.##");
			String inputFormateado;

			String[] opcionesGrados = { "De Grados Celsius a Fahrenheit", "De Grados Celsius a Kelvin",
					"De Grados Fahrenheit a Celsius", "De Grados Fahrenheit a kelvin", "De Grados kelvin a Celsius",
					"De Grados kelvin a Fahrenheit" };

			String opcionTemperatura = JOptionPane.showInputDialog(null, "Temperaturas", "Opciones",
					JOptionPane.PLAIN_MESSAGE, null, opcionesGrados, opcionesGrados[0]).toString();

			switch (opcionTemperatura) {

			case "De Grados Celsius a Fahrenheit":
				inputTemperatura = (inputTemperatura * 1.8) + 32;
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Celsius son : " + inputFormateado + " Grados Fahrenheit");
				break;
			case "De Grados Celsius a Kelvin":
				inputTemperatura = (inputTemperatura + 273.15);
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Celsius son : " + inputFormateado + " Grados Kelvin");
				break;
			case "De Grados Fahrenheit a Celsius":
				inputTemperatura = (inputTemperatura - 32) / 1.8;
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Fahrenheit son : " + inputFormateado + " Grados Celsius");
				break;
			case "De Grados Fahrenheit a kelvin":
				inputTemperatura = (inputTemperatura + 459.67) / 1.8;
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Fahrenheit son : " + inputFormateado + " Grados Kelvin");
				break;
			case "De Grados kelvin a Celsius":
				inputTemperatura = inputTemperatura - 273.15;
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Kelvin son : " + inputFormateado + " Grados Celsius");
				break;
			case "De Grados kelvin a Fahrenheit":
				inputTemperatura = inputTemperatura * 1.8 - 459.67;
				inputFormateado = formato.format(inputTemperatura);
				JOptionPane.showMessageDialog(null,
						temperaturaAnterior + " Grados Kelvin son : " + inputFormateado + " Grados Fahrenheit");
				break;
			}

			continuar();

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor introducido no es válido. Introduzca un número.", "Error",
					JOptionPane.ERROR_MESSAGE);
			opcionTemperatura();
			return;
		}

	}

	
	public void continuar() {
		int opcionConfirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		if (opcionConfirmacion == 0) {
			menu();
		} else
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		
	}

	public String[] getOpciones() {
		return getOpciones();
	}

	public String getOpcionSeleccionada() {
		return getOpcionSeleccionada();
	}


}
