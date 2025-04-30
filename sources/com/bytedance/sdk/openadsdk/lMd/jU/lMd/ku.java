package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku implements KS {
    private int KS;
    private long lMd;
    private long zp;

    public void lMd(long j7) {
        this.lMd = j7;
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    public void zp(int i9) {
        this.KS = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS
    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.zp);
            jSONObject.put("video_cache_size", this.lMd);
            jSONObject.put("is_auto_play", this.KS);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("FeedPlayModel", th.getMessage());
        }
    }
}
