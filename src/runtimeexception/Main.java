package runtimeexception;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main implements Callable<List<Integer>> {
	
	public A a;
	public static void main(String[] args)  {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Main m = new Main();
		Future<List<Integer>> ret =  es.submit(m);
		List<Integer> l=null;
		try {
			l = ret.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("return  " + l.get(0));
		
	}
	
	@Override
	public List<Integer> call() {
		List<Integer> list ;
		FormaGaranziaAttestato.getFormaGaranziaDaCodiceAssimoco("01");
		
		list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("ciao ");
		return list;
	}

}
