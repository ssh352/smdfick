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

public class CThostFtdcSyncDepositField extends StructObject {
	public CThostFtdcSyncDepositField() {
		super();
	}
	/// \u51fa\u5165\u91d1\u6d41\u6c34\u53f7
	@Array({15}) 
	@Field(0) 
	public Pointer<Byte > DepositSeqNo() {
		return this.io.getPointerField(this, 0);
	}
	/// \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/// \u6295\u8d44\u8005\u4ee3\u7801
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/// \u5165\u91d1\u91d1\u989d
	@Field(3) 
	public double Deposit() {
		return this.io.getDoubleField(this, 3);
	}
	/// \u5165\u91d1\u91d1\u989d
	@Field(3) 
	public CThostFtdcSyncDepositField Deposit(double Deposit) {
		this.io.setDoubleField(this, 3, Deposit);
		return this;
	}
	/// \u662f\u5426\u5f3a\u5236\u8fdb\u884c
	@Field(4) 
	public int IsForce() {
		return this.io.getIntField(this, 4);
	}
	/// \u662f\u5426\u5f3a\u5236\u8fdb\u884c
	@Field(4) 
	public CThostFtdcSyncDepositField IsForce(int IsForce) {
		this.io.setIntField(this, 4, IsForce);
		return this;
	}
	public CThostFtdcSyncDepositField(Pointer pointer) {
		super(pointer);
	}
}