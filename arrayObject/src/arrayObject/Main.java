package arrayObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<carModel> carModels=new ArrayList<carModel>();
		ArrayList<carColor> carColors=new ArrayList<carColor>();
		carColors.add(new carColor("Metalic" , "Black" ));
		carColors.add(new carColor("Metalic" , "Blue" ));
		carColors.add(new carColor("Mat" , "Red" ));
		carColors.add(new carColor("Mat" , "Black" ));
		carColors.add(new carColor("Parliak" , "Black" ));
		
		carModels.add(new carModel("Ford","Focus"));
		carModels.add(new carModel("Renault","Megane"));
		carModels.add(new carModel("Volkswagen","Focus"));
		carModels.add(new carModel("Audi","SQ"));
		
		cars.add(new Car("Focus Max 2018", 245000 ));
		cars.add(new Car("Megan 4", 154000 ));
		cars.add(new Car("Bura", 142000 ));
		cars.add(new Car("Cressida 1998", 352000 ));
		cars.add(new Car("Land Cruiser 2021", 454000 ));
		
		System.out.println(cars.get(0).getCaption());
		System.out.println(cars.get(1).getCaption());
		for(Car car:cars) {
			System.out.println(car.getCaption()+ " Fiyat : "
					 +car.getPrice());
		}
        for(carModel carModel:carModels) {
        	System.out.println(carModel.getBrand());
			
		}
		
		
	cars.get(0).setCarModel(carModels.get(0));	
	cars.get(1).setCarModel(carModels.get(1));
	cars.get(2).setCarModel(carModels.get(1));
	
	cars.get(2).setCarColor(carColors.get(3));
	System.out.println(cars.get(2).getCaption()+ " -> "
			 +cars.get(2).getCarModel().getBrand());
	
	System.out.println(cars.get(2).getCaption()+ " -> "
			+cars.get(2).getCarColor().getColor());
	
	 
	
	

	
	
	}
}
