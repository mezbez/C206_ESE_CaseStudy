public class C206_CaseStudy
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int option = 0;
		
		while (option != 3)
		{
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1)
			{
				C206_CaseStudy.showMenuCustomer();
				int customerMenu = Helper.readInt("Enter an option which suits your needs: ");
				
				if (customerMenu == 1)
				{
					System.out.println("customerMenu1");
				}
				else if (customerMenu == 2)
				{
					System.out.println("customerMenu2");
				}
				else
				{
					System.out.println("Invalid option");
				}
			}
			else if(option == 2)
			{
				C206_CaseStudy.showMenuAD();
				int adMenu = Helper.readInt("Enter an option which suit your needs: ");
				
				if (adMenu == 1)
				{
					System.out.println("adMenu1");
				}
				else if (adMenu == 2)
				{
					System.out.println("adMenu2");
				}
				else if (adMenu == 3)
				{
					System.out.println("adMenu3");
				}
				else if (adMenu == 4)
				{
					System.out.println("adMenu4");
				}
				else if (adMenu == 5)
				{
					System.out.println("adMenu5");
				}
				else
				{
					System.out.println("Invalid options");
				}
					
			}
			else if(option == 3)
			{
				System.out.println("Thank you for using Reonvation ACE!!!");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
	}
	
	
	public static void menu()
	{
		C206_CaseStudy.setHeader("RENOVATION ACE APP");
		System.out.println("1. Login as Customer");
		System.out.println("2. Login as Admin/Designers");
		System.out.println("3. Exit");
		Helper.line(80, "-");
	}


	private static void setHeader(String header)
	{
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static void showMenuCustomer()
	{
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Request for Quotation");
		System.out.println("2. Manage Appointment");
	}
	
	public static void showMenuAD()
	{
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
	}
}