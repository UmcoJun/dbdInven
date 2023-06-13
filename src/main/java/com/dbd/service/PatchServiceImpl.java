package com.dbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbd.mapper.PatchMapper;

@Service
public class PatchServiceImpl implements PatchService {

	@Autowired
	private PatchMapper patchMapper;
}
