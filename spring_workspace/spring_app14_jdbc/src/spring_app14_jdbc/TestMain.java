package spring_app14_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring_app14_jdbc.EmpDTO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		// 전체 데이터 조회
		List<EmpDTO> list = d.selectAll();
		for(EmpDTO dto : list) {
			System.out.println(dto.getEmpno() + "\t" + dto.getEname() + "\t" + dto.getSal() + "\t" + dto.getDeptno());
		}
		
		System.out.println("--------------------------------------------------------------");
		
		// 개별 데이터 조회
		EmpDTO dto = d.selectOne(7521);
		System.out.println(dto.getEname());
		
	}
}
