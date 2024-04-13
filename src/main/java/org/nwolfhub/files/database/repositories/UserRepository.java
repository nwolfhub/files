package org.nwolfhub.files.database.repositories;

import org.nwolfhub.files.database.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {}
