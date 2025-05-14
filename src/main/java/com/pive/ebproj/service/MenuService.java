package com.pive.ebproj.service;

import com.pive.ebproj.dto.MenuDTO;
import com.pive.ebproj.entity.Menu;
import com.pive.ebproj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        Menu selectedMenu = menuRepository.findById(menuCode).get();

        return modelMapper.map(selectedMenu, MenuDTO.class);
    }
}
