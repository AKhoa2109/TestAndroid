package vn.ute.KiemTraAndroid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ute.KiemTraAndroid.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
