package net.intellizone.coupon.ismp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IsmpSpEngine", targetNamespace = "http://sp.ismp.chinatelecom.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IsmpSpEngine {

	/**
	 * 
	 * @param orderRelationUpdateNotifyReq
	 * @return returns net.intellizone.coupon.ismp.Response
	 */
	@WebMethod
	@WebResult(name = "orderRelationUpdateNotifyReturn", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "orderRelationUpdateNotifyReturn")
	public Response orderRelationUpdateNotify(
			@WebParam(name = "orderRelationUpdateNotifyReq", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "orderRelationUpdateNotifyReq")
			OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq);

	/**
	 * 
	 * @param serviceConsumeNotifyReqPara
	 * @return returns net.intellizone.coupon.ismp.Response
	 */
	@WebMethod
	@WebResult(name = "serviceConsumeNotifyReturn", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "serviceConsumeNotifyReturn")
	public Response serviceConsumeNotify(
			@WebParam(name = "serviceConsumeNotifyReqPara", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "serviceConsumeNotifyReqPara")
			ServiceConsumeNotifyReq serviceConsumeNotifyReqPara);

	/**
	 * 
	 * @param notifyManagementInfoReq
	 * @return returns net.intellizone.coupon.ismp.NotifyManagementInfoRsp
	 */
	@WebMethod
	@WebResult(name = "notifyManagementInfoReturn", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "notifyManagementInfoReturn")
	public NotifyManagementInfoRsp notifyManagementInfo(
			@WebParam(name = "notifyManagementInfoReq", targetNamespace = "http://sp.ismp.chinatelecom.com", partName = "notifyManagementInfoReq")
			NotifyManagementInfoReq notifyManagementInfoReq);

}
