package com.yunfeng.security.core.properties;

import com.yunfeng.security.core.constants.SecurityConstants;
import lombok.Data;

@Data
public class SessionProperties {

	/**
	 * 同一个用户在系统中的最大session数，默认1
	 */
	private int maximumSessions = 1;
	/**
	 * 达到最大session时是否阻止新的登录请求，默认为false，不阻止，新的登录会将老的登录失效掉
	 */
	private boolean maxSessionsPreventsLogin;

	private String sessionInvalidUrl = SecurityConstants.DEFAULT_SESSION_INVALID_URL;


	public boolean isMaxSessionsPreventsLogin() {
		return maxSessionsPreventsLogin;
	}

	public void setMaxSessionsPreventsLogin(boolean maxSessionsPreventsLogin) {
		this.maxSessionsPreventsLogin = maxSessionsPreventsLogin;
	}
}