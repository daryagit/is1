package Programm;

public class VenueCalcBL {

	private double Width = 0; // Ширина автобуса             
	private double Length = 0; // Длина автобуса      
	private double Number = 0; // Количество автобусов             
	
	public double TotalAreaOfStorage; // требуемое количество места под 1 автобус  
	public double TotalSum; // итоговая сумма              
	
	public VenueCalcBL(double Width, double Length, double Number)
	{
		if (Width <= 0 || Length <= 0 || Number <= 0 )
		{
			TotalAreaOfStorage = 0;
			TotalSum = 0;
		}
		else
		{
			this.Width = Width;
			this.Length = Length;
			this.Number = Number;
			
			Calculate();
		}
	}
	
	private void Calculate() // метод расчетов количества и суммы
	{
		TotalAreaOfStorage = Width*Length;
		TotalSum = TotalAreaOfStorage * Number;
	}
}