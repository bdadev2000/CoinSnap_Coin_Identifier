package com.bytedance.sdk.openadsdk.component.reward;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lG;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
class GA {
    private final HashSet<String> Sg = new HashSet<>();
    private final String YFl;

    public GA(String str) {
        this.YFl = TextUtils.isEmpty(str) ? "" : str;
    }

    private String qsH(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return a.n(new StringBuilder(), this.YFl, "_cache_", str);
    }

    public boolean AlY(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "has_played", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    public void DSW(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str));
            this.Sg.remove(str);
        } catch (Throwable unused) {
        }
    }

    public String Sg(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg(qsH(str), "req_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String YFl(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg(qsH(str), "material_data", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public long tN(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "create_time", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public boolean vc(String str) {
        String Sg;
        try {
            Sg = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg(qsH(str), "in_use_process", "");
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(Sg)) {
            return false;
        }
        if (Sg.equals(lG.Sg(com.bytedance.sdk.openadsdk.core.lG.YFl())) && !this.Sg.contains(str)) {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "in_use_process", "");
            return false;
        }
        return true;
    }

    public void wN(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "in_use_process", lG.Sg(com.bytedance.sdk.openadsdk.core.lG.YFl()));
            this.Sg.add(str);
        } catch (Throwable unused) {
        }
    }

    public void YFl(String str, String str2, String str3) {
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "has_played", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "create_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "material_data", str2);
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "in_use_process", "");
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(qsH(str), "req_id", str3);
            this.Sg.remove(str);
        } catch (Throwable unused) {
        }
    }
}
