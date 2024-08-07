package com.self.test;

import com.self.service.EmployeeService;
import com.self.util.MyDate;
import com.self.vo.child.Engineer;
import com.self.vo.child.Manager;
import com.self.vo.child.Secretary;
import com.self.vo.parent.Employee;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. Service 객체를 생성
		EmployeeService service = EmployeeService.getInstance();
		
		//2. method를 각각 호출..
		System.out.println("============ 1. addManager ============ ");
		service.addEmployee(new Manager("AAA", new MyDate(1978, 1, 1), 20000.0, "개발부", 10));
		service.addEmployee(new Manager("BBB", new MyDate(1975, 2, 1), 34000.0, "기획부", 20));
		service.addEmployee(new Manager("CCC", new MyDate(1980, 3, 3), 20000.0, "교육부", 30));
		service.addEmployee(new Manager("DDD", new MyDate(1995, 8, 1), 37000.0, "개발부", 10));
		
		System.out.println("============ Manager 정보확인 ============ ");
		service.printManagers();
		
		System.out.println("\n============ 1. addEngineer ============ ");
		service.addEmployee(new Engineer("EEE", new MyDate(1995,3,4), 350000.0, "Java", 200.0));
		service.addEmployee(new Engineer("FFF", new MyDate(1995,7,2), 350000.0, "Java", 200.0));
		service.addEmployee(new Engineer("GGG", new MyDate(1994,11,2), 450000.0, "Python", 300.0));
		
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printEngineers();
		
		System.out.println("\n============ 1. addSecretary ============ ");
		service.addEmployee(new Secretary("HHH", new MyDate(1995,5,7), 370000.0, "hhh@gmail.com", "01012345678"));
		service.addEmployee(new Secretary("III", new MyDate(1991,9,12), 250000.0, "iii@naver.com", "01087654321"));
		service.addEmployee(new Secretary("JJJ", new MyDate(2001,8,19), 810000.0, "jjj@kosta.ac.kr", "01099999999"));
		
		System.out.println("============ Secretary 정보확인 ============ ");
		service.printSecretarys();
		
		System.out.println("============ Employee 정보확인 ============ ");
		service.printEmployees();
		
		System.out.println("\n============ 2. deleteManager(AAA 삭제) ============ ");
		service.deleteEmployee("AAA");
		System.out.println("============ Manager 정보확인 ============ ");
		service.printManagers();
		
		System.out.println("\n============ 2. deleteEngineer(FFF 삭제) ============ ");
		service.deleteEmployee("FFF");
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printEngineers();
		
		System.out.println("\n============ 2. deleteSecretary(III 삭제) ============ ");
		service.deleteEmployee("III");
		System.out.println("============ Secretary 정보확인 ============ ");
		service.printSecretarys();
		
		System.out.println("============ Employee 정보확인 ============ ");
		service.printEmployees();
		
		System.out.println("\n============ 3. updateManager(CCC 연봉 수정 200->350) ============ ");
		service.updateEmployee(new Manager("CCC", new MyDate(1980, 3, 3), 35000.0, "교육부", 30));
		System.out.println("============ Manager 정보확인 ============ ");
		service.printManagers();
		
		System.out.println("\n============ 3. updateEngineer(EEE bonus 수정 200->350) ============ ");
		service.updateEmployee(new Engineer("EEE", new MyDate(1995,3,4), 350000.0, "Java", 350.0));
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printEngineers();
		
		System.out.println("\n============ 3. updateSetretary(JJJ email 수정 jjj@kosta.ac.kr->jjj@gmail.com) ============ ");
		service.updateEmployee(new Secretary("JJJ", new MyDate(2001,8,19), 810000.0, "jjj@gmail.com", "01099999999"));
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printSecretarys();
		
		System.out.println("\n============ 4. findManager(BBB) ============ ");
		Employee retM1 = service.findEmployee("BBB");
		System.out.println(retM1);
		
		System.out.println("\n============ 4. findManager(10) ============ ");
		System.out.println("10번 부서에 근무하는 직원들 입니다..");
		Manager[ ] retMs1 = service.findManager(10);
		for(Manager m : retMs1) {
			if(m==null) continue;
			System.out.println(m);
		}
		
		System.out.println("\n============ 5. 부서별 사람 수 ============ ");
		String[] dept = service.countDept();
		for(int i = 0 ; i < dept.length ; i+=2) {
			System.out.println("부서 : " + dept[i] + dept[i+1] + "명");
		}
		
		System.out.println("\n============ 4. findSecretary(gmail.com) ============ ");
		System.out.println("gmail을 사용하는 직원들 입니다..");
		Secretary[ ] se = service.findSecretary("gmail.com");
		for(Secretary s : se) {
			if(s==null) continue;
			System.out.println(s);
		}
	}
}







