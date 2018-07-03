package com.service;

import com.pojo.Paper;

import java.util.List;

/**
 * Created by Administrator on 2018/7/2.
 */
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
