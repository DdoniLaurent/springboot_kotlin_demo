package com.demo.practice.repository

import com.demo.practice.entity.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo, String> {
}