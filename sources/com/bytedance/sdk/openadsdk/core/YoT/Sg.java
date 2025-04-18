package com.bytedance.sdk.openadsdk.core.YoT;

import com.bytedance.sdk.openadsdk.core.YoT.tN.YFl;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends tN {
    private long eT;

    /* renamed from: nc, reason: collision with root package name */
    private long f10651nc;

    public Sg(int i10, int i11, long j3, long j10, YFl.EnumC0119YFl enumC0119YFl, YFl.Sg sg2, String str, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list2, String str2) {
        super(i10, i11, enumC0119YFl, sg2, str, list, list2, str2);
        this.f10651nc = j3;
        this.eT = j10;
        this.NjR = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.tN
    public JSONObject YFl() throws JSONException {
        JSONObject YFl = super.YFl();
        if (YFl != null) {
            YFl.put("offset", this.f10651nc);
            YFl.put("duration", this.eT);
        }
        return YFl;
    }

    public static Sg YFl(JSONObject jSONObject) {
        tN Sg = tN.Sg(jSONObject);
        if (Sg == null) {
            return null;
        }
        return new Sg(Sg.YFl, Sg.Sg, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), Sg.tN, Sg.AlY, Sg.wN, Sg.f10660vc, Sg.DSW, Sg.qsH);
    }
}
