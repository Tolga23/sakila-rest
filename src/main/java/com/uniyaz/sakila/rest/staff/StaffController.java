package com.uniyaz.sakila.rest.staff;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.staff.domain.Staff;
import com.uniyaz.sakila.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "staff")
public class StaffController extends BaseController<Staff, StaffService> {
    @Autowired
    StaffService service;
}
