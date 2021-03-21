package kr.co.goott.app.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MysqlDAO implements DAO {
	
	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptDTO> selectAll() {
		// TODO Auto-generated method stub
//		SqlSessionFactory factory = cm.getFactory();
//		
//		SqlSession ss = factory.openSession(true);
//		
//		List<DeptDTO> list = ss.selectList("selectAll");	
//		
//		return list;
		
		// method chaining
		return cm.getFactory().openSession(true).selectList("selectAll");
		
	}

	@Override
	public DeptDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return cm.getFactory().openSession(true).selectOne("selectOneByDeptno", no);
	}

	@Override
	public void insertOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).insert("insertOneByDeptno", dto);
	}

	@Override
	public void updateOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).update("updateOneByDeptno", dto);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).delete("deleteOneByDeptno", no);
	}

}











