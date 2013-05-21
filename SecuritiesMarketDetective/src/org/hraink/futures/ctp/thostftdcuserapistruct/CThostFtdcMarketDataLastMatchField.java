package org.hraink.futures.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcMarketDataLastMatchField extends StructObject {
	public CThostFtdcMarketDataLastMatchField() {
		super();
	}
	/// \u6700\u65b0\u4ef7
	@Field(0) 
	public double LastPrice() {
		return this.io.getDoubleField(this, 0);
	}
	/// \u6700\u65b0\u4ef7
	@Field(0) 
	public CThostFtdcMarketDataLastMatchField LastPrice(double LastPrice) {
		this.io.setDoubleField(this, 0, LastPrice);
		return this;
	}
	/// \u6570\u91cf
	@Field(1) 
	public int Volume() {
		return this.io.getIntField(this, 1);
	}
	/// \u6570\u91cf
	@Field(1) 
	public CThostFtdcMarketDataLastMatchField Volume(int Volume) {
		this.io.setIntField(this, 1, Volume);
		return this;
	}
	/// \u6210\u4ea4\u91d1\u989d
	@Field(2) 
	public double Turnover() {
		return this.io.getDoubleField(this, 2);
	}
	/// \u6210\u4ea4\u91d1\u989d
	@Field(2) 
	public CThostFtdcMarketDataLastMatchField Turnover(double Turnover) {
		this.io.setDoubleField(this, 2, Turnover);
		return this;
	}
	/// \u6301\u4ed3\u91cf
	@Field(3) 
	public double OpenInterest() {
		return this.io.getDoubleField(this, 3);
	}
	/// \u6301\u4ed3\u91cf
	@Field(3) 
	public CThostFtdcMarketDataLastMatchField OpenInterest(double OpenInterest) {
		this.io.setDoubleField(this, 3, OpenInterest);
		return this;
	}
	public CThostFtdcMarketDataLastMatchField(Pointer pointer) {
		super(pointer);
	}
}