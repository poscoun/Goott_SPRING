package kr.co.goott.app.mybatis;

import java.util.List;

public interface DAO {
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
}
