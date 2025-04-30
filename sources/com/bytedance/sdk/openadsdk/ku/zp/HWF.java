package com.bytedance.sdk.openadsdk.ku.zp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF extends com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject> {
    private final RCv zp;

    public HWF(RCv rCv) {
        this.zp = rCv;
    }

    public static void zp(woN won, RCv rCv) {
        won.zp("overlayRenderFinish", new HWF(rCv));
    }

    @Override // com.bytedance.sdk.component.zp.COT
    @Nullable
    public JSONObject zp(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        this.zp.vDp();
        return null;
    }
}
