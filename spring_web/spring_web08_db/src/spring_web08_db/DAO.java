package spring_web08_db;

import java.util.List;

public interface DAO {
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dtd);
	public void deleteOne(int no);
}
