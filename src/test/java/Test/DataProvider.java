package Test;

//import org.testng.annotations.DataProvider;
public class DataProvider {

	@org.testng.annotations.DataProvider(name="users")
	public Object[][] dataForPost() {
		
		
		return new Object[][] {
			{"ilams","hfx",1},
			{"surya","gfh",1},
			{"dgfh","fythfu",2}
		};			
	}
	
	@org.testng.annotations.DataProvider(name="delete")
	public Object[] dataForDelete() {
		return new Object[] {
				13	
		};
	}

}
