package com.tiantian.controller;

import com.tiantian.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 戴礼明
 * @create 2018/4/10 14:02
 */
@Controller
public class ItemController {
    @Autowired
    public ItemService itemService;
}