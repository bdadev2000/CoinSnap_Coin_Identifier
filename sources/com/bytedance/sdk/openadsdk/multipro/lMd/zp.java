package com.bytedance.sdk.openadsdk.multipro.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    public long COT;
    public long HWF;
    public boolean KS;
    public long QR;
    public boolean jU;
    public boolean lMd;
    public boolean zp;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0125zp {
        zp HWF();
    }

    public zp KS(boolean z8) {
        this.lMd = z8;
        return this;
    }

    public zp jU(boolean z8) {
        this.KS = z8;
        return this;
    }

    public zp lMd(boolean z8) {
        this.zp = z8;
        return this;
    }

    public zp zp(boolean z8) {
        this.jU = z8;
        return this;
    }

    public zp KS(long j7) {
        this.QR = j7;
        return this;
    }

    public zp lMd(long j7) {
        this.HWF = j7;
        return this;
    }

    public zp zp(long j7) {
        this.COT = j7;
        return this;
    }

    public JSONObject zp() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.zp);
            jSONObject.put("isFromVideoDetailPage", this.lMd);
            jSONObject.put("isFromDetailPage", this.KS);
            jSONObject.put("duration", this.COT);
            jSONObject.put("totalPlayDuration", this.HWF);
            jSONObject.put("currentPlayPosition", this.QR);
            jSONObject.put("isAutoPlay", this.jU);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static zp zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zp zpVar = new zp();
        zpVar.lMd(jSONObject.optBoolean("isCompleted"));
        zpVar.KS(jSONObject.optBoolean("isFromVideoDetailPage"));
        zpVar.jU(jSONObject.optBoolean("isFromDetailPage"));
        zpVar.zp(jSONObject.optLong("duration"));
        zpVar.lMd(jSONObject.optLong("totalPlayDuration"));
        zpVar.KS(jSONObject.optLong("currentPlayPosition"));
        zpVar.zp(jSONObject.optBoolean("isAutoPlay"));
        return zpVar;
    }
}
