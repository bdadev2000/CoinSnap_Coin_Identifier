package com.bytedance.adsdk.Sg.AlY;

import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public enum tN {
    JSON(".json"),
    ZIP(".zip");

    public final String tN;

    tN(String str) {
        this.tN = str;
    }

    public String YFl() {
        return ".temp" + this.tN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.tN;
    }
}
