package org.zerock.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class SampleDTOList {
	private List<SampleDTO> list;
	
	public SampleDTOList() {
		list = new ArrayList<>();
	}
	// 초기화 해주는거인데 왜 해주는지 모르겠음...
	// 그냥 교육자료니까 넣어둔거같음
}
