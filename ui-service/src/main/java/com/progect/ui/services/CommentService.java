package com.progect.ui.services;

import com.progect.ui.rest.CommentServiceClient;
import com.progect.ui.rest.dto.comment.CommentRequestDTO;
import com.progect.ui.rest.dto.comment.CommentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentServiceClient commentServiceClient;

    public CommentService(CommentServiceClient commentServiceClient) {
        this.commentServiceClient = commentServiceClient;
    }

    public Long createComment(CommentRequestDTO commentRequestDTO) {
        return commentServiceClient.createComment(commentRequestDTO);
    }

    public List<CommentResponseDTO> getAllComments() {
        return commentServiceClient.getAllComments();
    }

    public List<CommentResponseDTO> getCommentsByUserName(String userName) {
        return commentServiceClient.getCommentsByUserName(userName);
    }

    public CommentResponseDTO updateCommentById(Long commentId, CommentRequestDTO commentRequestDTO) {
        return commentServiceClient.updateCommentById(commentId, commentRequestDTO);
    }

    public CommentResponseDTO deleteCommentById(Long dishId) {
        return commentServiceClient.deleteCommentById(dishId);
    }

    public CommentResponseDTO getCommentById(Long commentId) {
        return commentServiceClient.getCommentById(commentId);
    }
}
