package uz.customs.monitoringsystem.controller;


import com.profesorfalken.jsensors.model.components.Cpu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.customs.monitoringsystem.compos.CpuSystemClass;
import uz.customs.monitoringsystem.helpers.AllAnaliseDto;

import java.util.List;

@RestController
@RequestMapping("/analise/cpu/get")
public class MainControllerCpu {

    @Autowired
    CpuSystemClass cpuSystemClass;

    @GetMapping
    public ResponseEntity<Object> getDataPc(){
        AllAnaliseDto analise = cpuSystemClass.analise();
        return new ResponseEntity<>(analise, HttpStatus.OK);
    }
}
