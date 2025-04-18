package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;
import p5.b;

/* loaded from: classes.dex */
public class pDU implements tN {
    private final int AlY;
    private long Sg;
    private long YFl;
    private final int tN;
    private final String wN;

    public pDU(b bVar) {
        this.tN = bVar.a;
        this.AlY = bVar.f23474b;
        this.wN = bVar.f23475c;
    }

    public void Sg(long j3) {
        this.Sg = j3;
    }

    public void YFl(long j3) {
        this.YFl = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.YFl);
            jSONObject.put("total_duration", this.Sg);
            jSONObject.put("error_code", this.tN);
            jSONObject.put("extra_error_code", this.AlY);
            jSONObject.put("error_message", this.wN);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("PlayErrorModel", th2.getMessage());
        }
    }
}
