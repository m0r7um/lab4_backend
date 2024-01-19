package lab4_backend.persistence.service;

import lab4_backend.dto.JwtAuthenticationResponse;
import lab4_backend.dto.SignInRequest;
import lab4_backend.dto.SignUpRequest;

public interface AuthenticationService {
    public JwtAuthenticationResponse signIn(SignInRequest request);
    public JwtAuthenticationResponse signUp(SignUpRequest request);
}
