package com.bytedance.sdk.openadsdk.multipro.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    public boolean AlY;
    public long DSW;
    public boolean Sg;
    public boolean YFl;
    public boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    public long f10775vc;
    public long wN;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0135YFl {
        YFl vc();
    }

    public YFl AlY(boolean z10) {
        this.tN = z10;
        return this;
    }

    public YFl Sg(boolean z10) {
        this.YFl = z10;
        return this;
    }

    public YFl YFl(boolean z10) {
        this.AlY = z10;
        return this;
    }

    public YFl tN(boolean z10) {
        this.Sg = z10;
        return this;
    }

    public YFl Sg(long j3) {
        this.f10775vc = j3;
        return this;
    }

    public YFl YFl(long j3) {
        this.wN = j3;
        return this;
    }

    public YFl tN(long j3) {
        this.DSW = j3;
        return this;
    }

    public JSONObject YFl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.YFl);
            jSONObject.put("isFromVideoDetailPage", this.Sg);
            jSONObject.put("isFromDetailPage", this.tN);
            jSONObject.put("duration", this.wN);
            jSONObject.put("totalPlayDuration", this.f10775vc);
            jSONObject.put("currentPlayPosition", this.DSW);
            jSONObject.put("isAutoPlay", this.AlY);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static YFl YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        YFl yFl = new YFl();
        yFl.Sg(jSONObject.optBoolean("isCompleted"));
        yFl.tN(jSONObject.optBoolean("isFromVideoDetailPage"));
        yFl.AlY(jSONObject.optBoolean("isFromDetailPage"));
        yFl.YFl(jSONObject.optLong("duration"));
        yFl.Sg(jSONObject.optLong("totalPlayDuration"));
        yFl.tN(jSONObject.optLong("currentPlayPosition"));
        yFl.YFl(jSONObject.optBoolean("isAutoPlay"));
        return yFl;
    }
}
