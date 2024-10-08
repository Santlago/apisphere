package br.com.fiap.apisphere.post;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "posts")
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    LocalDateTime createdAt;
}
