package ru.zaytsev;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import ru.zaytsev.client.FirstWebServiceStub;
import ru.zaytsev.client.FirstWebServiceStub.AddTwoNumbers;
import ru.zaytsev.client.FirstWebServiceStub.AddTwoNumbersResponse;
import ru.zaytsev.client.FirstWebServiceStub.Entry1;
import ru.zaytsev.client.FirstWebServiceStub.Map1;

public class Main {

	public static void main(String[] args) throws RemoteException {
		  FirstWebServiceStub stub = new FirstWebServiceStub();
		  AddTwoNumbers atn = new AddTwoNumbers();
		  //atn.setFirstNumber(5);
		 // atn.setSecondNumber(7);
		  AddTwoNumbersResponse res = stub.addTwoNumbers(atn);
		  Map1 map = res.get_return();
		  Entry1[] entry =  map.getEntry();
		  System.out.println(entry[0].getKey() + " " + entry[0].getValue());
		 
	}

}
