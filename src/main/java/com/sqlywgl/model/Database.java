//package com.sqlywgl.project.model;
package com.sqlywgl.model;
import jakarta.persistence.*;
@Entity
@Table(name = "javasj_database")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "database_id")
    private String databaseId;
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "database_type")
    private String databaseType;
    @Column(name = "database_version")
    private String databaseVersion;
    @Column(name = "database_size")
    private String databaseSize;
    @Column(name = "database_status")
    private boolean databaseStatus;
    @Column(name = "create_user")
    private int createUser;
    @Column(name = "update_user")
    private int updateUser;
    @Column(name = "create_time")
    private int createTime;
    @Column(name = "update_time")
    private int updateTime;
    @Column(name = "mark")
    private boolean mark;
}