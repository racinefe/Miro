package com.example.springboot.Controller;

import com.example.springboot.dtos.UserRecordDto;
import com.example.springboot.models.CrudModel;
import com.example.springboot.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<CrudModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto){
        var crudModel = new CrudModel();
        BeanUtils.copyProperties(userRecordDto, crudModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(crudModel));
    }

}
