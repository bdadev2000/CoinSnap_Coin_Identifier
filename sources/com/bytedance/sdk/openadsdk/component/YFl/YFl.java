package com.bytedance.sdk.openadsdk.component.YFl;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.util.HashMap;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.Sg.YFl {
    private final com.bytedance.sdk.openadsdk.component.qsH.YFl YFl;

    public YFl(@NonNull Context context, @NonNull Wwa wwa, @NonNull String str, int i10, com.bytedance.sdk.openadsdk.component.qsH.YFl yFl) {
        super(context, wwa, str, i10);
        this.YFl = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            YFl("click_bar");
        } else {
            YFl("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(this.YFl.Sg()));
        YFl(hashMap);
        super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
        wN.YFl(((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).f10642vc, 9);
    }
}
