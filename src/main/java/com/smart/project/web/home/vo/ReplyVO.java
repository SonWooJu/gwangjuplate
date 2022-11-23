package com.smart.project.web.home.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ReplyVO {

    private int rno; // 댓글 고유 번호
    private int bno; // 게시글 고유 번호

    private String reply; // 댓글 내용
    private String replyUser; // 댓글 작성자
    private Date replyDate; // 작성 날짜
    private Date updateDate; // 업데이트 날짜(수정, 삭제)
    private boolean delete; // 삭제됐는지
}
