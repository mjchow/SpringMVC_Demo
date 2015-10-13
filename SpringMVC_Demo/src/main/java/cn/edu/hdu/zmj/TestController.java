package cn.edu.hdu.zmj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "mjchow";
	}
}
