package com.toobei.tb.activity;

import android.content.Intent;

import com.toobei.common.TopBaseActivity;
import com.toobei.common.activity.TopResetPayPwdIdentity;

/**
 * 公司: tophlc
 * 类说明：重置交易密码 填写用户名和身份证界面
 * @date 2016-3-23
 */
public class ResetPayPwdIdentity extends TopResetPayPwdIdentity{

	@Override
	protected void onVerifyIdCardSuccess() {
		skipActivity(this, ResetPayPwdVcode.class);
	}

	@Override
	protected Intent getGestureActivityIntent(TopBaseActivity activity) {
		return new Intent(activity, GestureActivity.class);
	}

}
