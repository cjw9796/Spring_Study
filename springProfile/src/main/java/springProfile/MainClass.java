package springProfile;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		//bean을 설정하는 xml 파일에 profile속성이 지정된 경우 아래와 같이 bean을 설정하면 안된다. 
		
//		AbstractApplicationContext ctx = 
//		new GenericXmlApplicationContext("classpath:applicationCTX_dev.xml", "classpath:applicationCTX_run.xml");

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행할 작업 환경을 선택하세요! 1=> dev 2=> run");
		
		int info = scanner.nextInt();
		
		String config = "";
		switch(info) {
			case 1:
				config = "dev";
				break;
			case 2:
				config = "run";
				break;
		}
		
		//profile이 xml파일의 bean을 읽어오기 위해서 스프링 컨테이너를 먼저 만든 후 
		// 읽어올 bean의 profile을 지정한 다음 스프링 컨테이너에 해당하는 profile이 지정된 
		// bean을 load()시켜야된다. 
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		//읽어올 bean의 프로파일을 넣어준다. 
		// getEnvironment()메서드로 스프링 컨테이너의 환경 설정 정보를 얻어온 후 
		// setActiveProfiles() 메서드로 읽어올 profile을 넣어준다.
		
		ctx.getEnvironment().setActiveProfiles(config);
		
		ctx.load("classpath:applicationCTX_dev.xml","classpath:applicationCTX_run.xml");
		ctx.refresh();
		
		ServiceInfo ServiceInfo = ctx.getBean("serviceinfo", ServiceInfo.class);
		System.out.println(ServiceInfo.getIpNumber());
		System.out.println(ServiceInfo.getportNumber());
		
		ctx.close();
		
		
		
	}

}
