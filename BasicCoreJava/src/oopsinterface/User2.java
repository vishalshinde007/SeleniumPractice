package oopsinterface;

public class User2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI acc=bankfeature("ICICI");
		acc.creditcard();
		acc.debitcard();
		acc.savingaccount();
		acc.netbanking();
		acc.demonetization();
		
		SC.RBIGuideline();
				
				
				
				
				
}
	
	public static RBI bankfeature(String bankname)
	{
		
RBI acc = null;
		
		if(bankname.equalsIgnoreCase("HDFC"))
		{
			acc=new HDFC();
		}else if (bankname.equalsIgnoreCase("ICICI"))
		{
			acc=new ICICI();
		}else if(bankname.equalsIgnoreCase("Axis"))
		{
			acc=new Axis();
		}
		
		return acc;
		
	}

}
