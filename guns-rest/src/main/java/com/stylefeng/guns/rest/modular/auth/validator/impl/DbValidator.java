package com.stylefeng.guns.rest.modular.auth.validator.impl;

import org.springframework.stereotype.Service;

import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import com.stylefeng.guns.rest.modular.auth.validator.dto.Credence;

/**
 * 账号密码验证
 *
 * @author fengshuonan
 * @date 2017-08-23 12:34
 */
@Service
public class DbValidator implements IReqValidator {

	@Override
	public boolean validate(Credence credence) {
		// TODO Auto-generated method stub
		return false;
	}
}
