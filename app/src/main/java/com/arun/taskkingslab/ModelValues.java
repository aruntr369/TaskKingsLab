package com.arun.taskkingslab;

public class ModelValues {
    private String login_user_id;
    private String company_id;
    private String S_CustromerCompany;
    private String S_enquirystatus;
    private String S_email;
    private String S_comment;
    private String S_FollowUpDate;
    private String S_FollowUpDate_Sort_By;
    private String S_ORDERBY;
    private String S_Updated_Sort_By;
    private Object[] S_Client_type;
    private Object[] S_region;
    private Object[] S_branch;
    private Object[] sAssigned;
    private Object[] dynamicdd1;
    private Object[] dynamicdd2;
    private String S_FromDate;
    private String S_ToDate;
    private String save_search_sort_code;
    private String sort_type;
    private long S_grid_search;

    public ModelValues(String login_user_id, String company_id, String s_CustromerCompany, String s_enquirystatus, String s_email, String s_comment, String s_FollowUpDate, String s_FollowUpDate_Sort_By, String s_ORDERBY, String s_Updated_Sort_By, String s_FromDate, String s_ToDate, String save_search_sort_code, String sort_type, long s_grid_search) {
        this.login_user_id = login_user_id;
        this.company_id = company_id;
        this.S_CustromerCompany = s_CustromerCompany;
        S_enquirystatus = s_enquirystatus;
        S_email = s_email;
        S_comment = s_comment;
        S_FollowUpDate = s_FollowUpDate;
        S_FollowUpDate_Sort_By = s_FollowUpDate_Sort_By;
        S_ORDERBY = s_ORDERBY;
        S_Updated_Sort_By = s_Updated_Sort_By;
        S_FromDate = s_FromDate;
        S_ToDate = s_ToDate;
        this.save_search_sort_code = save_search_sort_code;
        this.sort_type = sort_type;
        S_grid_search = s_grid_search;
    }

    public String getLogin_user_id() {
        return login_user_id;
    }

    public void setLogin_user_id(String login_user_id) {
        this.login_user_id = login_user_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getS_CustromerCompany() {
        return S_CustromerCompany;
    }

    public void setS_CustromerCompany(String s_CustromerCompany) {
        S_CustromerCompany = s_CustromerCompany;
    }

    public String getS_enquirystatus() {
        return S_enquirystatus;
    }

    public void setS_enquirystatus(String s_enquirystatus) {
        S_enquirystatus = s_enquirystatus;
    }

    public String getS_email() {
        return S_email;
    }

    public void setS_email(String s_email) {
        S_email = s_email;
    }

    public String getS_comment() {
        return S_comment;
    }

    public void setS_comment(String s_comment) {
        S_comment = s_comment;
    }

    public String getS_FollowUpDate() {
        return S_FollowUpDate;
    }

    public void setS_FollowUpDate(String s_FollowUpDate) {
        S_FollowUpDate = s_FollowUpDate;
    }

    public String getS_FollowUpDate_Sort_By() {
        return S_FollowUpDate_Sort_By;
    }

    public void setS_FollowUpDate_Sort_By(String s_FollowUpDate_Sort_By) {
        S_FollowUpDate_Sort_By = s_FollowUpDate_Sort_By;
    }

    public String getS_ORDERBY() {
        return S_ORDERBY;
    }

    public void setS_ORDERBY(String s_ORDERBY) {
        S_ORDERBY = s_ORDERBY;
    }

    public String getS_Updated_Sort_By() {
        return S_Updated_Sort_By;
    }

    public void setS_Updated_Sort_By(String s_Updated_Sort_By) {
        S_Updated_Sort_By = s_Updated_Sort_By;
    }

    public Object[] getS_Client_type() {
        return S_Client_type;
    }

    public void setS_Client_type(Object[] s_Client_type) {
        S_Client_type = s_Client_type;
    }

    public Object[] getS_region() {
        return S_region;
    }

    public void setS_region(Object[] s_region) {
        S_region = s_region;
    }

    public Object[] getS_branch() {
        return S_branch;
    }

    public void setS_branch(Object[] s_branch) {
        S_branch = s_branch;
    }

    public Object[] getsAssigned() {
        return sAssigned;
    }

    public void setsAssigned(Object[] sAssigned) {
        this.sAssigned = sAssigned;
    }

    public Object[] getDynamicdd1() {
        return dynamicdd1;
    }

    public void setDynamicdd1(Object[] dynamicdd1) {
        this.dynamicdd1 = dynamicdd1;
    }

    public Object[] getDynamicdd2() {
        return dynamicdd2;
    }

    public void setDynamicdd2(Object[] dynamicdd2) {
        this.dynamicdd2 = dynamicdd2;
    }

    public String getS_FromDate() {
        return S_FromDate;
    }

    public void setS_FromDate(String s_FromDate) {
        S_FromDate = s_FromDate;
    }

    public String getS_ToDate() {
        return S_ToDate;
    }

    public void setS_ToDate(String s_ToDate) {
        S_ToDate = s_ToDate;
    }

    public String getSave_search_sort_code() {
        return save_search_sort_code;
    }

    public void setSave_search_sort_code(String save_search_sort_code) {
        this.save_search_sort_code = save_search_sort_code;
    }

    public String getSort_type() {
        return sort_type;
    }

    public void setSort_type(String sort_type) {
        this.sort_type = sort_type;
    }

    public long getS_grid_search() {
        return S_grid_search;
    }

    public void setS_grid_search(long s_grid_search) {
        S_grid_search = s_grid_search;
    }
}
