package com.min.edu.dto;

import java.util.List;

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
public class RootBoardDto {

	private int seq;
	private String id;
	private String title;
	private String content;
	private String delflag;
	private String regdate;
	
	private List<ReplyBoardDto> rDto;
	
}
