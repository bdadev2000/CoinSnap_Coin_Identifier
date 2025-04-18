package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.aIu;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface qO<T> {

    /* loaded from: classes.dex */
    public interface Sg {
        void YFl(int i10, String str);

        void YFl(aIu.Sg sg2);
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(int i10, String str);

        void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2);
    }

    com.bytedance.sdk.component.adexpress.YFl.tN.YFl YFl();

    com.bytedance.sdk.openadsdk.AlY.wN YFl(JSONObject jSONObject);

    com.bytedance.sdk.openadsdk.AlY.wN YFl(JSONObject jSONObject, String str, boolean z10);

    void YFl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.aIu aiu, int i10, YFl yFl);

    void YFl(String str);

    void YFl(String str, List<FilterWord> list, String str2, String str3, String str4);

    void YFl(JSONObject jSONObject, Sg sg2);

    void YFl(JSONObject jSONObject, String str);
}
