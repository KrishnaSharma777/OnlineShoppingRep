package com.project.medicalfootware.dto;

import com.project.medicalfootware.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class SignInResponseDTO {
    private boolean isSuccess;
    private String Message;
    private String Token;
    private User data;
}
