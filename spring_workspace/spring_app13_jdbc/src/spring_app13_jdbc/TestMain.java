package spring_app13_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		// 전체 데이터 조회
//		List<DeptDTO> list = d.selectAll();
//		for(DeptDTO dto : list) {
//			System.out.println(dto.getDeptno() + "\t" + dto.getDname() + "\t" + dto.getLoc());
//		}
		
		System.out.println("----------------------------------------");
		
		// 개별 데이터 조회
//		DeptDTO dto = d.selectOne(30);
//		System.out.println(dto.getDname());
		
		// 데이터 한 건 입력
//		DeptDTO dto = new DeptDTO(60, "영업1", "구로디지털단지역");
//		d.insertOne(dto);
		
		System.out.println("----------------------------------------");
		
		// 데이터 수정
//		DeptDTO dto = new DeptDTO(60, "총무1", "재택");
//		d.updateOne(dto);
		
		System.out.println("-----------------------------------------");
		
		// 데이터 삭제
//		d.deleteOne(60);
		
	}
}
