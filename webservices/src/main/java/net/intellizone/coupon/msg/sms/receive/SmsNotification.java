package net.intellizone.coupon.msg.sms.receive;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import net.intellizone.coupon.msg.sms.common.DeliveryInformation;
import net.intellizone.coupon.msg.sms.common.SmsMessage;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SmsNotification", targetNamespace = "http://www.chinatelecom.com.cn/wsdl/ctcc/sms/notification/v2_1/interface")
public interface SmsNotification {

	/**
	 * 
	 * @param message
	 * @param registrationIdentifier
	 */
	@WebMethod
	@RequestWrapper(localName = "notifySmsReception", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local", className = "net.intellizone.coupon.msg.sms.receive.NotifySmsReception")
	@ResponseWrapper(localName = "notifySmsReceptionResponse", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local", className = "net.intellizone.coupon.msg.sms.receive.NotifySmsReceptionResponse")
	public void notifySmsReception(
			@WebParam(name = "registrationIdentifier", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local")
			String registrationIdentifier,
			@WebParam(name = "message", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local")
			SmsMessage message);

	/**
	 * 
	 * @param correlator
	 * @param deliveryStatus
	 */
	@WebMethod
	@RequestWrapper(localName = "notifySmsDeliveryReceipt", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local", className = "net.intellizone.coupon.msg.sms.receive.NotifySmsDeliveryReceipt")
	@ResponseWrapper(localName = "notifySmsDeliveryReceiptResponse", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local", className = "net.intellizone.coupon.msg.sms.receive.NotifySmsDeliveryReceiptResponse")
	public void notifySmsDeliveryReceipt(
			@WebParam(name = "correlator", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local")
			String correlator,
			@WebParam(name = "deliveryStatus", targetNamespace = "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local")
			DeliveryInformation deliveryStatus);

}
