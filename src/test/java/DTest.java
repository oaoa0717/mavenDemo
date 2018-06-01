import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mvn.entity.User;
import com.mvn.service.IUserService;
import com.mvn.util.PagedResult;

public class DTest {
	@Autowired
	private IUserService userService;
	Logger logger = LoggerFactory.getLogger(DTest.class);
	
	@Test  
	public void queryByPage(){  
	     PagedResult<User>  pagedResult = userService.queryByPage(null,1,10);//null表示查全部    
	     logger.debug("查找结果" + pagedResult);  
	}  
}
