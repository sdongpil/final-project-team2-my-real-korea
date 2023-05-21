package com.itwill.my_real_korea.service.tour;

import java.util.List;
import java.util.Map;

import com.itwill.my_real_korea.dto.tour.TourReview;
import com.itwill.my_real_korea.dto.user.User;
import com.itwill.my_real_korea.util.PageMakerDto;

public interface TourReviewService {

	//1. 투어상품 후기 추가
	public int insertTourReview(TourReview tourRiview) throws Exception;
	//2. 투어후기 수정
	public int updateTourReview(TourReview tourReview) throws Exception;
	//3. 투어후기번호로 후기 삭제
	public int deleteTourReview(int toReviewNo) throws Exception;
	//4. 투어 평점 구하기
	int calculateTourScore(int toNo) throws Exception;
	//5. 사진 업로드 할 경우 업로드파일로 업데이트
	public int updateToReviewUpload(String toReviewUpload, int toReviewNo) throws Exception;
	//6. 사진 업로드 안 할 경우 의 업데이트
	public int updateToReviewImg(String toReviewImg, int toReviewNo) throws Exception;
	
	//페이지 메이커 사용
	//4. 사용자가 작성한 후기 전체 보기
	public List<TourReview> findByUserId(String userId) throws Exception;
	//5. 투어상품번호로 후기 전체 보기
	public List<TourReview> findByToNo(int toNo) throws Exception;
	
}
