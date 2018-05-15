package org.glenlivet.fortune.domain;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

/**
 * Created by gzhang061 on 5/15/18.
 */
@JsonApiResource(type = "demoables")
public class Demoable {

    @JsonApiId
    private Long id;

    private Long projectId;

    private String taskId;

    private String serverEndpoint;

    private String serverKey;

    private String serverOS;

    private String serverUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getServerEndpoint() {
        return serverEndpoint;
    }

    public void setServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
    }

    public String getServerKey() {
        return serverKey;
    }

    public void setServerKey(String serverKey) {
        this.serverKey = serverKey;
    }

    public String getServerOS() {
        return serverOS;
    }

    public void setServerOS(String serverOS) {
        this.serverOS = serverOS;
    }

    public String getServerUser() {
        return serverUser;
    }

    public void setServerUser(String serverUser) {
        this.serverUser = serverUser;
    }
}
