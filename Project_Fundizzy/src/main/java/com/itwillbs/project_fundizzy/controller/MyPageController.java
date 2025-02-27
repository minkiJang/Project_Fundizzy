package com.itwillbs.project_fundizzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyPageController {
	
	// ~250218 장민기
	//마이페이지 영역 시작
	
	// 서포터 메인
	@GetMapping("SupporterPage")
	public String SupporterPage() {
		return "myPage/supporter/supporter_mypage";
	}
	
	// 설정 메인 - 프로필 아래 내정보설정 버튼을 통해 이동
	@GetMapping("SettingMain")
	public String SettingMain() {
		return "myPage/supporter/setting_main";
	}
	
	// 프로필 설정 - 설정메인에서 버튼을 통해 이동
	@GetMapping("ProfileSettings")
	public String ProfileSettings() {
		return "myPage/supporter/profile_settings";
	}
	
	//펀딩한 상품페이지 - 서포터 메인에서 펀딩 아이콘을 통해 이동
	//(환불 할수있게 미리 만들기)
	
	@GetMapping("FundingProd")
	public String FundingProd() {
		return "myPage/supporter/funding_prod";
	}
	
	
	//마이페이지 영역 끝
	
	// 판매자 페이지 영역
	
	// 판매자 페이지 영역 끝
	
	
	
}
