package degreedasnment;

import static org.junit.jupiter.api.Assertions.*;

import com.asnmnt.one.Customer;
import com.asnmnt.one.Test;

class testtest {
	
	

	@org.junit.jupiter.api.Test
	void test() {
		
		com.asnmnt.one.Test ts=new com.asnmnt.one.Test();
		Customer cs=ts.loadcust();
		assertEquals(cs.getCustomerId(),"kucghi");
		
		
	}

}
