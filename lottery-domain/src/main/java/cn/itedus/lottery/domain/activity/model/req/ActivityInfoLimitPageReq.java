package cn.itedus.lottery.domain.activity.model.req;

import cn.itedus.lottery.common.PageRequest;

/**
 * @description: 活动分页查询请求对象
 *
 * @date: 2021/12/11
 *
 *
 */
public class ActivityInfoLimitPageReq extends PageRequest {

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    public ActivityInfoLimitPageReq(int page, int rows) {
        super(page, rows);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

}
