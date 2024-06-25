package com.fsje.dairy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fsje.dairy.dao.DiaryDao;
import com.fsje.dairy.dto.DiaryDto;

import lombok.AllArgsConstructor;

/**
 * @file   : DiaryService
 * @author : KSH
 * @since  : 2024.06.09
 * @brief  : 다이어리 Service
 */
@Service
@AllArgsConstructor
public class DiaryService {
	private final DiaryDao diaryDao;
	
	/**
	 * @method : diaryList
	 * @author : KSH
	 * @since  : 2024.06.09
	 * @param  : {obejct} DiaryDto
	 * @return : {list} List<DiaryDto>
	 */
	public List<DiaryDto> diaryList(DiaryDto diaryDto) {
		return diaryDao.diarySelect(diaryDto);
	}
}
