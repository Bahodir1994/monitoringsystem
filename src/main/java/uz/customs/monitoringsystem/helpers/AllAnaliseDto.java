package uz.customs.monitoringsystem.helpers;

import com.profesorfalken.jsensors.model.components.Cpu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jutils.jprocesses.model.ProcessInfo;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AllAnaliseDto {
    List<Cpu> cpuList;
    List<ProcessInfo> processInfoList;
}
