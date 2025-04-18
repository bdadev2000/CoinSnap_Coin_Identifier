package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc implements tN {
    private int AlY;
    private long Sg;
    private String YFl;
    private long tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10512vc;
    private String wN;

    public void Sg(long j3) {
        this.tN = j3;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void tN(String str) {
        this.f10512vc = str;
    }

    public void Sg(String str) {
        this.wN = str;
    }

    public void YFl(long j3) {
        this.Sg = j3;
    }

    public void YFl(int i10) {
        this.AlY = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.YFl);
            jSONObject.put("preload_size", this.Sg);
            jSONObject.put("load_time", this.tN);
            jSONObject.put("error_code", this.AlY);
            jSONObject.put("error_message", this.wN);
            jSONObject.put("error_message_server", this.f10512vc);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
