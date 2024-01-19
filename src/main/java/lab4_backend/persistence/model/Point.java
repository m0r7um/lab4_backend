package lab4_backend.persistence.model;

import jakarta.persistence.*;
import lab4_backend.dto.PointDto;
import lombok.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "point")
public class Point implements Serializable {
    @Id
    @Column(nullable = false, unique = true, name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "x")
    private Double x;

    @Column(nullable = false, name = "y")
    private Double y;

    @Column(nullable = false, name = "r")
    private Double r = 2d;

    @Column(nullable = false, name = "result")
    private Boolean result = false;

    @Column(nullable = false, name="user_id")
    private Long user_id;

    @Column(nullable = false, name = "currenttime")
    private String currentTime = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(new Date(System.currentTimeMillis()));;

    public Point(Double x, Double y, Double r, Long uid) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.user_id = uid;
        this.result = false;
    }


    public String getStringResult(){
        if(this.result){
            return "Попал!";
        }else{
            return "Мимо!";
        }
    }

}