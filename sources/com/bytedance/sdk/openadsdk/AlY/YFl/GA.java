package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA implements com.bytedance.sdk.openadsdk.pDU.Sg {
    private final boolean Sg;
    private final com.bytedance.sdk.component.vc.YFl.vc.AlY YFl;

    public GA(boolean z10, com.bytedance.sdk.component.vc.YFl.vc.AlY alY) {
        this.YFl = alY;
        this.Sg = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
    @Nullable
    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
        int i10;
        if (this.YFl == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.Sg);
        jSONObject.put("url", this.YFl.Sg());
        int AlY = this.YFl.AlY();
        if (AlY <= 0) {
            AlY = 0;
        }
        jSONObject.put("retry_times", AlY);
        jSONObject.put("ad_id", this.YFl.vc());
        jSONObject.put("track_type", this.YFl.wN());
        if (this.Sg) {
            if (this.YFl.nc()) {
                i10 = 3;
            } else if (this.YFl.AlY() <= 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 4;
        }
        jSONObject.put("upload_scene", i10);
        String DSW = this.YFl.DSW();
        if (!TextUtils.isEmpty(DSW)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : DSW.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String NjR = this.YFl.NjR();
        if (!TextUtils.isEmpty(NjR)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : NjR.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("track_link_result").Sg(jSONObject.toString());
    }
}
