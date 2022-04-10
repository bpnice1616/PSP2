package com.wjB.studentmanager.mapper;

import com.wjB.studentmanager.domain.Score;
import com.wjB.studentmanager.domain.ScoreStats;

import java.util.List;
import java.util.Map;

/**
 * @Classname ScoreMapper
 * @Description None
 * @Created by WJB
 */
public interface ScoreMapper {
    List<Score> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addScore(Score score);

    Score isScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
