package com.xiao.service.impl.account;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiao.service.account.FormWithdrawServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("formWithdrawService")
@Transactional
public class FormWithdrawServiceImpl extends CommonServiceImpl implements FormWithdrawServiceI {
	
}