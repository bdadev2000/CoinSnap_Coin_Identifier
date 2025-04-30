package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj {
    private Bj COT;
    private JSONObject KS;
    private Bj jU;
    private int lMd;
    private com.bytedance.adsdk.ugeno.component.lMd zp;

    public JSONObject KS() {
        return this.KS;
    }

    public Bj jU() {
        return this.jU;
    }

    public int lMd() {
        return this.lMd;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.zp + ", mEventType=" + this.lMd + ", mEvent=" + this.KS + '}';
    }

    public com.bytedance.adsdk.ugeno.component.lMd zp() {
        return this.zp;
    }

    public void lMd(Bj bj) {
        this.COT = bj;
    }

    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd) {
        this.zp = lmd;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    public void zp(JSONObject jSONObject) {
        this.KS = jSONObject;
    }

    public void zp(Bj bj) {
        this.jU = bj;
    }
}
