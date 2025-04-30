package com.bytedance.sdk.openadsdk.component.zp;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.rV.zp.COT;
import java.util.HashMap;

/* loaded from: classes.dex */
public class zp extends com.bytedance.sdk.openadsdk.core.lMd.zp {
    private final com.bytedance.sdk.openadsdk.component.ku.zp zp;

    public zp(@NonNull Context context, @NonNull woN won, @NonNull String str, int i9, com.bytedance.sdk.openadsdk.component.ku.zp zpVar) {
        super(context, won, str, i9);
        this.zp = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        if (view.getTag() == "open_ad_click_button_tag") {
            zp("click_bar");
        } else {
            zp("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(this.zp.lMd()));
        zp(hashMap);
        super.zp(view, f9, f10, f11, f12, sparseArray, z8);
        COT.zp(this.COT, 9);
    }
}
