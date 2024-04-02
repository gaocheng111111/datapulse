package com.sqlywgl.controller;
import lombok.Data;
import jakarta.persistence.*;

import java.io.Serializable;
/**
 * 数据库监控实体类
 */ @Data @Entity
@Table(name = "javasj_database_monitor")
public class JavasjDatabaseMonitor implements Serializable {

    /**
     * ID
     */ @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private Integer id;
    /**
     * 数据库 ID
     */
    @Column(name = "database_id") private String databaseId;
    /**
     * 数据库名称
     */
    @Column(name = "database_name") private String databaseName;
    /**
     * 服务器 ID
     */
    @Column(name = "server_id") private String serverId;
    /**
     * 服务器名称
     */
    @Column(name = "server_name") private String serverName;
    /**
     * 数据库状态
     */
    @Column(name = "database_status") private String databaseStatus;
    /**
     * 连接数
     */
    @Column(name = "connection_count") private Integer connectionCount;
    /**
     * 查询次数
     */
    @Column(name = "query_count") private Integer queryCount;

    /**
     * 缓存命中率
     */
    @Column(name = "cache_hit_rate") private String cacheHitRate;
    /**
     * 监控时间
     */
    @Column(name = "monitoring_time") private Integer monitoringTime;
}
