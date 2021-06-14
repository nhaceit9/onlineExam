package action.admin;

import com.opensymphony.xwork2.ActionSupport;

public class teacherMgrAction extends ActionSupport {

	/**
	 * 2014年5月27日11:28:21
	 */
	private static final long serialVersionUID = 5126662263413258893L;

	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String List() {
		return "list";
	}

	public String Insert() {
		return SUCCESS;
	}

	public String One() {
		return "one";
	}
}