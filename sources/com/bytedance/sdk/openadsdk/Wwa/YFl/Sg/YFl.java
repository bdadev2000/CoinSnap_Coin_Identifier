package com.bytedance.sdk.openadsdk.Wwa.YFl.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.tN;

/* loaded from: classes.dex */
public class YFl {
    private static volatile YFl Sg;
    private String YFl = "";

    private YFl() {
    }

    public static YFl YFl() {
        if (Sg == null) {
            synchronized (YFl.class) {
                if (Sg == null) {
                    Sg = new YFl();
                }
            }
        }
        return Sg;
    }

    public String Sg() {
        if (!lG.AlY().dXO("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.YFl)) {
            return this.YFl;
        }
        String Sg2 = tN.YFl(lG.YFl()).Sg("gaid", "");
        this.YFl = Sg2;
        return Sg2;
    }

    public void Sg(String str) {
        this.YFl = str;
    }

    public static void YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        tN.YFl(lG.YFl()).YFl("gaid", str);
    }
}
