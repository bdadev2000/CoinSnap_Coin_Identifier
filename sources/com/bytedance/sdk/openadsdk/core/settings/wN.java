package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface wN {
    public static final Sg<JSONObject> YFl = new Sg<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.wN.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public JSONObject Sg(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("ISettingsDataRepository", "", e2);
                return null;
            }
        }
    };
    public static final Sg<Set<String>> Sg = new Sg<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.wN.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Set<String> Sg(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("ISettingsDataRepository", "", e2);
            }
            return hashSet;
        }
    };

    /* loaded from: classes.dex */
    public interface Sg<T> {
        T Sg(String str);
    }

    /* loaded from: classes.dex */
    public interface YFl {
        YFl YFl(String str);

        YFl YFl(String str, float f10);

        YFl YFl(String str, int i10);

        YFl YFl(String str, long j3);

        YFl YFl(String str, String str2);

        YFl YFl(String str, boolean z10);

        void YFl();
    }

    void YFl(JSONObject jSONObject);
}
