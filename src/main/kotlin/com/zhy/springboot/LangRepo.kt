package com.zhy.springboot

import org.springframework.data.repository.CrudRepository

interface LangRepo : CrudRepository<Lang, Long> {
    fun findById(id: Long): Lang
    fun findByName(name: String): Iterable<Lang>
}