package com.pive.ebproj.controller;

import com.pive.ebproj.dto.MenuDTO;
import com.pive.ebproj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManuController {

    private final MenuService menuService;

    @Autowired
    public ManuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findMenuByMenuCode(@PathVariable int menuCode) {
        return menuService.findMenuByMenuCode(menuCode);
    }
}
