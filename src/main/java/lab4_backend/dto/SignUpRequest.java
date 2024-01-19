package lab4_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class SignUpRequest {

    @NotBlank
    private String login;

    @Size(max = 255, message = "Длина пароля должна быть не менее 8 и не более 255 символов", min = 8)
    private String password;
}