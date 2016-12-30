package com.lianpay.share.config;

/**
* 商户配置信息
* @author guoyx e-mail:guoyx@lianlian.com
* @date:2013-6-25 下午01:45:40
* @version :1.0
*
*/
public interface PartnerConfig{
//    // 银通公钥
//    String YT_PUB_KEY     = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB";
//    // 商户私钥
//    String TRADER_PRI_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAOilN4tR7HpNYvSBra/DzebemoAiGtGeaxa+qebx/O2YAdUFPI+xTKTX2ETyqSzGfbxXpmSax7tXOdoa3uyaFnhKRGRvLdq1kTSTu7q5s6gTryxVH2m62Py8Pw0sKcuuV0CxtxkrxUzGQN+QSxf+TyNAv5rYi/ayvsDgWdB3cRqbAgMBAAECgYEAj02d/jqTcO6UQspSY484GLsL7luTq4Vqr5L4cyKiSvQ0RLQ6DsUG0g+Gz0muPb9ymf5fp17UIyjioN+ma5WquncHGm6ElIuRv2jYbGOnl9q2cMyNsAZCiSWfR++op+6UZbzpoNDiYzeKbNUz6L1fJjzCt52w/RbkDncJd2mVDRkCQQD/Uz3QnrWfCeWmBbsAZVoM57n01k7hyLWmDMYoKh8vnzKjrWScDkaQ6qGTbPVL3x0EBoxgb/smnT6/A5XyB9bvAkEA6UKhP1KLi/ImaLFUgLvEvmbUrpzY2I1+jgdsoj9Bm4a8K+KROsnNAIvRsKNgJPWd64uuQntUFPKkcyfBV1MXFQJBAJGs3Mf6xYVIEE75VgiTyx0x2VdoLvmDmqBzCVxBLCnvmuToOU8QlhJ4zFdhA1OWqOdzFQSw34rYjMRPN24wKuECQEqpYhVzpWkA9BxUjli6QUo0feT6HUqLV7O8WqBAIQ7X/IkLdzLa/vwqxM6GLLMHzylixz9OXGZsGAkn83GxDdUCQA9+pQOitY0WranUHeZFKWAHZszSjtbe6wDAdiKdXCfig0/rOdxAODCbQrQs7PYy1ed8DuVQlHPwRGtokVGHATU=";
//    // MD5 KEY
//    String MD5_KEY        = "201408071000001546_test_20140815";
//    // 接收异步通知地址
//    String NOTIFY_URL     = "http://ip:port/wepdemo/notify.htm";
//    // 支付结束后返回地址
//    String URL_RETURN     = "http://ip:port/wepdemo/urlReturn.jsp";
//    // 商户编号
//    String OID_PARTNER    = "201408071000001546";
//    // 签名方式 RSA或MD5
//    String SIGN_TYPE      = "RSA";
//    // 接口版本号，固定1.0
//    String VERSION        = "1.0";
//
//    // 业务类型，连连支付根据商户业务为商户开设的业务类型； （101001：虚拟商品销售、109001：实物商品销售、108001：外部账户充值）
//
//    String BUSI_PARTNER   = "101001";
    
    /**
     * 商户信息
     */
	// 商户编号
	String OID_PARTNER    = "201507091000404503";
    // 银通公钥
    String YT_PUB_KEY     = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB\r\nMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB";
    // 商户私钥
    String TRADER_PRI_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKd+oYEwcFq+9wtC/4ZhiWcMB79k8Yb01y0/JkdNv9uVMM6/AuTxB9W0WkyqLn4MvUkyx/FnGnY4jSopvwW3T+mVBd9zDwSMFAe9YOn7tSZKUo7McAe/TIY5ZuuZfzAtiIXZWoGId7CEOw49KJUQWj74ouAJsRVvvbnyOmJ0j6orAgMBAAECgYB+N5So78GbAJDVsbUwpMuQFaa4+e5wDo0gEZhc3yAW7oQLKDGcKG4JApGReCT049C4GkZFibaNI+xsu2yxeAQE/v+aCcB9AYqMhfATVqwkBFJFd6pH7GTzWkX/1Z4tbTPBAudau9f0i38+eNRIzk8/gTgLimvkU8IBhEjmYdraIQJBANYO5f3XHNOTlrIpkX5rp5JMMCEIwPrkZE01s8No5SzOKeUgqOVT5XxL3w3EhuGZVGCOfI3uoLt80uWorvEOPbMCQQDIUB4ZbGlib0M6Z7PaRjHSdcSEsXTomtnH0RTb5IjrbWly5vjKWxR3KpGEyE8mx+UA79xSiCAhIRlxbjiIYdWpAkEApMOw+lNyx9SJoTdn20RoJq7oOPUw/a2BGwEkDlyWUoeaLdiWyHZsZOFNnp5QKCRKk0v5yZINPGNXPhk6FygcCwJBAJLVZ7rrJTTqqjUd31CZM9w6R5udGT2IhStbsBagJ12sDigT9zseGJphsdnLm3mp/cv6B17YOfUO9j+XtAkE7kECQH6IhqqyRL+NOHAYynLo41XdrIwbtVxPUiwxHfEz4obBrq2+/gJJlPEn8H+U4cUXmQg7kulZZzJq/NeulZxw4r4=";
    // MD5 KEY
    String MD5_KEY        = "201507091000404503_test_20140815";
    // 接收异步通知地址
    String NOTIFY_URL     = "http://ip:port/wepdemo/notify.htm";
    // 支付结束后返回地址
    String URL_RETURN     = "http://ip:port/wepdemo/urlReturn.jsp";
    // 签名方式 RSA或MD5
    String SIGN_TYPE      = "RSA";
    // 接口版本号，固定1.0
    String VERSION        = "1.1";
    
    // 业务类型，连连支付根据商户业务为商户开设的业务类型； （101001：虚拟商品销售、109001：实物商品销售、108001：外部账户充值）
    
    String BUSI_PARTNER   = "101001";
    //1-Android 2-ios 3-WAP   该系统使用WAP方式
    String APP_REQUEST = "3";
}
