package com.cafe.repo;

import com.cafe.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TableReservationRepo extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByUserId(Long userId);
}
