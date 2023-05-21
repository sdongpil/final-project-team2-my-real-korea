package com.itwill.my_real_korea.dao.tripboard;

import java.util.List;
import java.util.Map;

import com.itwill.my_real_korea.dto.tripboard.TripBoard;

public interface TripBoardDao {
	/*
	 * 게시글 추가
	 */
	int insertTripBoard(TripBoard tripBoard) throws Exception;
	
	/*
	 * 게시글 이미지 변경(추가)
	 */
	int updateTripBoardImg(String tBoImg, int tBoNo) throws Exception;
	
	/*
	 * 게시글 업로드된 파일 변경(추가)
	 */
	int updateUploadFile(String tUploadFile, int tBoNo) throws Exception;
	
	/*
	 * 게시글 이미지 null 로 만들기
	 */
	int updateTripBoardImgNull(int tBoNo) throws Exception;
	
	/*
	 * 게시글 수정
	 */
	int updateTripBoard(TripBoard tripBoard) throws Exception;
	
	/*
	 * 게시글 삭제
	 */
	int deleteTripBoard(int tBoNo) throws Exception;
	
	/*
	 * 게시글 번호로 게시글 1개 보기
	 */
	TripBoard selectByTbNo(int tBoNo) throws Exception;
	
	/*
	 * 게시글 모집상태별로 보기 - 페이징 처리
	 */
	List<TripBoard> selectByTbStatusList(int pageStart, int pageEnd, int tBoStatus) throws Exception;

	/*
	 * 게시글 지역별로 보기 - 페이징 처리
	 */
	List<TripBoard> selectByCityNoList(int pageStart, int pageEnd, int cityNo) throws Exception;
	
	/*
	 * 게시글 해시태그별로 보기 - 페이징 처리
	 */
	List<TripBoard> selectByHashtagList(int pageStart, int pageEnd, String hashtag) throws Exception;
	
	/*
	 * 게시판 리스트 정렬(게시글 작성 날짜 기준 내림차순) - 페이징 처리
	 */
	List<TripBoard> selectAllOrderByDate(int pageStart, int pageEnd) throws Exception;
	
	/*
	 * 게시판 리스트 정렬(조회수 기준 내림차순) - 페이징 처리
	 */
	List<TripBoard> selectAllOrderByReadCount(int pageStart, int pageEnd) throws Exception;

	/*
	 * 게시판 리스트(게시글 시작번호, 게시글 끝번호) - 페이징 처리
	 */
	List<TripBoard> selectAllTb(int pageStart, int pageEnd) throws Exception;

	/*
	 * 게시글  총 개수
	 */
	int selectAllTbCount() throws Exception;
	
	/*
	 * 모집상태별 게시글 개수
	 */
	int selectStatusCount(int tBoStatus) throws Exception;
	
	/*
	 * 지역별 게시글 개수
	 */
	int selectCityNoCount(int cityNo) throws Exception;
	
	/*
	 * 해시태그별 게시글 개수
	 */
	int selectHashtagCount(String hashtag) throws Exception;
	
	/*
	 * 게시글 조회수 1 증가
	 */
	int increaseTbReadCount(int tBoNo) throws Exception;
	
	/*
	 * 키워드로 검색된 동행게시판 리스트 - 페이징 처리
	 */
	List<TripBoard> selectSearchTbList(int pageStart, int pageEnd, String keyword) throws Exception;
	
	/*
	 * 검색된 게시글 총 개수
	 */
	int selectTbSearchCount(String keyword) throws Exception;
	
	/*
	 * 마이페이지에 사용할 내가 작성한 글 리스트
	 */
	List<TripBoard> selectAllUser(String UserId) throws Exception;
}
