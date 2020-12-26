
public class LinkedIn {

	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			for(int i=0; i<=5; i++) {
				System.out.println("Hi");
				try{Thread.sleep(500);}catch(Exception e) {};
		}
			
		});
		
		Thread t2 = new Thread(()-> {
			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e) {};
		}
			
		});
		
		Runnable r = () -> {for(int i=0;i<=5;i++){
			System.out.println("t3");
			try{Thread.sleep(500);}catch(Exception e) {};
			}};
			
		t.start();
		try{Thread.sleep(500);} catch(Exception e) {};
		t2.start();
		
		Thread t3 = new Thread(r);
		t3.start();
		
		
		System.out.println("By");

	}

}
