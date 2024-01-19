package lab4_backend.controllers;


import jakarta.servlet.http.HttpServletRequest;
import lab4_backend.dto.PointDto;
import lab4_backend.persistence.model.User;
import lab4_backend.persistence.service.JwtService;
import lab4_backend.persistence.service.PointService;
import lab4_backend.persistence.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value= "/point/")
public class PointController {

    private final PointService pointService;
    private final UserService userService;
    private final JwtService jwtService;

    @GetMapping(value="/getAll")
    public List<PointDto> getAllPointsByLogin(HttpServletRequest req) {
        // todo передача аргументов
        String login = userService.getCurrentUser().getLogin();
        User user = userService.findByLogin(login).orElseThrow(()-> {
            throw new UsernameNotFoundException("Пользователь с таким айди не найден");
        });
        return user.getPoints().stream()
                .map(point -> new PointDto(point.getX(), point.getY(), point.getR(), point.getResult())).toList();
    }

    @PostMapping(value="/add")
    public void addNewPoint(@RequestBody PointDto point) {
        pointService.addPoint(point, userService.getCurrentUser().getId());
    }
}
