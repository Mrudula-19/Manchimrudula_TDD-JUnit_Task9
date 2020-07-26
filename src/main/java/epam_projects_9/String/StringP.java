package epam_projects_9.String;
public class StringP {
	public String character(String st)
    {
		StringBuilder build = new StringBuilder(st);
        if(st=="")
        {
        	return "";
        }
        else if(st.length()==1)
        {
        	if(build.charAt(0)=='A')
        	{
        		build.deleteCharAt(0);
        		return "";
        	}
        	else
        	{
        		return build.toString();
        	}
        }
        if(build.charAt(0)=='A')
        {
            build.deleteCharAt(0);
            if(build.charAt(0)=='A')
            {
            	build.deleteCharAt(0);
            }
        }
        else if(build.charAt(1)=='A')
        {
        	build.deleteCharAt(1);
        }
        return build.toString();
    }
}
