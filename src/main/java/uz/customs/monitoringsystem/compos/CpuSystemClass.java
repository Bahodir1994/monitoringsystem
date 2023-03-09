package uz.customs.monitoringsystem.compos;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.sensors.Fan;
import com.profesorfalken.jsensors.model.sensors.Temperature;
import org.jutils.jprocesses.JProcesses;
import org.jutils.jprocesses.model.ProcessInfo;
import org.springframework.stereotype.Component;
import uz.customs.monitoringsystem.helpers.AllAnaliseDto;

import java.util.List;

@Component
public class CpuSystemClass {

    public AllAnaliseDto analise(){
        Components components = JSensors.get.components();

        List<Cpu> cpus = components.cpus;
        List<ProcessInfo> processesList = JProcesses.getProcessList();

        AllAnaliseDto analiseDto = new AllAnaliseDto();
        analiseDto.setCpuList(cpus);
        analiseDto.setProcessInfoList(processesList);
        return analiseDto;

//        kill porccess
//        boolean success = JProcesses.killProcess(3844).isSuccess();
    }
}
