package org.glenlivet.fortune.persistence;

import org.glenlivet.fortune.domain.ProjectPrototype;

public interface ProjectPrototypeService {
    Iterable<ProjectPrototype> findAll();
}
