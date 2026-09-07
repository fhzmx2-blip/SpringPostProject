package com.sist.web.vo;

import lombok.Data;

@Data
public class RecipeVO {
  private int rcp_seq,hit;
  private double info_eng,info_car,info_pro,
                 info_fat,info_na;
  private String rcp_nm,rcp_way2,rcp_pat2,hash_tag,
          att_file_no_main,info_wgt,att_file_no_mk,
          rcp_parts_dtls,rcp_na_tip,user_id;
}
