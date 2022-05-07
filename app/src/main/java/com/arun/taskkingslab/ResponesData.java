package com.arun.taskkingslab;

import java.util.List;

public class ResponesData {

    public List<Datum> data ;
    public List<Summary> summary ;
    public List<GridData> grid_data ;
    public class Datum
    {
        public String client_id ;
        public String company_id ;
        public String client_name ;
        public String client_code ;
        public String created_date ;
        public String location_lat ;
        public String location_lng ;
        public String client_location ;
        public String client_mobile_number ;
        public String client_email ;
        public String whatsapp_linked ;
        public String full_name ;
        public String total_enq ;
        public String closed_enq ;
        public String grand_total ;
        public String advance ;
        public String balance ;
        public String comments ;
        public String created_user_id ;
        public String lastupdate_date ;
        public String AddContact ;
        public String last_updated_date_left ;
        public String lastfollow_up_date ;
        public String lastfollow_up_date_left ;
        public String client_region_id ;
        public String gst_number ;
        public String region_name ;
        public String assigned_user_id ;
        public String Assigned_user_name ;
        public String opening_balance ;
        public String status_id ;
        public String client_branch ;
        public String branch_name ;
        public String drop_down_1 ;
        public String drop_down_2 ;
        public String drop_down_3 ;
        public String drop_down_4 ;
        public String text_box_1 ;
        public String text_box_2 ;
        public String text_box_3 ;
        public String text_box_4 ;
        public String client_type_id ;
        public String type_name ;
        public String user_logo ;
        public String client_route ;
        public String route_name ;
        public String Add_Location ;
    }

    public class GridData
    {
        public String lead_count ;
        public String suspect_count ;
        public String prospect_count ;
        public String client_count ;
        public String today_count ;
        public String upcoming_count ;
        public String pending_count ;
        public String all_count ;
    }

    

    public class Summary
    {
        public String summary ;
    }


}
