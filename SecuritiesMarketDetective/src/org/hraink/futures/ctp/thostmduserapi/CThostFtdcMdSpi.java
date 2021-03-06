package org.hraink.futures.ctp.thostmduserapi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
import org.hraink.futures.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import org.hraink.futures.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import org.hraink.futures.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import org.hraink.futures.ctp.thostftdcuserapistruct.CThostFtdcSpecificInstrumentField;
import org.hraink.futures.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcMdSpi extends CPPObject {
	public CThostFtdcMdSpi() {
		super();
	}
	@Virtual(0)
	public void OnFrontConnected() {
	}
	@Virtual(1) 
	native public void OnFrontDisconnected(int nReason);
	@Virtual(2) 
	native public void OnHeartBeatWarning(int nTimeLapse);
	@Virtual(3) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
//	@Virtual(3) 
//	protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	@Virtual(4) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
//	@Virtual(4) 
//	protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	@Virtual(5) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
//	@Virtual(5) 
//	protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	@Virtual(6) 
	public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
//	@Virtual(6) 
//	protected native void OnRspSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	@Virtual(7) 
	public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
//	@Virtual(7) 
//	protected native void OnRspUnSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	@Virtual(8) 
	public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData) {
	}
//	@Virtual(8) 
//	protected native void OnRtnDepthMarketData(@Ptr long pDepthMarketData);
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}
