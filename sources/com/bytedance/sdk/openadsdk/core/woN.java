package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.vwr;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface woN<T> {

    /* loaded from: classes.dex */
    public interface lMd {
        void zp(int i9, String str);

        void zp(vwr.lMd lmd);
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(int i9, String str);

        void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd);
    }

    com.bytedance.sdk.component.adexpress.zp.KS.zp zp();

    com.bytedance.sdk.openadsdk.lMd.COT zp(JSONObject jSONObject);

    com.bytedance.sdk.openadsdk.lMd.COT zp(JSONObject jSONObject, String str, boolean z8);

    void zp(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, int i9, zp zpVar);

    void zp(String str);

    void zp(String str, List<FilterWord> list, String str2, String str3);

    void zp(JSONObject jSONObject, lMd lmd);

    void zp(JSONObject jSONObject, String str);
}
