package com.min.edu.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReplyBoardDto {

	private int seq;
	private int ref;
	private String p_id;
	private String p_content;
	private String p_delflag;
	private String p_regdate;

}
