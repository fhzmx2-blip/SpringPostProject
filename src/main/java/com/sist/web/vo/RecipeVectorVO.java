package com.sist.web.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeVectorVO {
   private Long id;
   private Long recipe_id;
   private String content;
   private float[] embedding;
}
