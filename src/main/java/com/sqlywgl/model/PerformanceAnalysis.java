package com.sqlywgl.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "javasj_performance_analysis")
public class PerformanceAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "database_id")
    private String databaseId;
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "server_id")
    private String serverId;
    @Column(name = "server_name")
    private String serverName;
    @Column(name = "slow_query_count")
    private String slowQueryCount;
    @Column(name = "index_usage")
    private String indexUsage;
    @Column(name = "lock_waiting_condition")
    private String lockWaitingCondition;
    @Column(name = "response_tim")
    private int responseTime;
    @Column(name = "analysis")
    private String analysis;
    @Column(name = "create_user")
    private int createUser;
    @Column(name = "update_user")
    private int updateUser;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "mark")
    private boolean mark;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }
    public String getDatabaseName() {
        return databaseName;
    }
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    public String getServerId() {
        return serverId;
    }
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
    public String getServerName() {
        return serverName;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    public String getSlowQueryCount() {
        return slowQueryCount;
    }
    public void setSlowQueryCount(String slowQueryCount) {
        this.slowQueryCount = slowQueryCount;
    }
    public String getIndexUsage() {
        return indexUsage;
    }
    public void setIndexUsage(String indexUsage) {
        this.indexUsage = indexUsage;
    }
    public String getLockWaitingCondition() {
        return lockWaitingCondition;
    }
    public void setLockWaitingCondition(String lockWaitingCondition) {
        this.lockWaitingCondition = lockWaitingCondition;
    }
    public int getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(int responseTime) {this.responseTime = responseTime;
    }
    public String getAnalysis() {
        return analysis;
    }
    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }
    public int getCreateUser() {
        return createUser;
    }
    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }
    public int getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public boolean isMark() {
        return mark;
    }
    public void setMark(boolean mark) {
        this.mark = mark;
    }
}