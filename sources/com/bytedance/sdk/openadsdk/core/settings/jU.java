package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface jU {
    public static final lMd<JSONObject> zp = new lMd<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.jU.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public JSONObject lMd(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("ISettingsDataRepository", "", e4);
                return null;
            }
        }
    };
    public static final lMd<Set<String>> lMd = new lMd<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.jU.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Set<String> lMd(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    hashSet.add(jSONArray.getString(i9));
                }
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("ISettingsDataRepository", "", e4);
            }
            return hashSet;
        }
    };

    /* loaded from: classes.dex */
    public interface lMd<T> {
        T lMd(String str);
    }

    /* loaded from: classes.dex */
    public interface zp {
        zp zp(String str);

        zp zp(String str, float f9);

        zp zp(String str, int i9);

        zp zp(String str, long j7);

        zp zp(String str, String str2);

        zp zp(String str, boolean z8);

        void zp();
    }

    void zp(JSONObject jSONObject);
}
