package kr.ac.kumoh.ce.s20220099.mysql_robot

import jakarta.persistence.Entity
import jakarta.persistence.*
import jakarta.persistence.Table

@Entity
@Table(name="Mechanic")
data class Robot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var name: String,
    var model: String,
    var manufacturer: String,
    @Column(name = "class")
    var robotClass: String,
)
