package com.wjB.studentmanager.service;

import com.wjB.studentmanager.domain.Admin;

/**
 * @Classname AdminService
 * @Description None
 * @Created by WJB
 */
public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
