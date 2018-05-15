package org.glenlivet.fortune.persistence;

import org.glenlivet.fortune.domain.ProjectPrototype;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Component("projectPrototypeService")
public class MockProjectPrototypeServiceImpl implements ProjectPrototypeService {


    public <S extends ProjectPrototype> S save(S s) {
        return null;
    }

    public <S extends ProjectPrototype> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    public Optional<ProjectPrototype> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ProjectPrototype> findAll() {
        Collection<ProjectPrototype> retVal = new ArrayList<>();
        ProjectPrototype pp1 = new ProjectPrototype(0L, "Big Data Jupyter", "Glen Zhang");
        pp1.setDemoDeploymentTaskId(1L);
        ProjectPrototype pp2 = new ProjectPrototype(1L, "Sonarqube", "Sonarqube");
        pp2.setDemoDeploymentTaskId(2L);
        retVal.add(pp1);
        retVal.add(pp2);
        return retVal;
    }

    public Iterable<ProjectPrototype> findAllById(Iterable<Long> iterable) {
        return findAll();
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long aLong) {

    }

    public void delete(ProjectPrototype projectPrototype) {

    }

    public void deleteAll(Iterable<? extends ProjectPrototype> iterable) {

    }

    public void deleteAll() {

    }
}
