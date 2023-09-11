package com.mohan;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mohan.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
