package com.bytedance.sdk.openadsdk.eT.YFl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private final hQ YFl;

    public qsH(hQ hQVar) {
        this.YFl = hQVar;
    }

    public static void YFl(lG lGVar, hQ hQVar) {
        lGVar.YFl("overlayRenderFinish", new qsH(hQVar));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    @Nullable
    public JSONObject YFl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        this.YFl.YoT();
        return null;
    }
}
