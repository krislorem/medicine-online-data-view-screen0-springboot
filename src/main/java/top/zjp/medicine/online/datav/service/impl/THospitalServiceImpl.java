package top.zjp.medicine.online.datav.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.zjp.medicine.online.datav.mapper.THospitalMapper;
import top.zjp.medicine.online.datav.model.entity.THospital;
import top.zjp.medicine.online.datav.service.THospitalService;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.service.impl
 * @Project: medicine-online-data-view-screen0
 * @name: THospitalServiceImpl
 * @Date: 2024/12/7 13:02
 * @FileName: THospitalServiceImpl
 * @description:
 */
@Service
@AllArgsConstructor
public class THospitalServiceImpl extends ServiceImpl<THospitalMapper, THospital> implements THospitalService {
}
