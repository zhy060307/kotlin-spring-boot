package com.zhy.springboot

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Lang(
        var name: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1
)