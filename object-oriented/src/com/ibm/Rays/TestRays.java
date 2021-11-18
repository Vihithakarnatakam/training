import com.ibm.Rays.Alpha;
import com.ibm.Rays.Beta;
import com.ibm.Rays.gama;

public class TestRays {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		Beta b = new Beta();
		
		
		Alpha ab=b; // upcasting
		Beta ba =(Beta)ab;//Downcasting
		gama g = new gama();
		g.show();
		
		Beta bt=g;//upcasting
		bt.show();

	}

}
