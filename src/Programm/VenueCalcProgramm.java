package Programm;


	import java.io.IOException;
	import java.util.InputMismatchException;
	import java.util.Locale;
	import java.util.Scanner; // импортируемые библиотеки

	public class VenueCalcProgramm
	{
		// метод main – точка начала выполнения программы
		public static void main(String[] args) throws NumberFormatException, IOException
		{
			Scanner sc = new Scanner(System.in); // класс для ввода информации
	        	sc.useLocale(Locale.ENGLISH); // ввод точки вместо запятой для вещественных чисел

			double Width = 0;             
			double Length = 0;      
			double Number = 0;
			
			try // попытаться выполнить следующий код
			{
				System.out.print("Enter the width of the bus: ");
				Width = sc.nextDouble();

				System.out.print("Enter the length of the bus: ");
				Length = sc.nextDouble();

				System.out.print("Enter the number: ");
				Number = sc.nextDouble();
			}
			catch(InputMismatchException e) // в случае исключения
			{
				System.out.println("Invalid input. Please, try again.");
				sc.close();
				
				return;
			}
			
			// создание экземпляра класса FuelCalcBL
			VenueCalcBL fc = new VenueCalcBL(Width, Length, Number);

			System.out.println("--------------------------------");
			System.out.println("Total Area Of Storage: " + String.format("%.2f",fc.TotalAreaOfStorage)+ " square meter");
			System.out.println("Total amount: " + String.format("%.2f", fc.TotalSum)+ " square meter");
			
			sc.close(); // освобождение ресурсов
		}

}

