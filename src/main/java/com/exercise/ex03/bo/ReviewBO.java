package com.exercise.ex03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.ex03.dao.ReviewDAO;
import com.exercise.ex03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReview(int id) {
		return reviewDAO.selectReview(id);
	}
	
	public int addReviewAsField(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}
	
	public int deleteReviewById(int id) {
		return reviewDAO.deleteReviewById(id);
	}
}
