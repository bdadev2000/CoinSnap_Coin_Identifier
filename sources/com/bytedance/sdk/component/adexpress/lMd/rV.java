package com.bytedance.sdk.component.adexpress.lMd;

import android.view.View;

/* loaded from: classes.dex */
public class rV {
    private double Bj;
    private double COT;
    private double HWF;
    private double KS;
    private View KVG;
    private float QR;
    private float YW;
    private boolean dQp;
    private float dT;
    private double jU;
    private float ku;
    private boolean lMd;
    private int rV;
    private String tG;
    private double vDp;
    private int zp;

    public int Bj() {
        return this.rV;
    }

    public double COT() {
        return this.jU;
    }

    public double HWF() {
        return this.COT;
    }

    public boolean KS() {
        return this.lMd;
    }

    public double QR() {
        return this.HWF;
    }

    public double YW() {
        return this.vDp;
    }

    public float dQp() {
        return this.dT;
    }

    public String dT() {
        return this.tG;
    }

    public double jU() {
        return this.KS;
    }

    public double ku() {
        return this.Bj;
    }

    public int lMd() {
        return this.zp;
    }

    public float rV() {
        return this.YW;
    }

    public float tG() {
        return this.ku;
    }

    public float vDp() {
        return this.QR;
    }

    public View zp() {
        return this.KVG;
    }

    public void COT(double d2) {
        this.Bj = d2;
    }

    public void HWF(double d2) {
        this.vDp = d2;
    }

    public void KS(double d2) {
        this.COT = d2;
    }

    public void jU(double d2) {
        this.HWF = d2;
    }

    public void lMd(double d2) {
        this.jU = d2;
    }

    public void zp(View view) {
        this.KVG = view;
    }

    public void KS(float f9) {
        this.YW = f9;
    }

    public void jU(float f9) {
        this.dT = f9;
    }

    public void lMd(int i9) {
        this.rV = i9;
    }

    public void zp(int i9) {
        this.zp = i9;
    }

    public void lMd(float f9) {
        this.ku = f9;
    }

    public void zp(boolean z8) {
        this.lMd = z8;
    }

    public void lMd(boolean z8) {
        if (this.dQp) {
            return;
        }
        this.dQp = z8;
    }

    public void zp(double d2) {
        this.KS = d2;
    }

    public void zp(String str) {
        this.tG = str;
    }

    public void zp(float f9) {
        this.QR = f9;
    }
}
