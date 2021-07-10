
public class FoodOrderApp {

	public static void main(String[] args) {
		// DATA layer (order)
		String clientName = "John Doe";
		String clientAddress = "NY, 99, Empty Street";
		String clientCurrency = "MDL";
		String clientOrderDateAndTime = "10 July 2020, 20:03";
		int clientOrderId = 123456789;
		
		int invoiceId = 1234123;
		String deliveryName = "Rick Astley";
		
		// 1 dish
		final String food_1_name = "Pizza Quattro Stagioni";
		float food_1_price = 75.00f;
		byte food_1_quantity = 2;
		
		// 2 dish
		final String food_2_name = "Soup";
		float food_2_price = 25.50f;
		byte food_2_quantity = 1;
		
		// 3 desert
		final String desert_3_name = "Tiramisu";
		float desert_3_price = 55.75f;
		byte desert_3_quantity = 3;
		
		// 4 drink
		final String drink_4_name = "Wine";
		float drink_4_price = 500.00f;
		byte drink_4_quantity = 1;
				
		
		// CALCULATIONS / LOGIC layer
		float food_1_total = food_1_quantity * food_1_price;
		float food_2_total = food_2_quantity * food_2_price;
		float desert_3_total = desert_3_quantity * desert_3_price;
		float drink_4_total = drink_4_quantity * drink_4_price;
		
		int quantityOrderedProducts = food_1_quantity + food_2_quantity + desert_3_quantity + drink_4_quantity;
		float total = food_1_total + food_2_total + desert_3_total + drink_4_total;
		
		//TEMPLATE / OUTPUT layer
		System.out.printf("############### INVOICE No. (%d) ###############\n", invoiceId);
		System.out.println("############### ORDER No. (" + clientOrderId + ") ###############");
		System.out.printf("1. \"%23s\" x %3d = \"%9.2f %s\"\n", food_1_name, food_1_quantity, food_1_total, clientCurrency);
		System.out.printf("2. \"%23s\" x %3d = \"%9.2f %s\"\n", food_2_name, food_2_quantity, food_2_total, clientCurrency);
		System.out.printf("3. \"%23s\" x %3d = \"%9.2f %s\"\n", desert_3_name, desert_3_quantity, desert_3_total, clientCurrency);
		System.out.printf("4. \"%23s\" x %3d = \"%9.2f %s\"\n", drink_4_name, drink_4_quantity, drink_4_total, clientCurrency);
		System.out.println("-----------------------------------------------------");
		System.out.printf("Full Name: %40s\n", clientName);
		System.out.printf("Address of delivery: %30s\n", clientAddress);
		System.out.printf("Order Date: %39s\n", clientOrderDateAndTime);
		System.out.printf("QUANTITY OF ORDERED PRODUCTS: %21d \n", quantityOrderedProducts);
		System.out.printf("TOTAL: %40.2f %s \n", total, clientCurrency);
		System.out.println("#####################################################");
		System.out.printf("Delivery by: %38s\n", deliveryName);
		System.out.println("-----------------------------------------------------");
		System.out.println("#####################*THANK-YOU*#####################");

	}

}
