import java.util.Scanner;
class GSTInformation
 {
    public static void Information() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the GST Information!");
        System.out.println("Choose an option:");
        System.out.println("1. What is GST?");
        System.out.println("2. GST Rates");
        System.out.println("3. Office Overview");
        System.out.println("4. Services Offered");
        System.out.println("5. Team and Experts");
        System.out.println("6. Location and Contact");
        System.out.println("7. Exit");

        int choice = scanner.nextInt();
        
        switch (choice) 
        {
            case 1:
                System.out.println("GST, or Goods and Services Tax, is a consumption tax levied on the supply of goods and services in most countries. It replaces multiple indirect taxes with a single tax.");
                break;
            case 2:
                System.out.println("GST rates vary by country and type of goods or services. In India, for example, there are different GST rates, such as 5%, 12%, 18%, and 28%, depending on the category of goods or services.");
                break;
            case 3:
                System.out.println("Office Overview:");
                System.out.println("The GST Management Office is a government agency responsible for overseeing and regulating the implementation and administration of the Goods and Services Tax.");
                System.out.println("Its main goal is to ensure compliance with GST laws, provide guidance to taxpayers, and manage the collection and distribution of GST revenue.");
                break;
            case 4:
                System.out.println("Services Offered:");
                System.out.println("The GST Management Office offers a range of services to taxpayers, including:");
                System.out.println("- Providing information and resources about GST regulations and compliance.");
                System.out.println("- Assisting in GST registration and filing of GST returns.");
                System.out.println("- Conducting workshops and seminars to educate businesses about GST.");
                break;
            case 5:
                System.out.println("Team and Experts:");
                System.out.println("The GST Management Office is staffed with tax experts, legal professionals, and administrators who are well-versed in GST laws and regulations.");
                System.out.println("They provide guidance, support, and training to businesses and individuals dealing with GST-related matters.");
                break;
            case 6:
                System.out.println("Location and Contact:");
                System.out.println("The GST Management Office is located at [Office Address].");
                System.out.println("For inquiries, you can contact them at [Phone Number] or [Email Address].");
                break;
            case 7:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
    }
}
