package kr.ac.kumoh.ce.s20220099.mysql_robot

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
@RestController
class RobotController {
    @GetMapping("/")
    fun welcome(): String {
        return "Welcome to Robot Server"
    }
}

