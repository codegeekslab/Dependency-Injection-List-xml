package com.codegeekslab.type;

import java.util.List;
import com.codegeekslab.device.CellPhone;

public class BasicPhone implements CellPhone {

	public void makeCall(List<Integer> number, String app) {
		for (Integer num : number)
			System.out.println("calling " + num + " via " + app);
	}
}
