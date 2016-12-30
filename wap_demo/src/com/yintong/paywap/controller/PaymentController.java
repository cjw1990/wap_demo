package com.yintong.paywap.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianpay.share.config.PartnerConfig;
import com.lianpay.share.security.Md5Algorithm;
import com.lianpay.share.security.RSAUtil;
import com.lianpay.share.util.FuncUtils;
import com.yintong.paywap.domain.PaymentInfo;

public class PaymentController {
	
	public String paymnet(HttpServletRequest request){
		JSONObject reqJSONObject = new JSONObject();
		
		StringBuffer strBuf = new StringBuffer();
		PaymentInfo payInfo = new PaymentInfo();
		//银行卡号对应的用户名   非必须
	    if (!FuncUtils.isNull(request.getParameter("acct_name"))){
	        strBuf.append("acct_name=");
	        strBuf.append(request.getParameter("acct_name"));
	        strBuf.append("&app_request="+PartnerConfig.APP_REQUEST);
	    } else {
	        strBuf.append("app_request="+PartnerConfig.APP_REQUEST);
	    }
	    payInfo.setApp_request(PartnerConfig.APP_REQUEST);
	    
	    //支付业背景颜色
	    if (!FuncUtils.isNull(request.getParameter("bg_color"))) {
	    	strBuf.append("&bg_color=");
	    	strBuf.append(request.getParameter("bg_color"));
	    	payInfo.setBg_color(request.getParameter("bg_color"));
	    }
	    //商户业务类型   
	    strBuf.append("&busi_partner="+PartnerConfig.BUSI_PARTNER);
	    payInfo.setBusi_partner(PartnerConfig.BUSI_PARTNER);
	    //银行卡号非必须
	    if (!FuncUtils.isNull(request.getParameter("card_no"))) {
	        strBuf.append("&card_no="+request.getParameter("card_no"));
	        payInfo.setCard_no(request.getParameter("card_no"));
	    }
	    //商户订单时间===============
	    strBuf.append("&dt_order=");
	    strBuf.append(request.getParameter("dt_order"));
	    payInfo.setDt_order(request.getParameter("dt_order"));
	    //证件号码  非必须
	    if (!FuncUtils.isNull(request.getParameter("id_no"))) {
	        strBuf.append("&id_no=");
	        strBuf.append(request.getParameter("id_no"));
	        payInfo.setId_no(request.getParameter("id_no"));
	    }
	    //订单描述信息  非必须
	    if (!FuncUtils.isNull(request.getParameter("info_order")))
	    {
	        strBuf.append("&info_order=");
	        strBuf.append(request.getParameter("info_order"));
	        payInfo.setInfo_order(request.getParameter("info_order"));
	    }
	    //订单交易额  
	    strBuf.append("&money_order=");
	    strBuf.append(request.getParameter("money_order"));
	    payInfo.setMoney_order(request.getParameter("money_order"));
	    if (!FuncUtils.isNull(request.getParameter("name_goods")))
	    {
	        strBuf.append("&name_goods=");
	        strBuf.append(request.getParameter("name_goods"));
	        payInfo.setName_goods(request.getParameter("name_goods"));
	    }
	    if (!FuncUtils.isNull(request.getParameter("no_agree")))
	    {
	        strBuf.append("&no_agree=");
	        strBuf.append(request.getParameter("no_agree"));
	        payInfo.setNo_agree(request.getParameter("no_agree"));
	    }
	    strBuf.append("&no_order=");
	    strBuf.append(request.getParameter("no_order"));
	    payInfo.setNo_order(request.getParameter("no_order"));
	    strBuf.append("&notify_url=");
	    strBuf.append(request.getParameter("notify_url"));
	    payInfo.setNotify_url(request.getParameter("notify_url"));
	    strBuf.append("&oid_partner=");
	    strBuf.append(request.getParameter("oid_partner"));
	    payInfo.setOid_partner(request.getParameter("oid_partner"));
	    if (!FuncUtils.isNull(request.getParameter("risk_item")))
	    {
	        strBuf.append("&risk_item=");
	        strBuf.append(request.getParameter("risk_item"));
	        payInfo.setRisk_item(request.getParameter("risk_item"));
	    }
	    strBuf.append("&sign_type=");
	    strBuf.append(request.getParameter("sign_type"));
	    payInfo.setSign_type(request.getParameter("sign_type"));
	    if (!FuncUtils.isNull(request.getParameter("url_return")))
	    {
	        strBuf.append("&url_return=");
	        strBuf.append(request.getParameter("url_return"));
	        payInfo.setUrl_return(request.getParameter("url_return"));
	    }
	    if (!FuncUtils.isNull(request.getParameter("user_id")))
	    {
	        strBuf.append("&user_id=");
	        strBuf.append(request.getParameter("user_id"));
	        payInfo.setUser_id(request.getParameter("user_id"));
	    }
	    if (!FuncUtils.isNull(request.getParameter("valid_order")))
	    {
	        strBuf.append("&valid_order=");
	        strBuf.append(request.getParameter("valid_order"));
	        payInfo.setValid_order(request.getParameter("valid_order"));
	    }
	    
	    
	    String sign_src = strBuf.toString();
	    if (sign_src.startsWith("&"))
	    {
	        sign_src = sign_src.substring(1);
	    }
	    String sign = "";
	    if ("RSA".equals(request.getParameter("sign_type"))) {
	        sign = RSAUtil.sign(PartnerConfig.TRADER_PRI_KEY, sign_src);
	    } else {
	        sign_src += "&key=" + PartnerConfig.MD5_KEY;
	        try {
				sign = Md5Algorithm.getInstance().md5Digest(
				        sign_src.getBytes("utf-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	    }
	    
	    payInfo.setSign(sign);
	    String req_data = JSON.toJSONString(payInfo);
	    
	    return JSON.toJSONString(payInfo);
	}
}
