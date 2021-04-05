package com.demo.practice.service

import com.demo.practice.entity.UserInfo
import com.demo.practice.repository.UserInfoRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

@Service
class UserInfoService {

    @Autowired
    private lateinit var userInfoRepository: UserInfoRepository

    @Transactional(readOnly=true)
    fun findByAll():List<UserInfo> {
        return userInfoRepository.findAll()
    }
}