package com.sohu.tv.mq.cloud.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sohu.tv.mq.cloud.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AutoAuditServiceTest {
    
    @Autowired
    private AutoAuditService autoAuditService;

    @Test
    public void test() {
        autoAuditService.autoAudit();
    }

}
