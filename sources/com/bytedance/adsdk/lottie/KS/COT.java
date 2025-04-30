package com.bytedance.adsdk.lottie.KS;

import com.bytedance.adsdk.lottie.tG;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class COT {
    private static final COT zp = new COT();
    private final tG<String, com.bytedance.adsdk.lottie.HWF> lMd = new tG<>(20);

    public static COT zp() {
        return zp;
    }

    public com.bytedance.adsdk.lottie.HWF zp(String str) {
        if (str == null) {
            return null;
        }
        return this.lMd.zp((tG<String, com.bytedance.adsdk.lottie.HWF>) str);
    }

    public void zp(String str, com.bytedance.adsdk.lottie.HWF hwf) {
        if (str == null) {
            return;
        }
        this.lMd.zp(str, hwf);
    }
}
