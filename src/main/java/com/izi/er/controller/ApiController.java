package com.izi.er.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import com.izi.er.dto.ResponseDto;
import com.izi.er.dto.TestDto;
import com.izi.er.dto.InjuryDto;
import com.izi.er.dto.SignupDto;
import com.izi.er.dto.LocationDto;

@RestController
public class ApiController {
    @PostMapping("/test")
    public ResponseDto<String> test(@RequestBody TestDto testDto) {
        System.out.println("test id: "+testDto.getId());
        System.out.println("test name: "+testDto.getName());
        return new ResponseDto<String>("test ok", HttpStatus.OK);
    }
    @PostMapping("/injury")
    public ResponseDto<String> requestInjury(@RequestBody InjuryDto injuryDto) {
        return new ResponseDto<String>("", HttpStatus.OK);
    }
    @PostMapping("/signup/process")
    public ResponseDto<String> signup(@RequestBody SignupDto signupDto) {
        return new ResponseDto<String>("Success Sign up", HttpStatus.OK);
    }
    @PostMapping("/search-emergency-room/process")
    public ResponseDto<String> findEmerygencyRoom(@RequestBody LocationDto locationDto) {
        return new ResponseDto<String>("find emergency room", HttpStatus.OK);
    }
}
