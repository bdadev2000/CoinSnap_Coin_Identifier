package com.bytedance.adsdk.lottie;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* loaded from: classes.dex */
public class pvr {
    private boolean lMd;
    private final Map<String, String> zp;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String lMd(String str, String str2) {
        if (this.lMd && this.zp.containsKey(str2)) {
            return this.zp.get(str2);
        }
        String zp = zp(str, str2);
        if (this.lMd) {
            this.zp.put(str2, zp);
        }
        return zp;
    }

    public String zp(String str) {
        return str;
    }

    public String zp(String str, String str2) {
        return zp(str2);
    }
}
