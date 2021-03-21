package spring_app14_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlDAO implements DAO{
	
	StringBuffer sb = new StringBuffer();
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setSb(StringBuffer sb) {
		this.sb = sb;
	}

	@Override
	public List<EmpDTO> selectAll() {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select empno, ename, sal, deptno from emp ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpDTO(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getInt(4));
			}
		};// RowMapper() end
		
		List<EmpDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}// selectAll() end

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select empno, ename, sal, deptno from emp ");
		sb.append("where empno = ? ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpDTO(rs.getInt(1),rs.getNString(2),rs.getInt(3),rs.getInt(4));
			}
		};	//RowMapper() end
		
		EmpDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm, no);
		
		return dto;
	}

	@Override
	public void insertOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
