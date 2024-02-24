package cn.itedus.lottery.interfaces.assembler;

import cn.itedus.lottery.domain.activity.model.vo.ActivityVO;
import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardVO;
import cn.itedus.lottery.rpc.activity.booth.dto.AwardDTO;
import cn.itedus.lottery.rpc.activity.deploy.dto.ActivityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @description: 活动对象转换配置
 *
 * @date: 2021/12/11
 *
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ActivityMapping extends IMapping<ActivityVO, ActivityDTO>{

    @Override
    List<ActivityDTO> sourceToTarget(List<ActivityVO> var1);

}
