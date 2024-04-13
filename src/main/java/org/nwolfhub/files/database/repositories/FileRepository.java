package org.nwolfhub.files.database.repositories;

import org.nwolfhub.files.database.model.RemoteFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<RemoteFile, String> {}
