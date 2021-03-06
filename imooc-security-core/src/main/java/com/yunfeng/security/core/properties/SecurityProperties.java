package com.yunfeng.security.core.properties;

import com.yunfeng.security.core.properties.code.ValidateCodeProperties;
import com.yunfeng.security.core.properties.oauth.OAuth2Properties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-11-12
 */

@ConfigurationProperties(prefix = "imooc.security")
@Data
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    private SocialProperties social = new SocialProperties();

    private OAuth2Properties oauth2 = new OAuth2Properties();



}
