//model class
public class ForgotPassword{
	private String Email;					//variable for Email Id
	private String Password;					//variable for password
}

//DAO class
public int forgotpassword(FarmFarmer f) {
		// TODO Auto-generated method stub
		System.out.println("in save data..");
		//String query="insert into g3_farm_details values('"+f.getFName()+"','"+f.getFEmail()+"',"+f.getFContact()+",'"+f.getFPassword()+"')";
		String query="insert into g3_farm_details (FEmail,FPassword) values('"f.getFEmail()+"','"+f.getFPassword()+"')";
		return jdbcTemplate.update(query);
	}

//Controller
	@RequestMapping(value="/ForgotPassword",method=RequestMethod.POST)
	public ModelAndView fp( ) 
	{
		fdao.forgotpassword(farmer);
		return new ModelAndView("ForgotPassword");
		
	}