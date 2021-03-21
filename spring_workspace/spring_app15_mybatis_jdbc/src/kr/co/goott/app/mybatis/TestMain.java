package kr.co.goott.app.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		//System.out.println("d : "+ d);
		
		// 전체 조회
//		List<DeptDTO> list = d.selectAll();
//		for(DeptDTO dto : list) {
//			System.out.println(dto.getDname());
//		}
		
		System.out.println("---------------------------------");
		
		// 개별 조회
//		DeptDTO dto1 = d.selectOne(20);
//		System.out.println(dto1.getDeptno());
		
		System.out.println("-------------------------------------");
		
		// 데이터 삽입
//		DeptDTO dto2 = new DeptDTO(70, "QA", "여의도");
//		d.insertOne(dto2);
		
		System.out.println("------------------------------------------");
		
		// 데이터 수정
//		DeptDTO dto3 = new DeptDTO();
//		dto3.setDname("HQ");
//		dto3.setLoc("샌프란시스코");
//		dto3.setDeptno(70);
//		
//		d.updateOne(dto3);
		
		System.out.println("-------------------------------------------");
		// 데이터 삭제
	//	d.deleteOne(70);
	}
}



















