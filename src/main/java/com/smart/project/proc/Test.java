package com.smart.project.proc;

import com.smart.project.annotation.Master;
import com.smart.project.common.vo.MenuVO;
import com.smart.project.web.home.vo.JoinVO;
import com.smart.project.web.home.vo.MainVO;
import com.smart.project.web.home.vo.ResVO;
import com.smart.project.web.home.vo.TestVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Master
@Component
public interface Test {
	/**********************************************************************************************
	 * @Method 설명 : Test_Mapper.xml에 있는 쿼리를 사용 할 경우
	 * @작성일 : 2021-02-15
	 * @작성자 : 김남현
	 * @변경이력 :
	 **********************************************************************************************/
//	List<TestVO> sqlMenu2(String userId);
	List<ResVO> selectRes(String input);
	List<ResVO> selectRes2(TestVO testVO);
	int selectTotalCnt(String result);
	List<MainVO> mainList();
//	void joinInsert(JoinVO joinVO);


}
