package com.bytedance.adsdk.Sg.tN;

import com.bytedance.adsdk.Sg.pDU;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class wN {
    private static final wN YFl = new wN();
    private final pDU<String, com.bytedance.adsdk.Sg.DSW> Sg = new pDU<>(20);

    public static wN YFl() {
        return YFl;
    }

    public com.bytedance.adsdk.Sg.DSW YFl(String str) {
        if (str == null) {
            return null;
        }
        return this.Sg.YFl((pDU<String, com.bytedance.adsdk.Sg.DSW>) str);
    }

    public void YFl(String str, com.bytedance.adsdk.Sg.DSW dsw) {
        if (str == null) {
            return;
        }
        this.Sg.YFl(str, dsw);
    }
}
