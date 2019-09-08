package com.toonext.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.toonext.EnvConst;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"count", "pageNum", "maxPage", "pageSize", "result"})
public class ViewPage {
    private List result;
    private long count;
    private int maxPage;
    private int pageNum;
    private int pageSize;


    public ViewPage(List result, long count, int maxPage, int pageNum, int pageSize) {
        this.result = result;
        this.count = count;
        this.maxPage = maxPage;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public ViewPage() {
        this(new ArrayList(), 0, 1, 1, EnvConst.DEFAULT_PAGE_SIZE);
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

}