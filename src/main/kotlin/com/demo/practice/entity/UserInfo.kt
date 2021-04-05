package com.demo.practice.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Column

@Entity
class UserInfo {

    @Id
    @Column
    var userId:String? = null

    @Column
    var userPw:String? = null

    @Column
    var userNm:String? = null

}