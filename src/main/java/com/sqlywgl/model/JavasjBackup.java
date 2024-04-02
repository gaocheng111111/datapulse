package com.sqlywgl.model;
import jakarta.persistence.*; @Entity
@Table(name = "javasj_backup") public class JavasjBackup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private Integer id; // ID
    @Column(name = "backup_name")
    private String backupName; // 备份名称@Column(name = "backup_type")
    private String backupType; // 备份类型@Column(name = "backup_time")
    private Integer backupTime; // 备份时间@Column(name = "backup_size")
    private String backupSize; // 备份大小@Column(name = "backup_status")
    private Integer backupStatus; // 备份状态：0 成功 1 失败@Column(name = "backup_path")
    private String backupPath; // 备份路径
    /**
     *	获取 ID
     */
    public Integer getId() { return id;
    }
    /**
     *	设置 ID
     */
    public void setId(Integer id) { this.id = id;
    }
    /**
     *	获取备份名称
     */
    public String getBackupName() { return backupName;
    }
    /**
     *	设置备份名称
     */
    public void setBackupName(String backupName) { this.backupName = backupName;
    }
    /**
     *	获取备份类型
     */
    public String getBackupType() { return backupType;
    }
    /**
     *	设置备份类型
     */
    public void setBackupType(String backupType) { this.backupType = backupType;
    }
    /**
     *	获取备份时间
     */
    public Integer getBackupTime() { return backupTime;
    }
    /**
     *	设置备份时间
     */
    public void setBackupTime(Integer backupTime) { this.backupTime = backupTime;
    }
    /**
     *	获取备份大小
     */
    public String getBackupSize() { return backupSize;
    }
    /**
     *	设置备份大小
     */
    public void setBackupSize(String backupSize) { this.backupSize = backupSize;
    }
    /**
     *	获取备份状态：0 成功 1 失败
     */
    public Integer getBackupStatus() { return backupStatus;
    }
    /**
     *	设置备份状态：0 成功 1 失败
     */
    public void setBackupStatus(Integer backupStatus) { this.backupStatus = backupStatus;
    }
    /**
     *	获取备份路径
     */
    public String getBackupPath() { return backupPath;
    }
    /**
     *	设置备份路径
     */
    public void setBackupPath(String backupPath) { this.backupPath = backupPath;
    }
}

