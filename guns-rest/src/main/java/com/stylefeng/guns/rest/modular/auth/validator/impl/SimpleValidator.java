package com.stylefeng.guns.rest.modular.auth.validator.impl;

import org.springframework.stereotype.Service;

import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import com.stylefeng.guns.rest.modular.auth.validator.dto.Credence;

/**
 * 直接验证账号密码是不是admin
 *
 * @author fengshuonan
 * @date 2017-08-23 12:34
 */
@Service
public class SimpleValidator implements IReqValidator {

    private static String USER_NAME = "admin";

    private static String PASSWORD = "admin";

	@Override
	public boolean validate(Credence credence) {
		// TODO Auto-generated method stub
		return false;
	}

}
