package top.zjp.medicine.online.datav.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.zjp.medicine.online.datav.model.entity.TStudent;
import top.zjp.medicine.online.datav.mapper.TStudentMapper;
import top.zjp.medicine.online.datav.service.TStudentService;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.service.impl
 * @Project: medicine-online-data-view-screen0
 * @name: TStudentServiceImpl
 * @Date: 2024/12/6 18:09
 * @FileName: TStudentServiceImpl
 * @description:
 */
@Service
@AllArgsConstructor
public class TStudentServiceImpl extends ServiceImpl<TStudentMapper, TStudent> implements TStudentService {
}
