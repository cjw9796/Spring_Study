package com.kh.springdi;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//java파일에서 xml파일의 bean 설정 정보를 읽어오려면 어노테이션 사용하면 된다. 

@ImportResource("classpath:applicationCTX2.xml")


@Configuration
public class ApplicationConfig {
	
	// @Bean(initMethod = "init", destroyMethod="close") 처럼
	// 지정을 할 수 있다. 
	
	@Bean
	public Student student() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("바둑");
		hobbies.add("골프");
		hobbies.add("테니스");
		
		Student student = new Student("홍길동", hobbies, 20);
		student.setHeight(178);
		student.setWeight(80);
		
		return student;
		
	}
	
//	@PostConstruct
//	public void init() {}
//	
//	@PreDestroy
//	public void close() {}
	
	//DI (Dependency Injection)
	// - 클래스 간의 의존 관계로 스프링 컨테이너가 자동으로 연결해주는 것! 
	
	//어노테이션@ 
	// - 스프링에서 빈 인스턴스가 생성된 이후 @Autowired 설정한 메서드가 자동으로 호출되고 
	// 인스턴스가 자동으로 주입된다. 
	// 해당 변수가 혹은 메서드가 스프링이 관리하는 Bean을 자동으로 매핑해주는 개념이다. 
	
	// ApplicationConfig는 DI설정에 사용되는 클래스임을 Spring에게 알려준다. 
	
	//<bean id="" class="">
	// 적당한 이름의 메서드를 만들고 @Bean 어노테이션을 붙여서 bean을 설정하는 xml파일 <bean>태그 역할을 한다는 것을 
	// Spring한테 알려준다!
	
//	@Bean
//	public 리턴타입[class 속성값 => 클래스이름만] 메서드이름[id속성값](){
//		생성자나 setter메서드를 이용해서 bean을 초기화하는 작업을 실행한다. 
//		return bean객체;
//	}
	

}
