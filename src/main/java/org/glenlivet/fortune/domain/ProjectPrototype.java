package org.glenlivet.fortune.domain;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "project-prototype")
public class ProjectPrototype {

    @JsonApiId
    private Long id;

    private String name;

    private String owner;

    private String description;

    private String version;

    private Long semaphoreProjectId;

    private Long demoDeploymentTaskId;

    public ProjectPrototype() {
    }

    public ProjectPrototype(Long id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getSemaphoreProjectId() {
        return semaphoreProjectId;
    }

    public void setSemaphoreProjectId(Long semaphoreProjectId) {
        this.semaphoreProjectId = semaphoreProjectId;
    }

    public Long getDemoDeploymentTaskId() {
        return demoDeploymentTaskId;
    }

    public void setDemoDeploymentTaskId(Long demoDeploymentTaskId) {
        this.demoDeploymentTaskId = demoDeploymentTaskId;
    }
}
