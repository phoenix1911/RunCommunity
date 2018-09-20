package web.controller;

import common.bean.Memberinfo;
import common.exception.MemberServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IMemberService;
import service.IMessengerService;
import service.impl.MemberSercviceImpl;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	private IMemberService memberServcie;
	@Autowired
	private IMessengerService messengerServcie;
	
	//1.checkAutoLoginAction
	/**
	 * 进入社区之前执行的方法
	 * 作用: 判断是否是自动登录，如果是则直接跳到 afterLong 方法中，如果不是自动登录，进入登录界面
	 *
	 * 实现思路：
	 * 		1.如果 username 和 password 为空  --> 手动登录
	 * 			跳转到登录页面
	 * 		2.如果不为空 --> 自动登录
	 * 			登录校验(service 层)
	 * 			afterLogin
	 * */
	@RequestMapping("/checkAutoLoginAction")
	public String checkAutoLoginAction(@CookieValue(value="username", required=false) String username,
									   @CookieValue(value="password", required=false) String password){
//		1.如果 username 和 password 为空  --> 手动登录  跳转到登录页面
		if (username != null && password != null) {
			IMemberService iMemberService = new MemberSercviceImpl();
            try {
                Memberinfo memberinfo = iMemberService.findMemberinfoByName(username);


            } catch (MemberServiceException e) {
                e.printStackTrace();
            }
        }
//		2.如果不为空 --> 自动登录
//			登录校验(service 层)
//			afterLogin

		//直接判断未记录cookie
		return "login";
	}


    /**
     * 登陆表单 参数从前台获取
     * @param username 用户名
     * @param password 密码
     * @param authCode 验证码
     * @param autoLogin 自动登陆
     * @param response 响应对象
     * @param session 会话对象
     * @return
     * 实现思路:
     *  1.校验验证码是否正确(从session中取验证码)
     *  2..如果验证码错误,直接转到登陆页面 --> return "login";
     *  3.校验登陆方法(Username 和 password )  service 层
     *        如果校验失败,直接跳转到登陆页面 --> return "login"
     *  4.判断是否点击了自动登陆(判断autoLogin是否为空)
     *        是: 将username和加密过后得password保存在cookie中
     *  6.将用户信息(会员信息memberinfo)和本次登陆时间(new Date())保存在session中
     *  7.跳转到activity页面
     */
	//2.login[session.getAttribute("authCode")]
	@RequestMapping("/login.action")
	public String login(HttpServletResponse response, HttpSession session,String username, String password, String authCode, String autoLogin){
		
		return "login";
	}
	
	//3.afterLogin
	@RequestMapping("/afterLogin")
	public String afterLogin(){
		
		return "";
	}
	
	//4.register
	@RequestMapping("/register")
	public String register(){
		
		return "";
	}
	
	
	
	
	
	
	
	
	
	//localhost:8888/zb_runssm/
	/*@RequestMapping("/test1")
	public void test1(Writer writer) throws IOException{
		System.out.println(memberServcie.getMemberDao());
		System.out.println(messengerServcie.getMessengerDao());
		writer.write("hello world");
		writer.flush();
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
