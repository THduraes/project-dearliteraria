package com.dearliteraria.first_spring_app.repositories;

import com.dearliteraria.first_spring_app.entities.DearPosts;
import com.dearliteraria.first_spring_app.projections.PostsMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<DearPosts, Long> {
    @Query(nativeQuery = true, value = """
        SELECT tb_book.id, tb_book.title, tb_book.book_year AS `year`, tb_book.img_url AS `imgUrl`, tb_book.author, tb_belonging.rating
        FROM tb_book
        INNER JOIN tb_belonging ON tb_book.id = tb_belonging.book_id
        WHERE tb_belonging.posts_id = userId
        """)
    List<PostsMinProjection> searchByList(Long UserId);

}
