package org.nwolfhub.files.database.repositories;

import org.nwolfhub.files.database.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, String> {}
