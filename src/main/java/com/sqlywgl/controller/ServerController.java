package com.sqlywgl.controller;
import com.sqlywgl.model.Server;
import com.sqlywgl.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import javax.validation.Valid;
import java.util.List; @RestController @RequestMapping("/api/server") public class ServerController {
    private final ServerService serverService; @Autowired
    public ServerController(ServerService serverService) { this.serverService = serverService;
    }
/***	创建服务器
 *	@param server 服务器信息
 *	@return 创建成功的服务器对象
 */ @PostMapping("/")
public ResponseEntity<Server> createServer(@Valid @RequestBody Server server) { Server createdServer = serverService.createServer(server);
    return new ResponseEntity<>(createdServer, HttpStatus.CREATED);
}
    /**
     *	删除指定 ID 的服务器
     *	@param id 服务器 ID
     *	@return 删除成功的服务器对象
     */ @DeleteMapping("/{id}")
    public ResponseEntity<Server> deleteServer(@PathVariable("id") int id) { Server deletedServer = serverService.deleteServer(id);
        return new ResponseEntity<>(deletedServer, HttpStatus.OK);
    }
    /**
     *	更新服务器信息
     *	@param id 服务器 ID
     *	@param updatedServer 更新后的服务器信息
     *	@return 更新成功的服务器对象
     */ @PutMapping("/{id}")
    public ResponseEntity<Server> updateServer(@PathVariable("id") int id, @Valid @Request Body Server updatedServer) {
        Server server = serverService.updateServer(id, updatedServer); return new ResponseEntity<>(server, HttpStatus.OK);
    }
    /**
     *	获取所有服务器列表
     *	@return 服务器列表
     */ @GetMapping("/")
    public ResponseEntity<List<Server>> getAllServers() { List<Server> servers = serverService.getAllServers(); return new ResponseEntity<>(servers, HttpStatus.OK);
    }
}


