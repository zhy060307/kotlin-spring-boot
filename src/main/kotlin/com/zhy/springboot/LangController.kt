package com.zhy.springboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class LangController(val repo: LangRepo) {


    @GetMapping("id/{id}")
    fun findLangById(@PathVariable id: Long) = repo.findById(id)

    @GetMapping("name/{name}")
    fun findLangByName(@PathVariable name:String) =repo.findByName(name)
}