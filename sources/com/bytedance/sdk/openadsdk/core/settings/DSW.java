package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW {
    public boolean AlY;
    public String tN;

    /* renamed from: vc, reason: collision with root package name */
    public boolean f10741vc;
    public boolean wN;
    public static final DSW YFl = new DSW(null);
    public static String Sg = "";

    public DSW(String str) {
        this.tN = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.AlY = true;
        this.wN = true;
        this.f10741vc = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString("url", "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.tN = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.optString(i10));
            }
            this.AlY = arrayList.contains("load_finish");
            this.f10741vc = arrayList.contains("load_fail");
            this.wN = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
