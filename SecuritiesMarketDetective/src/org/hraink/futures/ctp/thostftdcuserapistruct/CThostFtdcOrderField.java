package org.hraink.futures.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcOrderField extends StructObject {
	public CThostFtdcOrderField() {
		super();
	}
	/// \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/// \u6295\u8d44\u8005\u4ee3\u7801
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/// \u5408\u7ea6\u4ee3\u7801
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/// \u62a5\u5355\u5f15\u7528
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/// \u7528\u6237\u4ee3\u7801
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/// \u62a5\u5355\u4ef7\u683c\u6761\u4ef6
	@Field(5) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 5);
	}
	/// \u62a5\u5355\u4ef7\u683c\u6761\u4ef6
	@Field(5) 
	public CThostFtdcOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 5, OrderPriceType);
		return this;
	}
	/// \u4e70\u5356\u65b9\u5411
	@Field(6) 
	public byte Direction() {
		return this.io.getByteField(this, 6);
	}
	/// \u4e70\u5356\u65b9\u5411
	@Field(6) 
	public CThostFtdcOrderField Direction(byte Direction) {
		this.io.setByteField(this, 6, Direction);
		return this;
	}
	/// \u7ec4\u5408\u5f00\u5e73\u6807\u5fd7
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 7);
	}
	/// \u7ec4\u5408\u6295\u673a\u5957\u4fdd\u6807\u5fd7
	@Array({5}) 
	@Field(8) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 8);
	}
	/// \u4ef7\u683c
	@Field(9) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/// \u4ef7\u683c
	@Field(9) 
	public CThostFtdcOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 9, LimitPrice);
		return this;
	}
	/// \u6570\u91cf
	@Field(10) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 10);
	}
	/// \u6570\u91cf
	@Field(10) 
	public CThostFtdcOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 10, VolumeTotalOriginal);
		return this;
	}
	/// \u6709\u6548\u671f\u7c7b\u578b
	@Field(11) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 11);
	}
	/// \u6709\u6548\u671f\u7c7b\u578b
	@Field(11) 
	public CThostFtdcOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 11, TimeCondition);
		return this;
	}
	/// GTD\u65e5\u671f
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 12);
	}
	/// \u6210\u4ea4\u91cf\u7c7b\u578b
	@Field(13) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 13);
	}
	/// \u6210\u4ea4\u91cf\u7c7b\u578b
	@Field(13) 
	public CThostFtdcOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 13, VolumeCondition);
		return this;
	}
	/// \u6700\u5c0f\u6210\u4ea4\u91cf
	@Field(14) 
	public int MinVolume() {
		return this.io.getIntField(this, 14);
	}
	/// \u6700\u5c0f\u6210\u4ea4\u91cf
	@Field(14) 
	public CThostFtdcOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 14, MinVolume);
		return this;
	}
	/// \u89e6\u53d1\u6761\u4ef6
	@Field(15) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 15);
	}
	/// \u89e6\u53d1\u6761\u4ef6
	@Field(15) 
	public CThostFtdcOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 15, ContingentCondition);
		return this;
	}
	/// \u6b62\u635f\u4ef7
	@Field(16) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 16);
	}
	/// \u6b62\u635f\u4ef7
	@Field(16) 
	public CThostFtdcOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 16, StopPrice);
		return this;
	}
	/// \u5f3a\u5e73\u539f\u56e0
	@Field(17) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 17);
	}
	/// \u5f3a\u5e73\u539f\u56e0
	@Field(17) 
	public CThostFtdcOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 17, ForceCloseReason);
		return this;
	}
	/// \u81ea\u52a8\u6302\u8d77\u6807\u5fd7
	@Field(18) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 18);
	}
	/// \u81ea\u52a8\u6302\u8d77\u6807\u5fd7
	@Field(18) 
	public CThostFtdcOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 18, IsAutoSuspend);
		return this;
	}
	/// \u4e1a\u52a1\u5355\u5143
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 19);
	}
	/// \u8bf7\u6c42\u7f16\u53f7
	@Field(20) 
	public int RequestID() {
		return this.io.getIntField(this, 20);
	}
	/// \u8bf7\u6c42\u7f16\u53f7
	@Field(20) 
	public CThostFtdcOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 20, RequestID);
		return this;
	}
	/// \u672c\u5730\u62a5\u5355\u7f16\u53f7
	@Array({13}) 
	@Field(21) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 21);
	}
	/// \u4ea4\u6613\u6240\u4ee3\u7801
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 22);
	}
	/// \u4f1a\u5458\u4ee3\u7801
	@Array({11}) 
	@Field(23) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 23);
	}
	/// \u5ba2\u6237\u4ee3\u7801
	@Array({11}) 
	@Field(24) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 24);
	}
	/// \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801
	@Array({31}) 
	@Field(25) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 25);
	}
	/// \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	@Array({21}) 
	@Field(26) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 26);
	}
	/// \u5b89\u88c5\u7f16\u53f7
	@Field(27) 
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}
	/// \u5b89\u88c5\u7f16\u53f7
	@Field(27) 
	public CThostFtdcOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}
	/// \u62a5\u5355\u63d0\u4ea4\u72b6\u6001
	@Field(28) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 28);
	}
	/// \u62a5\u5355\u63d0\u4ea4\u72b6\u6001
	@Field(28) 
	public CThostFtdcOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 28, OrderSubmitStatus);
		return this;
	}
	/// \u62a5\u5355\u63d0\u793a\u5e8f\u53f7
	@Field(29) 
	public int NotifySequence() {
		return this.io.getIntField(this, 29);
	}
	/// \u62a5\u5355\u63d0\u793a\u5e8f\u53f7
	@Field(29) 
	public CThostFtdcOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 29, NotifySequence);
		return this;
	}
	/// \u4ea4\u6613\u65e5
	@Array({9}) 
	@Field(30) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 30);
	}
	/// \u7ed3\u7b97\u7f16\u53f7
	@Field(31) 
	public int SettlementID() {
		return this.io.getIntField(this, 31);
	}
	/// \u7ed3\u7b97\u7f16\u53f7
	@Field(31) 
	public CThostFtdcOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 31, SettlementID);
		return this;
	}
	/// \u62a5\u5355\u7f16\u53f7
	@Array({21}) 
	@Field(32) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 32);
	}
	/// \u62a5\u5355\u6765\u6e90
	@Field(33) 
	public byte OrderSource() {
		return this.io.getByteField(this, 33);
	}
	/// \u62a5\u5355\u6765\u6e90
	@Field(33) 
	public CThostFtdcOrderField OrderSource(byte OrderSource) {
		this.io.setByteField(this, 33, OrderSource);
		return this;
	}
	/// \u62a5\u5355\u72b6\u6001
	@Field(34) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 34);
	}
	/// \u62a5\u5355\u72b6\u6001
	@Field(34) 
	public CThostFtdcOrderField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 34, OrderStatus);
		return this;
	}
	/// \u62a5\u5355\u7c7b\u578b
	@Field(35) 
	public byte OrderType() {
		return this.io.getByteField(this, 35);
	}
	/// \u62a5\u5355\u7c7b\u578b
	@Field(35) 
	public CThostFtdcOrderField OrderType(byte OrderType) {
		this.io.setByteField(this, 35, OrderType);
		return this;
	}
	/// \u4eca\u6210\u4ea4\u6570\u91cf
	@Field(36) 
	public int VolumeTraded() {
		return this.io.getIntField(this, 36);
	}
	/// \u4eca\u6210\u4ea4\u6570\u91cf
	@Field(36) 
	public CThostFtdcOrderField VolumeTraded(int VolumeTraded) {
		this.io.setIntField(this, 36, VolumeTraded);
		return this;
	}
	/// \u5269\u4f59\u6570\u91cf
	@Field(37) 
	public int VolumeTotal() {
		return this.io.getIntField(this, 37);
	}
	/// \u5269\u4f59\u6570\u91cf
	@Field(37) 
	public CThostFtdcOrderField VolumeTotal(int VolumeTotal) {
		this.io.setIntField(this, 37, VolumeTotal);
		return this;
	}
	/// \u62a5\u5355\u65e5\u671f
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 38);
	}
	/// \u59d4\u6258\u65f6\u95f4
	@Array({9}) 
	@Field(39) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 39);
	}
	/// \u6fc0\u6d3b\u65f6\u95f4
	@Array({9}) 
	@Field(40) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 40);
	}
	/// \u6302\u8d77\u65f6\u95f4
	@Array({9}) 
	@Field(41) 
	public Pointer<Byte > SuspendTime() {
		return this.io.getPointerField(this, 41);
	}
	/// \u6700\u540e\u4fee\u6539\u65f6\u95f4
	@Array({9}) 
	@Field(42) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 42);
	}
	/// \u64a4\u9500\u65f6\u95f4
	@Array({9}) 
	@Field(43) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 43);
	}
	/// \u6700\u540e\u4fee\u6539\u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	@Array({21}) 
	@Field(44) 
	public Pointer<Byte > ActiveTraderID() {
		return this.io.getPointerField(this, 44);
	}
	/// \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7
	@Array({11}) 
	@Field(45) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 45);
	}
	/// \u5e8f\u53f7
	@Field(46) 
	public int SequenceNo() {
		return this.io.getIntField(this, 46);
	}
	/// \u5e8f\u53f7
	@Field(46) 
	public CThostFtdcOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 46, SequenceNo);
		return this;
	}
	/// \u524d\u7f6e\u7f16\u53f7
	@Field(47) 
	public int FrontID() {
		return this.io.getIntField(this, 47);
	}
	/// \u524d\u7f6e\u7f16\u53f7
	@Field(47) 
	public CThostFtdcOrderField FrontID(int FrontID) {
		this.io.setIntField(this, 47, FrontID);
		return this;
	}
	/// \u4f1a\u8bdd\u7f16\u53f7
	@Field(48) 
	public int SessionID() {
		return this.io.getIntField(this, 48);
	}
	/// \u4f1a\u8bdd\u7f16\u53f7
	@Field(48) 
	public CThostFtdcOrderField SessionID(int SessionID) {
		this.io.setIntField(this, 48, SessionID);
		return this;
	}
	/// \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f
	@Array({11}) 
	@Field(49) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 49);
	}
	/// \u72b6\u6001\u4fe1\u606f
	@Array({81}) 
	@Field(50) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 50);
	}
	/// \u7528\u6237\u5f3a\u8bc4\u6807\u5fd7
	@Field(51) 
	public int UserForceClose() {
		return this.io.getIntField(this, 51);
	}
	/// \u7528\u6237\u5f3a\u8bc4\u6807\u5fd7
	@Field(51) 
	public CThostFtdcOrderField UserForceClose(int UserForceClose) {
		this.io.setIntField(this, 51, UserForceClose);
		return this;
	}
	/// \u64cd\u4f5c\u7528\u6237\u4ee3\u7801
	@Array({16}) 
	@Field(52) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 52);
	}
	/// \u7ecf\u7eaa\u516c\u53f8\u62a5\u5355\u7f16\u53f7
	@Field(53) 
	public int BrokerOrderSeq() {
		return this.io.getIntField(this, 53);
	}
	/// \u7ecf\u7eaa\u516c\u53f8\u62a5\u5355\u7f16\u53f7
	@Field(53) 
	public CThostFtdcOrderField BrokerOrderSeq(int BrokerOrderSeq) {
		this.io.setIntField(this, 53, BrokerOrderSeq);
		return this;
	}
	/// \u76f8\u5173\u62a5\u5355
	@Array({21}) 
	@Field(54) 
	public Pointer<Byte > RelativeOrderSysID() {
		return this.io.getPointerField(this, 54);
	}
	/// \u90d1\u5546\u6240\u6210\u4ea4\u6570\u91cf
	@Field(55) 
	public int ZCETotalTradedVolume() {
		return this.io.getIntField(this, 55);
	}
	/// \u90d1\u5546\u6240\u6210\u4ea4\u6570\u91cf
	@Field(55) 
	public CThostFtdcOrderField ZCETotalTradedVolume(int ZCETotalTradedVolume) {
		this.io.setIntField(this, 55, ZCETotalTradedVolume);
		return this;
	}
	/// \u4e92\u6362\u5355\u6807\u5fd7
	@Field(56) 
	public int IsSwapOrder() {
		return this.io.getIntField(this, 56);
	}
	/// \u4e92\u6362\u5355\u6807\u5fd7
	@Field(56) 
	public CThostFtdcOrderField IsSwapOrder(int IsSwapOrder) {
		this.io.setIntField(this, 56, IsSwapOrder);
		return this;
	}
	public CThostFtdcOrderField(Pointer pointer) {
		super(pointer);
	}
}