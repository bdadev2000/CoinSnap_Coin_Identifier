package com.bytedance.adsdk.Sg;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* loaded from: classes.dex */
public class aIu {
    private boolean Sg;
    private final Map<String, String> YFl;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String Sg(String str, String str2) {
        if (this.Sg && this.YFl.containsKey(str2)) {
            return this.YFl.get(str2);
        }
        String YFl = YFl(str, str2);
        if (this.Sg) {
            this.YFl.put(str2, YFl);
        }
        return YFl;
    }

    public String YFl(String str) {
        return str;
    }

    public String YFl(String str, String str2) {
        return YFl(str2);
    }
}
