package lab4_backend.persistence.service;

import lab4_backend.dto.PointDto;

import java.util.List;

public interface PointService {

    public void addPoint(PointDto point, Long uid);
}
