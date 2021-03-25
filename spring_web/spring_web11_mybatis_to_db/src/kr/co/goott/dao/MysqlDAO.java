package kr.co.goott.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.goott.dto.DeptDTO;

public class MysqlDAO implements DAO {
	
	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<DeptDTO> selectAll() {
		// TODO Auto-generated method stub
		return ss.selectList("selectAllDept");
	}

	@Override
	public DeptDTO selectOne(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(DeptDTO deptDto) {
		// TODO Auto-generated method stub
		ss.insert("insertOneByDeptno", deptDto);
	}

	@Override
	public void updateOne(DeptDTO deptDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(int deptno) {
		// TODO Auto-generated method stub
		
	}

}
