package student;

public class StudDAO
{

	public void Add(details det)
	{
		   String query= "insert into std1 (id ,name) Values(?,?)";
		   Object[] params={det.getId(),det.getName()};
		   ConnitionUtil.getJdbcTemplate().update(query,params);
		   
		   
	}
	public void UpDate(details det)
	{
		
		String query="update std1 set  name=? where id=?";
		Object[] params={det.getName(),det.getId()};
		ConnitionUtil.getJdbcTemplate().update(query,params);
		
		
	}
	public void Delete(details det)
	{
		
		String query="delete from std1 where id=?";
		Object[] params={det.getId()};
		ConnitionUtil.getJdbcTemplate().update(query,params);
		
		
	}
	public void show(details det)
	{
		String query="Select * from std1;";
	
	}
}
