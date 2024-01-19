package lab4_backend.persistence.service.impl;


import lab4_backend.dto.PointDto;
import lab4_backend.persistence.model.Point;
import lab4_backend.persistence.repository.PointRepository;
import lab4_backend.persistence.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PointServiceImpl implements PointService {

    private final PointRepository pointRepository;
    public void addPoint(PointDto point, Long id) {
        // redo saving point by saving it by login
        pointRepository.save(new Point(point.x(), point.y(), point.r(), id));
    }
}
