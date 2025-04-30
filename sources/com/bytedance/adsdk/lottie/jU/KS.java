package com.bytedance.adsdk.lottie.jU;

import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public enum KS {
    JSON(".json"),
    ZIP(".zip");

    public final String KS;

    KS(String str) {
        this.KS = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.KS;
    }

    public String zp() {
        return ".temp" + this.KS;
    }
}
